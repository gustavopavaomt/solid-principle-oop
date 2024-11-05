public class SingleResponsabilityPrinciple {
//Uma classe deve ter apenas uma razão para mudar, ou seja,
// deve ter apenas uma responsabilidade.

    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class UserRepository {
        public void save(User user) {
            // Lógica para salvar o usuário no banco de dados
        }
    }

    class UserService {
        private UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public void registerUser(User user) {
            userRepository.save(user);
            // Outras lógicas relacionadas ao registro
        }
    }

}