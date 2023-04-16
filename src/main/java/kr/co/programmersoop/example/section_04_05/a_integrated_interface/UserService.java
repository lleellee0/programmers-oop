package kr.co.programmersoop.example.section_04_05.a_integrated_interface;

public class UserService {
    private Repository repository = new UserRepository();

    public void createUser() {
        repository.createUser();
    }

    public User findByUser(Long id) {
        return repository.findUserById(id);
    }
}