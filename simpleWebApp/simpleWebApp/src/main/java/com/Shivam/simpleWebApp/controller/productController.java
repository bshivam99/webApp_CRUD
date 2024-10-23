package com.Shivam.simpleWebApp.controller;

import com.Shivam.simpleWebApp.Service.productService;
import com.Shivam.simpleWebApp.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {


    @Autowired
    productService service ;
    @GetMapping("/products")
    public List<product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public product getProdById(@PathVariable int prodId){

        return service.getProdById(prodId);
    }

    @PostMapping("/products")
    public void addProd(@RequestBody product prod ){
        System.out.println(prod);
        service.addProdU(prod); ;
    }

    @PutMapping("/products")
    public void setProd(@RequestBody product prod ){
        service.setProd(prod) ;
    }

    @DeleteMapping("/products/{prodId}")
    public void delProd(@PathVariable int prodId ){
        service.delProd( prodId) ;
    }

}
