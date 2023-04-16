package kr.co.programmersoop.example.section_04_06;

import java.util.NoSuchElementException;

public class Service {
    private Repository repository;

    public Object findById(Long id) {
        Object obj = null;

        try {
            obj = repository.findById(id);
        } catch (RecordNotFoundException recordNotFoundException) {
            // 예외에 대한 처리
        } catch (TextNotFoundException textNotFoundException) {
            // 예외에 대한 처리
        } catch (NoSuchElementException noSuchElementException) {
            // 예외에 대한 처리
        }

        return obj;
    }
}
