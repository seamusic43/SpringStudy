package kr.co.study.hello.dao;

import org.springframework.stereotype.Repository;
import kr.co.study.hello.vo.Article;

@Repository
public class ArticleDAO {
    public void insertArticle(Article article) {
    	System.out.print(article);
        System.out.println("Insert OK");
    }

	public Article selectArticleById(String articleId) {
		// TODO Auto-generated method stub
		Article article = new Article(99, "lee", "테스트 타이틀", "테스트 내용은 없다.");
		return article;
	}

}
