package me.xueyao.elasticsearch.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.xueyao.domain.Article;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.junit.Test;

import java.net.InetAddress;

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

    /**
     * 建立映射,中文分词器
     * @throws Exception
     */
    @Test
    public void testCreateMappingIK() throws Exception {
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
                .field("analyzer","ik")
                .endObject()
                .startObject("content")
                .field("type", "string")
                .field("store", "yes")
                .field("analyzer","ik")
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
    /**
     * 文档的创建
     * @throws Exception
     */
    @Test
    public void testCreateDocument() throws Exception {
        //创建连接搜索服务器对象
        //默认的服务器的商品9300
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        Article article = new Article();
        article.setId(1001);
        article.setTitle("我是好人3");
        article.setContent("我是一个善良的好人，内容3...");
        //引用jackson包
        ObjectMapper objectMapper = new ObjectMapper();
        /*
        * 建立文档
        * @param1 索引表的名字
        * @param2 文档类型
        * @param3 文档的主键，如果不指定，则默认生成随机索引主键，如果指定，
        * 则索引主键和业务主键一样*/
        client.prepareIndex("idx_blog1", "article", article.getId().toString())
                //往往文档json：将java对象序列化为json字符串
                .setSource(objectMapper.writeValueAsString(article))
                .get();

        client.close();
        System.out.println("ok.....");
    }

    /**
     * 文档的更新
     * @throws Exception
     */
    @Test
    public void testUpdateDocument() throws Exception {
        //创建连接搜索服务器对象
        //默认的服务器的商品9300
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        Article article = new Article();
        article.setId(1001);
        article.setTitle("我是好人4");
        article.setContent("我是一个善良的好人，内容4...");
        //引用jackson包
        ObjectMapper objectMapper = new ObjectMapper();
        /*
        * 更新文档：底层先删除，再添加
        * @param1 索引表的名字
        * @param2 文档类型
        * @param3 文档的主键，如果不指定，则默认生成随机索引主键，如果指定，
        * 则索引主键和业务主键一样*/
        client.prepareUpdate("idx_blog1", "article", article.getId().toString())
                //往往文档json：将java对象序列化为json字符串
                .setDoc(objectMapper.writeValueAsString(article))
                .get();

        client.close();
        System.out.println("ok.....");
    }

    /**
     * 文档删除
     * @throws Exception
     */
    @Test
    public void testDeleteDocument() throws Exception {
        //创建连接搜索服务器对象
        //默认的服务器的商品9300
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        Article article = new Article();
        article.setId(1001);

        /*
        * 删除文档
        * @param1 索引表的名字
        * @param2 文档类型
        * @param3 文档的主键，如果不指定，则默认生成随机索引主键，如果指定，
        * 则索引主键和业务主键一样*/
        client.prepareDelete("idx_blog1", "article", article.getId().toString())
                .get();

        client.close();
        System.out.println("ok.....");
    }
}
