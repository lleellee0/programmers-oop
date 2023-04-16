package kr.co.programmersoop.example.section_04_05.a_integrated_interface;

public class ArticleService {
    private Repository repository = new ArticleRepository();

    public void createArticle() {
        repository.createArticle();
    }

    public Article findByArticle(Long id) {
        return repository.findArticleById(id);
    }
}
