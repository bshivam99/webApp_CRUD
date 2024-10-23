package com.Shivam.simpleWebApp.Service;

import com.Shivam.simpleWebApp.model.product;
import com.Shivam.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class productService {

    @Autowired
    ProductRepo repo ;
   /* List<product> products = new ArrayList<>(Arrays.asList(
            new product(101 , "iphone" , 55000) ,
            new product(102 , "realme" , 14000)));*/

    public List<product> getProducts()
    {
        return repo.findAll();
    }


    public product getProdById(int prodId) {
      /*  return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst().get() ;*/
        return repo.findById(prodId).orElse(new product()) ;
    }
    public void addProdU(product prod ) {

       repo.save(prod) ;
    }

    public void setProd(product prod) {
      /*  int index = -1 ;
        for (int i = 0; i <products.size() ; i++)
            if(products.get(i).getId() == prod.getId())
                index = i ;
        products.set(index , prod) ;*/
            repo.save(prod);
    }

    public void delProd(int prod) {
      /*  int index = -1 ;
        for (int i = 0; i <products.size() ; i++)
            if(products.get(i).getId() == prod)
                index = i ;
        products.remove(index);*/
        repo.deleteById(prod);
    }
}
