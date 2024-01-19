package iuh.se.vn.controllers;

import iuh.se.vn.entities.Product;
import iuh.se.vn.repositorires.ProductRepository;
import iuh.se.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/api/users")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/products")
    public List<Product> getAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    @GetMapping("/list")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = productService.getAllUser();
        return userList;
    }


}
