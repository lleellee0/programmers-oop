package kr.co.programmersoop.example.section_04_05.a_integrated_interface;

public class ArticleRepository implements Repository {
    @Override
    public void createUser() {
        // do nothing
    }

    @Override
    public User findUserById(Long id) {
        // do nothing
        return null;
    }

    @Override
    public void createArticle() {
        // 의미 있는 어떤 로직
    }

    @Override
    public Article findArticleById(Long id) {
        // 의미 있는 어떤 로직
        return null;
    }
}
