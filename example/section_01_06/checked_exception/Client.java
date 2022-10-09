package example.section_01_06.checked_exception;

public class Client {
    public void throwsCheckedExceptionMethod() throws CheckedException {
        throw new CheckedException();
    }

    public void tryCatchCheckedExceptionMethod() {
        try {
            throw new CheckedException();
        } catch (CheckedException e) {
            // 예외에 대한 적절한 처리
            e.printStackTrace();
        }
    }
}
