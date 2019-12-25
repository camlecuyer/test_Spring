package com.springrest.test;

public class Person {
    private String firstName;
    private String lastName;
    private long id;
    private String [] pets;

    public Person(String firstName, String lastName, long id, String [] pets)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.pets =  pets;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public Long getId() { return id; }

    public String [] getPets() { return pets; }
}
