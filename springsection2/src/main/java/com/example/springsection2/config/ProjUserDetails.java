package com.example.springsection2.config;

import com.example.springsection2.model.Customer;
import com.example.springsection2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class ProjUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if(customer.size()==0){
            throw new UsernameNotFoundException("user Details not found for the user: "+username);
        }

        return new SecurityCustomer(customer.get(0));
    }
}
