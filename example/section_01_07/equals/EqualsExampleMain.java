package example.section_01_07.equals;

public class EqualsExampleMain {
    public static void main(String[] args) {
        SomeObject sameObject1 = new SomeObject(1, "programmers");
        SomeObject sameObject2 = new SomeObject(1, "programmers");

        SomeObject anotherObject = new SomeObject(100, "foo");

        // 동일성 비교
        System.out.println(sameObject1 == sameObject2);

        // 동등성 비교
        System.out.println(sameObject1.equals(sameObject2));

        // 동등성 비교
        System.out.println(anotherObject.equals(sameObject1));
    }
}
