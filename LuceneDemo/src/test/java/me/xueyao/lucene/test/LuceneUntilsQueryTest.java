package me.xueyao.lucene.test;

import me.xueyao.lucene.utils.LuceneUtils;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * @author XueYao
 * @date 2017-11-18
 */
public class LuceneUntilsQueryTest {
    @Test
    public void testQueryOther() throws Exception {
        //String keyword = "好人";
        //通配符匹配的关键字
        String keyword = "好";
        //模糊(相似度)查询的关键字
        //String keyword = "GooD";
        //QueryParser queryParser = new QueryParser("content",new IKAnalyzer());
        //Query query = queryParser.parse(keyword);
        //词条精确匹配
        //Query query = new TermQuery(new Term("content",keyword));
        //通配符匹配    * 代表0或多个字符    ?代表1个字符
        //Query query = new WildcardQuery(new Term("content","*"+keyword+"*"));
        //模糊(相似度)查询
        //Query query = new FuzzyQuery(new Term("content",keyword),2);

        //数值范围
        //参数分别：字段的名字，最小值，最大值，是否包含最小值边界，是否包含最大值边界
        //Query query = NumericRangeQuery.newLongRange("id",103L,104L,true,true);

        //查询所有，忽略所有条件
        //Query query = new MatchAllDocsQuery();

        //组合规则
        BooleanQuery query = new BooleanQuery();
        Query query1 = new TermQuery(new Term("content",keyword));
        Query query2 = new WildcardQuery(new Term("content","*"+keyword+"*"));
        //query.add(query1, BooleanClause.Occur.MUST);
        //query.add(query1, BooleanClause.Occur.MUST_NOT);
        //query.add(query2, BooleanClause.Occur.MUST);
        query.add(query1, BooleanClause.Occur.SHOULD);
        query.add(query2, BooleanClause.Occur.SHOULD);


        LuceneUtils.printTopDocsByQuery(query,Integer.MAX_VALUE);
    }
}
