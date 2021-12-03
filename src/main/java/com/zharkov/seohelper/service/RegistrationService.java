package com.zharkov.seohelper.service;

import com.zharkov.seohelper.model.Person;
import com.zharkov.seohelper.model.UserForm;
import com.zharkov.seohelper.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class RegistrationService {

    private PersonRepository personRepository;


    @Autowired
    public RegistrationService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public boolean registration(@RequestBody UserForm userForm) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
       /* if (!emailDataChecker(userForm.getEmail())) {
            Person person = new Person(
                    userForm.getLogin(),
                    userForm.getEmail(),
                    passwordEncoder.encode(userForm.getPassword())
            );
            personRepository.save(person);
            return true;
        } else
            return false;*/

        System.out.println(userForm.toString());
        return true;
    }

    private boolean emailDataChecker(String email) {
        Optional<Person> byEmail = personRepository.findByEmail(email);
        return byEmail.isPresent();
    }

}
