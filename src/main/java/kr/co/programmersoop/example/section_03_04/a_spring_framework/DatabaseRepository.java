package kr.co.programmersoop.example.section_03_04.a_spring_framework;

import org.springframework.stereotype.Component;

@Component
public class DatabaseRepository implements Repository {
    @Override
    public void someMethod(String articleContent) {
        System.out.println("DatabaseRepository");
    }
}
