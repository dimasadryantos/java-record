package org.example;


import java.util.Objects;


public class Person {

    private final String name;

    public Person( final String name ) {
        this.name = name;
    }

    @Override
    public boolean equals( final Object object ) {
        if( this == object ) {
            return true;
        }
        if( !( object instanceof final Person person ) ) {
            return false;
        }
        return Objects.equals( getName(), person.getName() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getName() );
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               '}';
    }
}