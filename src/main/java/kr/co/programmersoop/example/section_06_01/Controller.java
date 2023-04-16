package kr.co.programmersoop.example.section_06_01;

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
}
