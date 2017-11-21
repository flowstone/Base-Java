package me.xueyao.sde.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

//文章的实体类
/*
* Document: es文档对象的标识
* indexName: 指定索引的名字
* type:文档类型，一般和实体类一样*/
@Document(indexName = "idx_blog5",type = "article")
public class Article {
	@Id //es主键标识
	/*
	* Field：字段属性配置
	* type: 字段类型
	* index： 是否索引，
	* 		analyzed:该字段分词，并索引，可以查询出来
	* 		not_analyzed:不分词，但索引，可以查询出来
	* 		no:不索引，没有词条，不能根据字段查询
	* store: 文档是否保存
	* */
	@Field(type = FieldType.Integer
			,index = FieldIndex.not_analyzed
			,store = true
	)
	private Integer id;
	/* analyzer: 指定文档存储时候的分词器
	* searchAnalyzer: 查询的时候，默认的健忘器*/
	@Field(type = FieldType.String
		,index = FieldIndex.analyzed
			,analyzer = "ik"
			,searchAnalyzer = "ik"
			,store = true
	)
	private String title;

	@Field(type = FieldType.String
	,index = FieldIndex.analyzed
	,analyzer = "ik"
	,searchAnalyzer = "ik"
	,store = true)
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
