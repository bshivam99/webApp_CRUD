package com.Shivam.simpleWebApp.repo;
import com.Shivam.simpleWebApp.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository< product , Integer  > {

}
