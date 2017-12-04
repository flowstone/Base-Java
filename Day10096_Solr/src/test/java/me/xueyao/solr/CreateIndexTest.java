package me.xueyao.solr;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

/**
 * @author XueYao
 * @date 2017-12-03
 */
public class CreateIndexTest {
    /**
     * 以Document形式添加或修改数据
     * @throws IOException
     * @throws SolrServerException
     */
    @Test
    public void testCreateIndex() throws IOException, SolrServerException {
        //连接服务器
        SolrServer server =  new HttpSolrServer("http://localhost:8080/solr/core2");
        //创建solr的输入document
        SolrInputDocument document = new SolrInputDocument();
        //添加字段
        document.addField("id","17386");
        //document.addField("title","宝马X6，你值得拥有");
        document.addField("title","丰田EA86，一代神车，谁送我一辆");
        document.addField("price",1999999);
        //添加document到server
        server.add(document);
        //提交请求，如果id不存在则创建数据，如果存在则修改数据
        server.commit();

    }
}
