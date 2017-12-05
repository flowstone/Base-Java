package me.xueyao.solr.cloud;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

/**
 * @author XueYao
 * @date 2017-12-05
 */
public class QueryIndexTest {
    /**
     * 查询
     * @throws SolrServerException
     */
    @Test
    public void testQuery() throws SolrServerException {
        CloudSolrServer server = new CloudSolrServer("192.168.56.101:2181,192.168.56.102:2181,192.168.56.103:2181");

        QueryResponse response = server.query(new SolrQuery("title:今天"));
        SolrDocumentList results = response.getResults();
        for (SolrDocument result : results) {
            System.out.println("id:"+result.getFieldValue("id"));
            System.out.println("title:" + result.getFieldValue("title"));

        }

    }
}
