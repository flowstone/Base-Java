package me.xueyao.elasticsearch.test;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHitField;
import org.elasticsearch.search.SearchHits;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/**
 * 查询
 *
 * @author XueYao
 * @date 2017-11-20
 */
public class ElasticSearchQueryTest {
    /**
     * 普通查询
     * @throws Exception
     */
    @Test
    public void testBaseQuery() throws Exception {
        //创建连接搜索服务器对象
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        //获得搜索结果的响应对象
        //从哪个索引中检索数据
        SearchResponse searchResponse = client.prepareSearch("idx_blog1")
                //检索数据类别，如果不写，则是所有类别
                .setTypes("article")
                //设置查询策略,所有数据
                .setQuery(QueryBuilders.matchAllQuery())
                .get();

        //获得命中的数据信息
        SearchHits hits = searchResponse.getHits();
        System.out.println("+++++查询的结果的总条数：" + hits.getTotalHits() + "，最高分:" + hits.getMaxScore());
        //获得命中的数据元素的集合
        Iterator<SearchHit> searchHitIterator = hits.iterator();
        while (searchHitIterator.hasNext()) {
            //依次检索每个命中对象
            SearchHit searchHit = searchHitIterator.next();
            System.out.println("分数：" + searchHit.getScore());
            System.out.println("文档对象：" + searchHit.getSourceAsString());
            System.out.println("文档的某个字段，如title:" + searchHit.getSource().get("title"));
        }

        client.close();
        System.out.println("普通查询OK...");
    }

    /**
     * 分页查询
     * @throws Exception
     */
    @Test
    public void testPageQuery() throws Exception {
        //创建连接搜索服务器对象
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        //获得搜索结果的响应对象
        //从哪个索引中检索数据
        SearchResponse searchResponse = client.prepareSearch("idx_blog1")
                //检索数据类别，如果不写，则是所有类别
                .setTypes("article")
                //设置查询策略,所有数据
                .setQuery(QueryBuilders.matchAllQuery())
                //起始的行号，默认为0
                .setFrom(10)
                //最大记录数，默认是10
                .setSize(20)
                .get();

        //获得命中的数据信息
        SearchHits hits = searchResponse.getHits();
        System.out.println("+++++查询的结果的总条数：" + hits.getTotalHits() + "，最高分:" + hits.getMaxScore());
        //获得命中的数据元素的集合
        Iterator<SearchHit> searchHitIterator = hits.iterator();
        while (searchHitIterator.hasNext()) {
            //依次检索每个命中对象
            SearchHit searchHit = searchHitIterator.next();
            System.out.println("分数：" + searchHit.getScore());
            System.out.println("文档对象：" + searchHit.getSourceAsString());
            System.out.println("文档的某个字段，如title:" + searchHit.getSource().get("title"));
        }

        client.close();
        System.out.println("分页查询OK...");
    }

    /**
     * 复杂检索规则 查询 默认英文分词器
     * @throws Exception
     */
    @Test
    public void testOtherQuery() throws Exception {
        //创建连接搜索服务器对象
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        //获得搜索结果的响应对象
        //从哪个索引中检索数据
        SearchResponse searchResponse = client.prepareSearch("idx_blog1")
                //检索数据类别，如果不写，则是所有类别
                .setTypes("article")
                //设置查询策略,精确匹配词条查询
                //.setQuery(QueryBuilders.termQuery("title","好人"))
                //词条通配符匹配
                //.setQuery(QueryBuilders.wildcardQuery("title","*我*"))
                //全文检索规则，先分词后匹配所有字段
                .setQuery(QueryBuilders.queryStringQuery("我不是善良的人"))

                .get();

        //获得命中的数据信息
        SearchHits hits = searchResponse.getHits();
        System.out.println("+++++查询的结果的总条数：" + hits.getTotalHits() + "，最高分:" + hits.getMaxScore());
        //获得命中的数据元素的集合
        Iterator<SearchHit> searchHitIterator = hits.iterator();
        while (searchHitIterator.hasNext()) {
            //依次检索每个命中对象
            SearchHit searchHit = searchHitIterator.next();
            System.out.println("分数：" + searchHit.getScore());
            System.out.println("文档对象：" + searchHit.getSourceAsString());
            System.out.println("文档的某个字段，如title:" + searchHit.getSource().get("title"));
        }

        client.close();
        System.out.println("OK...");
    }
}
