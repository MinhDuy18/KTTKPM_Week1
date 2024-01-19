package iuh.se.vn;

import iuh.se.vn.entities.User;
import iuh.se.vn.repositorires.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (){
        return args -> {
            for (int i = 1; i<=10;i++){
                userRepository.save(new User(i, "user" + i));
            }
        };
    }
}
