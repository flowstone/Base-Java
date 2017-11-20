package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * 排序查询
 * @author XueYao
 * @date 2017-11-20
 */
public class LuceneSort {

    @Test
    public void testSort() throws Exception {
        //获取Searcher对象
        IndexSearcher indexSearcher = LuceneUtils.getIndexSearcher();
        //搜索的条件对象Query
        QueryParser parser = new QueryParser("title", new IKAnalyzer());
        //先分词再搜索
        Query query = parser.parse("我是好人");
        /*
        准备排序对象
        @param1 排序依据字段
        @param2 排序字段类型
        @param3 倒序(true)或正序(false)
        */
        Sort sort = new Sort(new SortField("id", SortField.Type.LONG, true));
        //开始搜索
        TopDocs topDocs = indexSearcher.search(query, 10, sort);
        System.out.println("本次共搜索" + topDocs.totalHits + "条数据");
        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            //获得文档编号
            int docID = scoreDoc.doc;
            Document doc = indexSearcher.doc(docID);
            System.out.println("id:" + doc.get("id"));
            //获得没有高亮显示的title
            System.out.println("title:" + doc.get("title"));
            //获得文档的得分
            System.out.println("得分：" + scoreDoc.score);
        }


    }
}
