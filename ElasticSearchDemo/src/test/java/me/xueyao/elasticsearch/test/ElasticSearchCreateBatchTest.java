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
 * 批量插入文档
 * @author XueYao
 * @date 2017-11-20
 */
public class ElasticSearchCreateBatchTest {
    /**
     * 批量插入文档
     * @throws Exception
     */
    @Test
    public void testAddDocumentBatch() throws Exception {
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        ObjectMapper objectMapper = new ObjectMapper();
        for (int i = 1; i <= 100; i++) {
            Article article = new Article();
            article.setId(i);
            article.setTitle("我是好人"+i);
            article.setContent("我是一个善良的好人，内容."+i);

            //建立文档
            client.prepareIndex("idx_blog1", "article", article.getId().toString())
                    .setSource(objectMapper.writeValueAsString(article))
                    .get();

        }
        client.close();
        System.out.println("批量插入文档OK....");
    }
}
