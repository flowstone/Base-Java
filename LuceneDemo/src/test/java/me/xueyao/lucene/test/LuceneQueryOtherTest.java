package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.junit.Test;

/**
 * 搜索结果排名
 * @author XueYao
 * @date 2017-11-20
 */
public class LuceneQueryOtherTest {

    /**
     * 批量插入
     * @throws Exception
     */
    @Test
    public void testCreateIndexBatch() throws Exception {
        IndexWriter indexWriter = LuceneUtils.getIndexWriter();
        for (int i = 1; i < 10; i++) {
            Document document = new Document();

            document.add(new LongField("id",i, Field.Store.YES));
            document.add(new TextField("title","如何做一个好人"+i, Field.Store.YES));
            document.add(new StringField("author","小明"+i, Field.Store.YES));
            TextField contentField = new TextField("content", "我是一个好人,Good Man." + i, Field.Store.YES);

            if (i == 8) {
                contentField.setBoost(10.0f);
            }
            document.add(contentField);
            indexWriter.addDocument(document);
        }
        indexWriter.close();
    }

    /**
     * 查询测试
     * @throws Exception
     */
    @Test
    public void testQueryOther() throws Exception {
        String keyword = "好人";
        Query query = new TermQuery(new Term("content", keyword));
        LuceneUtils.printTopDocsByQuery(query,Integer.MAX_VALUE);
    }
}
