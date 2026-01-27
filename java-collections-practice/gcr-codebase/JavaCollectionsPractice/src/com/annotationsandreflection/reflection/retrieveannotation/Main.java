package com.annotationsandreflection.reflection.retrieveannotation;

public class Main {
    public static void main(String[] args) {

        Class<BookService> cls = BookService.class;

        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}
