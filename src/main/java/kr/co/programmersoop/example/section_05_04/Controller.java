package kr.co.programmersoop.example.section_05_04;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller extends Service {
    @RequestMapping(value = "/some-api")
    public void someApi() {
        this.createArticle("의미 없는 데이터");
    }
}
