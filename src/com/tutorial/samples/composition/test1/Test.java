package com.tutorial.samples.composition.test1;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Human("Sam", "Sea Wolf"));
        System.out.println(new Human("Miranda", "Flowers for Algernon"));
    }
}

class Book {
    private String title;
    Book(String t) {
        title = t;
    }

    @Override
    public String toString() {
        return title;
    }
}

class Human {
    private String name;
    private Book favoriteBook;
    Human(String n, String t) {
        name = n;
        favoriteBook = new Book(t);
    }

    @Override
    public String toString() {
        return name + " favorite book is " + "'" + favoriteBook + "'";
    }
}