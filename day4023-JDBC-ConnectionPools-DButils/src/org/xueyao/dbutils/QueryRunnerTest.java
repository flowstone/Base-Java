package org.xueyao.dbutils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;
import org.xueyao.util.JdbcUtils2;

/**
 * @author Yao Xue
 * @date Aug 17, 2017 2:36:22 PM
 */
public class QueryRunnerTest {
    /**
     * BeanHandler(重点): 结果集处理的一种方式
     *      使用格式: new BeanHandler<泛型>(类型)
     *      将第一条数据封装到一个javaBean中
     * @throws SQLException
     */
    @Test
    public void beanHandlerTest() throws SQLException {
        QueryRunner queryRunner =  new QueryRunner(JdbcUtils2.getDataSource());
        
        String sql = "SELECT * FROM product";
        //调用query
        Product query = queryRunner.query(sql,new BeanHandler<Product>(Product.class));
        System.out.println(query);
    }
    /**
     * beanListHandler(重点):
     *      使用格式: new BeanListHandler<泛型>(类型)
     *      将所有数据封装到javabean的集合中
     * @throws SQLException
     */
    @Test
    public void beanListHandlerTest() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        
        String sql = "SELECT * FROM product";
        //调用query
        List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        
        for (Product product : list) {
            System.out.println(product);
        }
    }
    /**
     * ScalarHandler(重点):
     *      将一个值的数据进行封装.
     *      一般用于聚合函数.count(*)是常用 的,返回值必须是Long
     * @throws SQLException
     */
    @Test
    public void ScalarHandlerTest() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT COUNT(*) FROM product";
        Long query = queryRunner.query(sql,new ScalarHandler<Long>());
        System.out.println(query);
    }
    /**
     * mapHandler:
     *      将第一条数据封装成map集合
     *      key就是列名,value就是列对应的值
     * @throws SQLException
     */
    @Test
    public void MapHandlerTest() throws SQLException {
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new  QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        Map<String, Object> query = queryRunner.query(sql,new MapHandler());
        System.out.println(query);
    }
    /**
     * mapListHandlerTest:
     *      将所有的商品封装成list集合,list集合中每一个都是map集合
     *      map集全的key就是别名,值就是列对应的值
     * @throws SQLException
     */
    @Test
    public void MapListHandlerTest() throws SQLException {
        //首先创建一个queryHandler对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        List<Map<String,Object>> query = queryRunner.query(sql,new MapListHandler());
        for (Map<String, Object> map: query) {
            System.out.println(map);
        }
    }
    /**
     * arrayHandler:
     *      将第一条数据封装成数组,数组中的每个值都是列中的值
     * @throws SQLException
     */
    @Test
    public void arrayHandlerTest() throws SQLException {
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        Object[] query = queryRunner.query(sql, new ArrayHandler());
        System.out.println(Arrays.toString(query));
    }
    
    /**
     * arrayListHandler:
     *      将所有的数据封装成一个list集合,集合中的每一个对象老师数组.每一个数组对应了一条数据
     * @throws SQLException
     */
    @Test
    public void arrayListHandlerTest() throws SQLException {
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        List<Object[]> query = queryRunner.query(sql,new ArrayListHandler());
        for (Object[] objects : query) {
            System.out.println(Arrays.toString(objects));
        }
    }
    
    /**
     * keyedHandler:
     *      将所有的结果封装成一个map集合
     *      key就是制定列的值
     *      value就是每一条数据被封装成的map集合,key是列名,值就是列对应的值
     * 
     * new KeyedHandler<T>(columName)
     * T:指的就是列对应的数据类型
     * columName: 制定的列的名称,如果不指定列,那么就默认的取第一列
     * @throws SQLException
     */
    
    @Test
    public void keyedHandlerTest() throws SQLException {
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        Map<String,Map<String,Object>> query = queryRunner.query(sql,new KeyedHandler<String>("category_id"));
        
        for (Map.Entry<String,Map<String,Object>> e : query.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    
    /**
     * columnListHandler:
     *      将制定列中的所有值封装成list集合
     * new ColumnListHandler<T>(columnName)
     * T:列的类型对应java中的数据类型
     * columnName:指定的表中的列名,如果不指定列名,那么默认的就是第一个列
     * @throws SQLException
     */
    @Test
    public void columnListHandlerTest() throws SQLException {
        //首先创建一个queryRunner对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils2.getDataSource());
        String sql = "SELECT * FROM product";
        List<String> query = queryRunner.query(sql, new ColumnListHandler<String>("pname"));
        for (String integer : query) {
            System.out.println(integer);
        }
    }
}
