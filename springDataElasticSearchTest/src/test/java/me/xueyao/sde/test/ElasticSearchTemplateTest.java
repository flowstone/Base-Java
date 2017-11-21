package me.xueyao.sde.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/**
 * 伪代码不可运行
 * @author XueYao
 * @date 2017-11-21
 */
public class ElasticSearchTemplateTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Test
    public void test() {
        //创建索引
        elasticsearchTemplate.createIndex("blog4");
        //删除索引
        elasticsearchTemplate.deleteIndex("blog4");

        /*@param1:查询规则
        * @param2:封闭后的类型
        * */
        //elasticsearchTemplate.queryForList(query,clazz);
    }
}
