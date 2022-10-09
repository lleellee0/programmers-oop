package kr.co.programmersoop.example.section_01_07.to_string;

public class SomeObject {
    private int intField;
    private String stringField;

    public SomeObject(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
