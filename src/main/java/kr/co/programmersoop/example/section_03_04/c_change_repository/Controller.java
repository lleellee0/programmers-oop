package kr.co.programmersoop.example.section_03_04.c_change_repository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value = "/some-api")
    public void someApi() {
        service.createArticle("의미 없는 데이터");
    }

    @RequestMapping(value = "/change-repository")
    public void changeToFileRepository() {
        service.changeRepository();
    }
}
