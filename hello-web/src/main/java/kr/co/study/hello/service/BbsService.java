package kr.co.study.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.study.hello.dao.ArticleDAO;
import kr.co.study.hello.exception.BizException;
import kr.co.study.hello.vo.Article;

@Service
public class BbsService {
    @Autowired
    private ArticleDAO articleDAO;
    public void registArticle(Article article) {
        articleDAO.insertArticle(article);
    }
    
    
	public Article viewArticleDetail(String articleId) {	
		return this.articleDAO.selectArticleById(articleId);
	}

    //DI 까지 처리되지 않는다.
    /*
    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

     */
	public void testService() {
		System.out.print("target invoked..." );
		throw new BizException("testService fail...");
	}
}
