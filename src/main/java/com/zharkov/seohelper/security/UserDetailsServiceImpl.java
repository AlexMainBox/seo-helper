package com.zharkov.seohelper.security;

import com.zharkov.seohelper.model.Person;
import com.zharkov.seohelper.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PersonRepository repository;

    @Autowired
    public UserDetailsServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        Person person = repository.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException("User not found!")
        );
        return UserSecurity.fromPerson(person);
    }
}
