package kr.co.programmersoop.example.section_03_04.b_spring_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class FileRepository implements Repository {
    @Override
    public void someMethod(String articleContent) {
        System.out.println("FileRepository");
    }
}
