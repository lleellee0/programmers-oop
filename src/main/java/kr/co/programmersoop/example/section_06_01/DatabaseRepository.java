package kr.co.programmersoop.example.section_06_01;

import org.springframework.stereotype.Component;

@Component
public class DatabaseRepository implements Repository {
    @Override
    public void someMethod(String articleContent) {
        System.out.println("DatabaseRepository");
    }
}
