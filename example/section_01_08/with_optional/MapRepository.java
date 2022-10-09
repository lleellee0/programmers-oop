package example.section_01_08.with_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapRepository {

    private Map<String, String> map = new HashMap<>();

    MapRepository() {
        map.put("EXIST_KEY", "value");
    }

    public Optional<String> getValue(String key) {
        return Optional.ofNullable(map.get(key));
    }
}
