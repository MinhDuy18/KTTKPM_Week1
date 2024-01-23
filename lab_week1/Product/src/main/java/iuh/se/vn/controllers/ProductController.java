package iuh.se.vn.controllers;

import iuh.se.vn.entities.Product;
import iuh.se.vn.entities.User;
import iuh.se.vn.repositorires.ProductRepository;
import iuh.se.vn.repositorires.UserPeponsitory;
import iuh.se.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserPeponsitory userPeponsitory;

    @Autowired
    private ProductService productService;
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/products")
    public List<Product> getAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    @GetMapping("/users")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = productService.getAllUser();
        List<User> userList1 = new ArrayList<>();

        for (Map<String, Object> userData : userList) {
            // Assuming you have a method to convert a map to a User entity
            User user = mapToUser(userData);
            userList1.add(user);
        }

        // Save all users to the repository
        userPeponsitory.saveAll(userList1);
        return userList;
    }


    private User mapToUser(Map<String, Object> userData) {
        User user = new User();
        return user;
    }
}
