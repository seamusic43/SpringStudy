package kr.co.study.hello.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.study.hello.vo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:*.xml")
public class ArticleDAOTest {
	
	@Autowired
	private ArticleDAO dao;
	
	
	@Test
	public void testInsertArticle() {
		dao.insertArticle(null);
		
	}
	
	
	@Test
	public void testSelectArticleById() {
		Article article = dao.selectArticleById(null);
		
		Assert.assertTrue(article.getAuthor().equals("lee"));
				
	}

}
