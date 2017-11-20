package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.search.*;
import org.junit.Test;

/**
 * Lucene分页
 *
 * @author XueYao
 * @date 2017-11-20
 */
public class LucenePageTest {
    @Test
    public void testPage() throws Exception {
        int pageSize = 2; //每页条数
        int pageNum = 1; //当前页码
        int start = (pageNum - 1) * pageSize; //当前页的起始条数
        int end = start + pageSize;  //当前

        IndexSearcher indexSearcher = LuceneUtils.getIndexSearcher();
        //查询所有
        Query query = new MatchAllDocsQuery();
        //开始搜索
        TopDocs topDocs = indexSearcher.search(query, end);
        System.out.println("本次搜索共" + topDocs.totalHits + "条数据");

        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        for (int i = start; i < end; i++) {
            ScoreDoc scoreDoc = scoreDocs[i];
            int docID = scoreDoc.doc;
            Document doc = indexSearcher.doc(docID);
            System.out.println("id:" + doc.get("id"));
            System.out.println("title:" + doc.get("title"));
        }
    }
}
