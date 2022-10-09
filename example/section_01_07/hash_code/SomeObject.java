package example.section_01_07.hash_code;

import java.util.Objects;

public class SomeObject {
    private int intField;
    private String stringField;

    public SomeObject(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeObject that = (SomeObject) o;
        return intField == that.intField && Objects.equals(stringField, that.stringField);
    }

//    hashCode가 오버라이딩 되고 안되고의 차이
//    @Override
//    public int hashCode() {
//        return Objects.hash(intField, stringField);
//    }
}
