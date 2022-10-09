package kr.co.programmersoop.example.section_01_07.equals;

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
}
