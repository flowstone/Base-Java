package me.xueyao.elasticsearch.test;

import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author XueYao
 * @date 2017-11-20
 */
public class ElasticSearchTest {
    /**
     * 建立索引和删除索引：相当于建表和删除表
     * @throws Exception
     */
    @Test
    public void testCreateIndex() throws Exception {
        //创建连接搜索服务器对象：客户端核心操作对象
        //默认的服务的端口是9300
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        //创建索引，参数索引的名字：类似create table xxx
        client.admin().indices().prepareCreate("idx_blog1").get();
        //删除索引
        //client.admin().indices().prepareDelete("idx_blog1").get();
        //关闭连接
        client.close();
        System.out.println("ok......");
    }

    /**
     * 建立映射
     * @throws Exception
     */
    @Test
    public void testCreateMapping() throws Exception {
        //创建连接搜索服务器对象
        //默认的服务的商品是9300
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        //创建映射属性json ：XContentBuilder工具类，用来组装json对象
        XContentBuilder builder = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("properties")
                .startObject("id")
                .field("type", "integer")
                .field("store", "yes")
                .endObject()
                .startObject("title")
                .field("type", "string")
                .field("store", "yes")
                .endObject()
                .startObject("content")
                .field("type", "string")
                .field("store", "yes")
                .endObject()
                .endObject()
                .endObject();
        //创建映射关系
        //目标：要对哪个索引(表)的哪个类型指定映射规则(将来要分词)
        PutMappingRequest mappingRequest = Requests.putMappingRequest("idx_blog1")
                //指定映射是文档类型，随便写，以后写实体类的类型字符串。表示一类数据
                .type("article")
                .source(builder);
        //执行建立映射
        client.admin().indices().putMapping(mappingRequest).get();
        client.close();
        System.out.println("ok......");
    }
}
