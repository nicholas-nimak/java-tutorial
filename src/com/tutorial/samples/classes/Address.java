package com.tutorial.samples.classes;

public class Address {
    public static void main(String[] args) {
        Address a = new Address(
                "Nicholas",
                "Med.Pechery",
                "39a",
                "1027",
                "Lviv",
                "Ukraine",
                "79035"
        );
        System.out.println(a);
    }
    public String toString() {
        return this.name + " " +
               this.state + " " +
               this.city + " " +
               this.street + " " +
               this.house + " " +
               this.flat + " " +
               this.zipCode;
    }
    private String
            name,
            street,
            house,
            flat,
            city,
            state,
            zipCode;
    private Address(
            String name,
            String street,
            String house,
            String flat,
            String city,
            String state,
            String zipCode
    ) {
        this.name = name;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
