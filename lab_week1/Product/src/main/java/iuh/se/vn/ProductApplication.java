package iuh.se.vn;

import iuh.se.vn.entities.Product;
import iuh.se.vn.repositorires.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (){
        return args -> {
            for (int i = 1; i<=10;i++){
                productRepository.save(new Product(i, "product" + i, 100));
            }
        };
    }

}
