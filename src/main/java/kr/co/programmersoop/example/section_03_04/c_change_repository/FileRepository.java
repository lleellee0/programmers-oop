package kr.co.programmersoop.example.section_03_04.c_change_repository;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class FileRepository implements Repository {
    @Override
    public void someMethod(String articleContent) {
        System.out.println("FileRepository");
    }
}
