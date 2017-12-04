package me.xueyao.solr;

import me.xueyao.pojo.Item;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * SolrQuery对象的高级查询
 * @author XueYao
 * @date 2017-12-04
 */
public class QueryAdvanceTest {

    /**
     * 布尔查询
     * @throws SolrServerException
     */
    @Test
    public void tesetQueryBoolean() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");
        SolrQuery query = new SolrQuery("title:手机 OR title:小米");
        QueryResponse response = server.query(query);
        List<Item> list = response.getBeans(Item.class);

        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            System.out.println(item);
        }

    }

    /**
     * 模糊查询
     * @throws SolrServerException
     */
    @Test
    public void testQueryLike() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("title:vava~2");
        QueryResponse response = server.query(query);
        List<Item> list = response.getBeans(Item.class);
        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            System.out.println(item);
        }

    }

    /**
     * 范围查询
     * @throws SolrServerException
     */
    @Test
    public void testQueryBetween() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("price:[139900 TO 299900]");
        QueryResponse response = server.query(query);
        List<Item> list = response.getBeans(Item.class);
        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            System.out.println(item);
        }

    }

    /**
     * 排序功能
     * @throws SolrServerException
     */
    @Test
    public void testQuerySort() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("title:手机");
        query.setSort("price", SolrQuery.ORDER.asc);
        QueryResponse response = server.query(query);
        List<Item> list = response.getBeans(Item.class);
        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            System.out.println(item);
        }

    }

    /**
     * 实现分页显示
     * @throws SolrServerException
     */
    @Test
    public void testQueryPage() throws SolrServerException {
        int currentPage = 1;//当前页
        final int PAGE_SIZE = 5;//每页显示条数
        int start = (currentPage-1)*PAGE_SIZE;//当前页的起始条数
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("title:手机");
        query.setStart(start);//设置起始条数
        query.setRows(PAGE_SIZE);//设置每页条数
        QueryResponse response = server.query(query);
        List<Item> list = response.getBeans(Item.class);
        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            System.out.println(item);
        }

    }

    /**
     * 实现高亮显示
     * @throws SolrServerException
     */
    @Test
    public void testQueryHighLight() throws SolrServerException {
        SolrServer server = new HttpSolrServer("http://localhost:8080/solr/core2");

        SolrQuery query = new SolrQuery("title:手机");

        query.setHighlightSimplePre("<em>");
        query.setHighlightSimplePost("</em>");

        query.addHighlightField("title");
        QueryResponse response = server.query(query);

        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

        List<Item> list = response.getBeans(Item.class);
        System.out.println("本次搜索到" + list.size() + "条记录");
        for (Item item : list) {
            String id = item.getId();
            System.out.println("id:"+id);
            System.out.println("title:" + highlighting.get(id).get("title").get(0));
            System.out.println("price:" + item.getPrice());
        }

    }
}
