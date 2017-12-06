package me.xueyao.solr.cloud;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-12-05
 */
public class DeleteIndexTest {
    /**
     * 根据id删除索引
     * @throws IOException
     * @throws SolrServerException
     */
    @Test
    public void testDeleteByID() throws IOException, SolrServerException {
        CloudSolrServer server = new CloudSolrServer("192.168.56.101:2181,192.168.56.102:2181,192.168.56.103:2181");
        server.setDefaultCollection("core1");
        server.deleteById("1001");

        server.commit();
    }
}
