package me.xueyao.elasticsearch.test;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.highlight.HighlightField;
import org.junit.Test;

import java.net.InetAddress;
import java.util.Map;

/**
 * ElasticSearch 高亮
 *
 * @author XueYao
 * @date 2017-11-21
 */
public class ElasticSearchHighLightTest {
    /**
     *
     */
    @Test
    public void testHighLight() throws Exception {
        Client client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)
                );
        SearchResponse searchResponse = client.prepareSearch("idx_blog1")
            .setTypes("article")
            .setQuery(
                    QueryBuilders.termQuery("title","好人")
            )
                //对哪个字段高亮显示
                .addHighlightedField("title")
                .addHighlightedField("content")
                .setHighlighterPreTags("<em>")
                .setHighlighterPostTags("</em>").get();

        SearchHits hits = searchResponse.getHits();
        System.out.println("查询的结果的总条数" + hits.getTotalHits() + ",最高分：" + hits.getMaxScore());
        /*
        * 遍历命中的数据元素的集合
        * */
        for (SearchHit hit : hits) {
            System.out.println("分数：" + hit.getScore());
            System.out.println("文档对象：" + hit.getSourceAsString());
            System.out.println("文档的某个字段，如title：" + hit.getSource().get("title"));
            //获得到所有的高亮的字段对象Map
            Map<String,HighlightField> highlightFields = hit.getHighlightFields();
            //根据字段获取高亮结果
            HighlightField titleHighlightField =  highlightFields.get("title");

            String titleHighlight="";
            for (Text text : titleHighlightField.getFragments()) {
                //如果片段太长，加省略略
                titleHighlight += text+"...";
            }
            System.out.println("title的高亮结果：" + titleHighlight);
        }

        client.close();
        System.out.println("高亮OK...");
    }
}
