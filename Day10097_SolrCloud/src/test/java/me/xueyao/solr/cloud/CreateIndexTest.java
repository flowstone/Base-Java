package me.xueyao.solr.cloud;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-12-05
 */
public class CreateIndexTest {
    /**
     * 写入或更新索引
     * @throws IOException
     * @throws SolrServerException
     */
    @Test
    public void testWrite() throws IOException, SolrServerException {

        CloudSolrServer server = new CloudSolrServer("192.168.56.101:2181,192.168.56.102:2181,192.168.56.103:2181");
        server.setDefaultCollection("collection1");
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id","1002");
        document.addField("title","华硕电脑，你值得拥有");

        server.add(document);
        server.commit();
    }
}
