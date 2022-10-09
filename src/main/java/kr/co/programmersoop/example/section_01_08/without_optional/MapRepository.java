package kr.co.programmersoop.example.section_01_08.without_optional;

import java.util.HashMap;
import java.util.Map;

public class MapRepository {

    private Map<String, String> map = new HashMap<>();

    MapRepository() {
        map.put("EXIST_KEY", "value");
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
