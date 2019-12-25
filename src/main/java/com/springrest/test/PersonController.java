package com.springrest.test;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping("/person")
    public List<Person> people() {
        String [] pets1 = {"Sid", "Felix"};
        String [] pets2 = {"Mary", "Sable"};
        String [] pets3 = {"Cooper", "Addy", "Fisher"};
        List<Person> people = new ArrayList<>();

        people.add(new Person("Apple", "Seed", 123410, pets1));
        people.add(new Person("Drew", "Maple", 886700, pets2));
        people.add(new Person("Sakura", "Oak", 116720, pets3));
        return people;
    }

}