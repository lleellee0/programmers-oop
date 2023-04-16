package kr.co.programmersoop.example.section_05_04;

import org.springframework.stereotype.Component;

@Component
public class Service extends Repository {
    public void createArticle(String articleContent) {
        this.someMethod(articleContent);
    }
}
