package com.example.demo4.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.model.Login;




public interface LoginRepo extends JpaRepository<Login,String>{
    
}