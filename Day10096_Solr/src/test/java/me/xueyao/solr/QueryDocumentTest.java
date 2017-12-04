package me.xueyao.solr;

import me.xueyao.pojo.Item;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-04
 */
public class QueryDocumentTest {
    /**
     * 使用SolrJ查询索引，返回的是Document形式
     * @throws SolrServerException
     */
    @Test
    public void testQueryDocument() throws SolrServerException {
        //连接Solr服务器
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");
        //创建查询对象 SolrQuery
        SolrQuery query = new SolrQuery("title:手机");
        //执行查询，获取响应
        QueryResponse response = server.query(query);
        //获取查询结果，本质是一个document的集合
        SolrDocumentList results = response.getResults();

        System.out.println("本次共搜索到" + results.size() + "条数据");

        for (SolrDocument document : results) {
            System.out.println("id:" + document.getFieldValue("id"));
            System.out.println("title:" + document.getFieldValue("title"));
            System.out.println("price:" + document.getFieldValue("price"));
        }


    }

    /**
     * 使用SolrJ查询索引，返回的是JavaBean形式
     * @throws SolrServerException
     */
    @Test
    public void testQueryBean() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("title:手机");

        QueryResponse response = server.query(query);

        List<Item> list = response.getBeans(Item.class);

        System.out.println("本次搜索到" + list.size() + "条记录");

        for (Item item : list) {
            System.out.println(item);
        }


    }
}
