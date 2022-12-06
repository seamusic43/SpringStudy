package kr.co.study.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

import kr.co.study.hello.service.BbsService;
import kr.co.study.hello.vo.Article;

@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService bbsService;
    
    @GetMapping("")
    public String index() {
    	return "index";
    }
    
    @GetMapping("/{articleId}")
    @ResponseBody
    public Article viewDetail(@PathVariable String articleId) {
    	System.out.println(articleId);
    	Article article = this.bbsService.viewArticleDetail(articleId);
    	System.out.print(article);
    	return article;
    }
    
    @PostMapping("/write")
    @ResponseBody
    public Article write(@RequestBody Article article) {
    	System.out.print("write test");
    	Article a = article;
    	return a;
    }
    
    /*
    @GetMapping("/{articleId}")
    pubic String viewDetail(@PathVariable String articleId) {
    	
    	System.out.print(articleId + " Get value");
    	return "write_ok";
    
    }
    

    @GetMapping("/write")
    public String write(@RequestParam("author") String name) {
        bbsService.registArticle(new Article());
        System.out.println(name + "Get Request");
        return "write_ok";
    }
    
    @PostMapping("/write")
    public ModelAndView doWrite(Article article) {
    	bbsService.registArticle(article);
        System.out.println("Post request");
        return new ModelAndView("write_ok").addObject(article);
    }
    */
}
