package kr.co.programmersoop.example.section_01_08.with_optional;

import java.util.Optional;

public class OptionalAntiPatternExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        Optional<String> string = mapRepository.getOptionalValue("NOT_EXIST_KEY");

        if(string.isPresent())
            System.out.println(string.get().toUpperCase());
        else
            throw new RuntimeException("키가 존재하지 않습니다.");
    }
}
