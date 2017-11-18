package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.junit.Test;

import java.io.IOException;


/**
 * @author XueYao
 * @date 2017-11-18
 */
public class LuceneUntilsTest {

    @Test
    public void test1() throws IOException {
        Document document = new Document();
        document.add(new LongField("id",104, Field.Store.YES));
        document.add(new TextField("title","如何做好人1", Field.Store.YES));
        document.add(new StringField("author","小明1", Field.Store.YES));
        document.add(new StoredField("email","xueyao.me@gmail.com1"));
        document.add(new TextField("content","如何成为人人称赞的好人1", Field.Store.YES));
        document.add(new TextField("remark","这是一个神奇的标签1", Field.Store.NO));

        IndexWriter indexWriter = LuceneUtils.getIndexWriter();
        indexWriter.addDocument(document);

    }
}
