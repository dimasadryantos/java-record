package org.example;


import java.util.Objects;


public record Buyer(String name, String address) {

    public static final String DEFAULT_NAME = "Setyawan";

    public Buyer() {
        Objects.requireNonNull( name );
        Objects.requireNonNull( address );
    }

    //compact constructor

//    public Buyer( String name, String address ) {
//        Objects.requireNonNull( name );
//        Objects.requireNonNull( address );
//        this.name = name;
//        this.address = address;
//    }

    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printMe() {
        System.out.println( "Get a coffee" );
    }
}
