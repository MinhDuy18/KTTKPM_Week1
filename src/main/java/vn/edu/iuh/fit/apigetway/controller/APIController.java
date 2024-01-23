package vn.edu.iuh.fit.apigetway.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.apigetway.service.APIGetAwayService;


import java.util.List;
import java.util.Map;

@RestController
public class APIController {

@Autowired
private APIGetAwayService apiGetAwayService;

    @GetMapping("/listUser")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = apiGetAwayService.getAllUser();
        return userList;
    }

    @GetMapping("/listProduct")
    public List<Map<String, Object>> getAllProduct(){
        List<Map<String, Object>> productList = apiGetAwayService.getAllProduct();
        return productList;
    }
}
