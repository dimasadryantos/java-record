package org.example;


/**
 * JAVA Record!
 */
public class App {

    public static void main( String[] args ) {
        Person person = new Person( "dimas" );
        System.out.println( person.getName() );


        Buyer buyer = new Buyer( "dimas", "Mitte" );
        System.out.println( buyer.name() );

        System.out.println(buyer.nameInUpperCase());
        Buyer.printMe();

        System.out.println(buyer.);

    }
}
