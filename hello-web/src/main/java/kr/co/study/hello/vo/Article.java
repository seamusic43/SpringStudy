package kr.co.study.hello.vo;

public class Article {
    private int articleId;
    private String author;
    private String title;
    private String content;

    public Article() {}
    public Article(int articleId, String author, String title, String content) {
        super();
        this.articleId = articleId;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getArticleId() {
        return articleId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

