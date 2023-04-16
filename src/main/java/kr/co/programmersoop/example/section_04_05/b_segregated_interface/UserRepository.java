package kr.co.programmersoop.example.section_04_05.b_segregated_interface;

public class UserRepository implements UserRepositoryInterface {
    @Override
    public void createUser() {
        // 의미 있는 어떤 로직
    }

    @Override
    public User findUserById(Long id) {
        // 의미 있는 어떤 로직
        return null;
    }
}
