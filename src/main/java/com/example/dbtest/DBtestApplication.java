package com.example.dbtest;

import com.example.dbtest.model.Person;
import com.example.dbtest.repsoitory.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DBtestApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext configurableApplicationContext=
            SpringApplication.run(DBtestApplication.class, args);
        PersonRepository personRepository =
                configurableApplicationContext.getBean(PersonRepository.class);

        Person myPerson = new Person("John", "Doe");
        Person my2ndPerson = new Person("Afro", "Jack");
        personRepository.save(myPerson);
        personRepository.save(my2ndPerson);
    }

}
