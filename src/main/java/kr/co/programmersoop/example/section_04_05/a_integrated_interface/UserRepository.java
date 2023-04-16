package kr.co.programmersoop.example.section_04_05.a_integrated_interface;

public class UserRepository implements Repository {
    @Override
    public void createUser() {
        // 의미 있는 어떤 로직
    }

    @Override
    public User findUserById(Long id) {
        // 의미 있는 어떤 로직
        return null;
    }

    @Override
    public void createArticle() {
        // do nothing
    }

    @Override
    public Article findArticleById(Long id) {
        // do nothing
        return null;
    }
}
