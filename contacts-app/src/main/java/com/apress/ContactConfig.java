package com.apress;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactConfig {

    @Bean
    public CommandLineRunner init(ContactRepository contactRepository){
        return args -> {
            contactRepository.save(new Contact("admin","Administrator","1-800-CONTACTS","admin","ADMIN,ACTUATOR",true));

            contactRepository.save(new Contact("sam@email.com","Sam","1-800-CONTACTS","sam","USER,ACTUATOR",true));
            contactRepository.save(new Contact("dan@email.com","Dan","1-800-CONTACTS","dan","USER,ACTUATOR",true));
            contactRepository.save(new Contact("ron@email.com","Ron","1-800-CONTACTS","admin","VIEWER,ACTUATOR",true));
        };
    }
}
