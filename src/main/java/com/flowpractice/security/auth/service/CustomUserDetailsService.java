package com.flowpractice.security.auth.service;

import com.flowpractice.security.auth.model.SecurityCustomer;
import com.flowpractice.security.model.entity.Customer;
import com.flowpractice.security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    // === ACA: Otro metodo si necesitamos ===
    // Ejemplo: signupNewUser(UserDTO newUser){}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> myList = customerRepository.findByEmail(username);
        if(myList.isEmpty()){
            throw new UsernameNotFoundException("User Details NOT FOUND for username: " + username);
        }
        return new SecurityCustomer(myList.get(0));
    }

}

