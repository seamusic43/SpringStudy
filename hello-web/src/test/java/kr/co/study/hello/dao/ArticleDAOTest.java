package kr.co.study.hello.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import kr.co.study.hello.vo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/**.xml"})
public class ArticleDAOTest {
	
	@Autowired(required=true)
	private ArticleDAO dao;

	
	@Test
	public void testInsertArticle() {
		Article article = new Article(3,"choi", "제발 좀 되라","흑흑흑 왜 안되니");
		dao.insertArticle(article);
		
	}
	
	
	@Test
	public void testSelectArticleById() {
		Article article = dao.selectArticleById(null);
		
		Assert.assertTrue(article.getAuthor().equals("lee"));
				
	}

}
