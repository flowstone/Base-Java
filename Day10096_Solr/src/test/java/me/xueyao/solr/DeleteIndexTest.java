package me.xueyao.solr;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-12-04
 */
public class DeleteIndexTest {

    /**
     * 根据id删除
     * @throws IOException
     * @throws SolrServerException
     */
    @Test
    public void testDeleteIndexById() throws IOException, SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        //根据id删除索引
        server.deleteById("10086311");
        server.commit();
    }

    @Test
    public void testDeleteIndexByQuery() throws IOException, SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        server.deleteByQuery("title:iphone");
        server.commit();
    }
}
