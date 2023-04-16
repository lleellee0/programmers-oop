package kr.co.programmersoop.example.section_05_04;

import org.springframework.stereotype.Component;

@Component
public class Repository  {
    public void someMethod(String articleContent) {
        System.out.println("Repository");
    }
}
