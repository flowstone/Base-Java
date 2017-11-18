package me.xueyao.lucene.test;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;

/**
 * 全文搜索Lucene
 * @author XueYao
 * @date 2017-11-18
 */
public class LuceneTest {
    /**
     * 创建索引
     * @throws IOException
     */
    @Test
    public void luceneTest() throws IOException {
        //创建Document文档(相当一条数据)
        Document document = new Document();
        //在文档中加入field字段
        /**
         * @param1 字段名
         * @param2 字段值
         * @param3 是否存储
         */
        document.add(new LongField("id",101, Field.Store.YES));
        //TextField自动分词
        document.add(new TextField("title","学习", Field.Store.YES));
        //StringField不分词
        document.add(new StringField("author","小明", Field.Store.YES));
        //只存储和显示，不能搜索
        document.add(new StoredField("email","xueyao.me@gmail.com"));
        document.add(new TextField("content","Good Good Coding, Day Day Up!", Field.Store.YES));
        //创建索引存放目录对象
        Directory directory = FSDirectory.open(new File("indexDir"));
        //索引的写的配置对象
        /**
         * @param1 lucene的版本
         * @param2 分词器
         */
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(Version.LATEST,new StandardAnalyzer());
        //创建一个写的对象
        /**
         * @param1 索引存放目录
         * @param2 索引配置对象
         */
        IndexWriter indexWriter = new IndexWriter(directory,indexWriterConfig);
        //将文档增加到索引中
        indexWriter.addDocument(document);
        //释放资源
        indexWriter.close();
    }

    /**
     * 中文分词工具
     */
    @Test
    public void createIndexByIkTest() throws IOException {
        Document document = new Document();

        document.add(new StringField("id","001", Field.Store.YES));
        document.add(new TextField("title","明天", Field.Store.YES));
        document.add(new StringField("author","小明", Field.Store.YES));
        document.add(new StoredField("mail","xueyao.me@gmail.com"));
        document.add(new TextField("content","如果没有明天，你现在最想做什么事情", Field.Store.YES));
        document.add((new TextField("remark","我是备注", Field.Store.NO)));
        Directory directory = FSDirectory.open(new File("indexDir"));

        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(Version.LATEST, new IKAnalyzer());

        IndexWriter indexWriter = new IndexWriter(directory, indexWriterConfig);

        indexWriter.addDocument(document);
        indexWriter.close();

    }
}
