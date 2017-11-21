package me.xueyao.elasticsearch.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.xueyao.domain.Article;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 默认自动建立索引和映射
 * @author XueYao
 * @date 2017-11-21
 */
public class ElasticSearchAutoIndexAndMappingTest {

    /**
     * 直接插入文档，自动创建索引和映射
     * @throws Exception
     */
    @Test
    public void testIndexMapping() throws Exception {
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        Article article = new Article();
        article.setId(1001);
        article.setTitle("我是好人3");
        article.setContent("我是一个善良的好人3");

        ObjectMapper objectMapper = new ObjectMapper();
        /*
        * 建立文档
        * @param1 索引表的名字
        * @param2 文档类型
        * @param3 文档的主键，不指定，则默认*/
        client.prepareIndex("idx_blog2","article",article.getId().toString())
                //放入文档中json：将java对象序列化为json字符串
                .setSource(objectMapper.writeValueAsString(article))
                .get();

        client.close();
        System.out.println("ok...");
    }
}
