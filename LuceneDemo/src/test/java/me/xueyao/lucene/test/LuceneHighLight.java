package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.*;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * Lucene高亮显示
 * @author XueYao
 * @date 2017-11-20
 */
public class LuceneHighLight {
    /**
     * 高亮显示测试
     */
    @Test
    public void testHighLight() throws Exception {
        //获取Searcher对象
        IndexSearcher indexSearcher = LuceneUtils.getIndexSearcher();
        //搜索的条件对象Query
        QueryParser parser = new QueryParser("title",new IKAnalyzer());
        //先分词再搜索
        Query query = parser.parse("我是好人");
        //创建一个高亮工具对象
        /*
        * 格式化器
        * @param1 前置标签
        * @param2 后置标签
         */
        Formatter formatter  = new SimpleHTMLFormatter("<em>","</em>");
        //打分对象
        Scorer scorer = new QueryScorer(query);
        //准备高亮工具
        Highlighter highlighter = new Highlighter(formatter,scorer);

        //开始搜索
        TopDocs topDocs = indexSearcher.search(query, 10);
        System.out.println("本次搜索共：" + topDocs.totalHits + "条数据");

        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        for (ScoreDoc scoreDoc : scoreDocs) {
            //获取文档编号
            int docID = scoreDoc.doc;
            Document doc = indexSearcher.doc(docID);
            System.out.println("id:" + doc.get("id"));
            //获取没有高亮显示的title
            String title = doc.get("title");
            //用高亮工具处理普通的查询结果
            /*
            * @param1 分词器
            * @param2 要高亮的字段的名称
            * @param3 高亮字段的原始值(替换过程)
             */
            String hTitle =  highlighter.getBestFragment(new IKAnalyzer(),"title",title);
            System.out.println("title:" + hTitle);
            System.out.println("得分:" + scoreDoc.score);
        }
    }
}
