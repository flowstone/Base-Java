package me.xueyao.solr;

import me.xueyao.pojo.Item;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-12-04
 */
public class CreateIndexBeanTest {

    /**
     * 直接通过SolrServer添加JavaBean
     * @throws IOException
     * @throws SolrServerException
     */
    @Test
    public void testCreateIndexBean() throws IOException, SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        Item item = new Item();
        item.setId("10086311");
        item.setTitle("永久版自行车真好");
        item.setPrice(135603L);

        server.addBean(item);
        server.commit();
    }
}
