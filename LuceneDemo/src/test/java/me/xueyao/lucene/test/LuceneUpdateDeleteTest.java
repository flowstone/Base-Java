package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-11-18
 */
public class LuceneUpdateDeleteTest {

    /**
     * 索引的更新
     * @throws IOException
     */
    @Test
    public void testUpdate() throws IOException {
        Document document = new Document();
        //TextField自动分词
        document.add(new TextField("title","学习1", Field.Store.YES));
        //StringField不分词
        document.add(new StringField("author","小明1", Field.Store.YES));
        //只存储和显示，不能搜索
        document.add(new StoredField("email","xueyao.me@gmail.com"));
        document.add(new TextField("content","Goods Goods Coded, Day Day Up!", Field.Store.YES));

        IndexWriter indexWriter = LuceneUtils.getIndexWriter();
        /**
         * @description bug 如果业务主键数据类型不是字符串，可能会出错，
         * 因此建议业务中主键存放到索引中的时候，都转成字符串
         */
        indexWriter.updateDocument(new Term("id","001"),document);
    }

    /**
     * 索引的删除
     * @throws IOException
     */
    @Test
    public void testDelete() throws IOException {
        IndexWriter indexWriter = LuceneUtils.getIndexWriter();
        indexWriter.deleteAll();
    }

}
