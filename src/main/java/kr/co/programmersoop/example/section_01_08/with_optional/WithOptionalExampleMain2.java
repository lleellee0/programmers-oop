package kr.co.programmersoop.example.section_01_08.with_optional;

public class WithOptionalExampleMain2 {
    public static void main(String[] args) {
        // 이전 코드보다 간결한 코드
        
        MapRepository mapRepository = new MapRepository();
        String string = mapRepository.getOptionalValue("NOT_EXIST_KEY").orElseThrow(
                () -> {throw new RuntimeException("키가 존재하지 않습니다.");}
        );

        System.out.println(string.toUpperCase());
    }
}
