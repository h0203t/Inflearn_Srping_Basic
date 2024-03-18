package com.example.inflearn_srping_basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    private String name;
    public int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("abcd");

        String name = helloLombok.getName();
        System.out.println("name = " + name);

        int age = helloLombok.getAge();
        System.out.println("age = " + age);
    }
}
