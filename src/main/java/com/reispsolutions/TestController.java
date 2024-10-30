package com.reispsolutions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/people")
    List<People> getAllPeople(){

        List<People> persons = new ArrayList<>();
        People p1 = new People();
        p1.setName("John");
        p1.setLastName("Haunks");
        p1.setAge(25);
        persons.add(p1);

        People p2 = new People();
        p2.setName("Anabel");
        p2.setLastName("Rosado");
        p2.setAge(31);
        persons.add(p2);

        return persons;
    }
}
