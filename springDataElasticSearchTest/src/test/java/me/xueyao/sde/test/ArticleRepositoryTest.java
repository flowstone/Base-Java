package me.xueyao.sde.test;

import me.xueyao.sde.dao.ArticleRepository;
import me.xueyao.sde.domain.Article;
import org.elasticsearch.index.query.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author XueYao
 * @date 2017-11-21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ArticleRepositoryTest {
    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void testSaveOrUpdate() {
        Article article = new Article();
        article.setId(101);
        article.setTitle("我是好人");
        article.setContent("发一张好人卡，我们还可以做朋友，Good Friend");
        articleRepository.save(article);
    }

    /**
     * 删除一个文档
     */
    @Test
    public void testDelete() {
        articleRepository.delete(101);
    }

    @Test
    public void testFindAll() {
        for (Article article : articleRepository.findAll()) {
            System.out.println(article);
        }
    }
    @Test
    public void testFindComplex() {
        //词条精确匹配
        //TermQueryBuilder query = new TermQueryBuilder("title","好人");

        //通配符匹配
        //WildcardQueryBuilder query = new WildcardQueryBuilder("title", "*人*");

        //相似度查询
        //FuzzyQueryBuilder query = new FuzzyQueryBuilder("content", "gaod");

        //全字段匹配，先分词再查询，默认走配置的分词器
        //QueryStringQueryBuilder query = new QueryStringQueryBuilder("坏人");

        //组合匹配
        BoolQueryBuilder query = new BoolQueryBuilder();
        //query.should(queryBuilder); //并集
        //query.must(queryBuilder); //交集
        //query.mustNot(queryBuilder);//补集
        for (Article article : articleRepository.search(query)) {
            System.out.println(article);
        }
    }
}
