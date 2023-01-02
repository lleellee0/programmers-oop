package kr.co.programmersoop.example.section_03_04.c_change_repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    private Repository inUseRepository;
    private Repository spareRepository;

    public Service(List<Repository> repositories) {
        this.inUseRepository = repositories.get(0);
        this.spareRepository = repositories.get(1);
    }

    public void changeRepository() {
        Repository tempRepository = this.inUseRepository;
        this.inUseRepository = this.spareRepository;
        this.spareRepository = tempRepository;

        System.out.println("repository changed");
    }

    public void createArticle(String articleContent) {
        inUseRepository.someMethod(articleContent);
    }
}
