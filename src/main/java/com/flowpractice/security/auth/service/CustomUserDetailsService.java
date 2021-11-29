package com.flowpractice.security.auth.service;

import com.flowpractice.security.auth.model.SecurityUser;
import com.flowpractice.security.model.entity.TestEntity;
import com.flowpractice.security.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private TestRepository testRepository;

    // === ACA: Otro metodo si necesitamos ===
    // Ejemplo: signupNewUser(UserDTO newUser){}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<TestEntity> myList = testRepository.findByEmail(username);
        if(myList.isEmpty()){
            throw new UsernameNotFoundException("User Details NOT FOUND for username: " + username);
        }
        return new SecurityUser(myList.get(0));
    }

}

