package me.xueyao.lucene.test;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;

/**
 * @author XueYao
 * @date 2017-11-18
 */
public class LuceneQueryTest {
    @Test
    public void testBaseQuery() throws Exception {
        //准备查询的关键字
        String keyword = "如何";
        //创建一个查询解析器
        /*
         * @param1: 要查询的字段的名字，必须存在
         * @param2: 分词器，在查询的时候，先将关键字分词，再搜索
         */
        QueryParser queryParser = new QueryParser("content",new IKAnalyzer());
        //解析(分词)后的查询对象
        Query query = queryParser.parse(keyword);
        //索引存放目录对象
        Directory directory = FSDirectory.open(new File("indexDir"));
        //通过目录读对象打开目录，获取索引读对象
        IndexReader indexReader = DirectoryReader.open(directory);
        //创建索引查询的搜索对象(核心对象)，参数索引读对象
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
        //准备搜索
        /*
        @param1 查询条件对象
        @param2 最大显示的结果的条数：
        @return 当前指定数量的所有的文档记录(具有排名效果)结果类似一个集合
         */
        TopDocs topDocs = indexSearcher.search(query,Integer.MAX_VALUE);
        //打印总记录数(命中数):类似于百度为您找到是的结果约为。。。
        System.out.println("查询(命中)总的文档条数" + topDocs.totalHits);
        //获取所有命中查询结果的文档对象集合
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        //打印具体文档
        for (ScoreDoc scoreDoc : scoreDocs) {
            //获取文档的编号(类似索引主键)
            int docId = scoreDoc.doc;
            System.out.println("文档编号：" + docId);
            //获取具体文档
            Document document = indexSearcher.doc(docId);
            System.out.println("id:" + document.get("id"));
            System.out.println("title:" + document.get("title"));
            System.out.println("author:" + document.get("author"));
            System.out.println("email:" + document.get("email"));
            System.out.println("content:" + document.get("content"));
            System.out.println("remark:" + document.get("remark"));
            //取出文档得分
            System.out.println("得分：" + scoreDoc.score);
        }

        //释放资源
        indexReader.close();
    }
}
