package org.example;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void givenValidNameAndAddress_whenGetBuyer_returnExpectedValues() {
        final String name = "dimas";
        final String address = "Mitte";

        final Buyer buyer = new Buyer( name, address );

        assertThat( buyer.name() ).isEqualTo( "dimas" );
    }

    @Test
    public void givenSameNameAndAddress_whenEquals_thenBuyerEquals() {
        final String name = "dimas";
        final String address = "Mitte";

        final Buyer buyer1 = new Buyer( name, address );
        final Buyer buyer2 = new Buyer( name, address );

        assertThat( buyer1.equals( buyer2 ) ).isTrue();
    }

    @Test
    public void givenSameNameAndAddress_whenHashCode_thenBuyerEqual() {
        final String name = "dimas";
        final String address = "Mitte";

        final Buyer buyer1 = new Buyer( name, address );
        final Buyer buyer2 = new Buyer( name, address );

        System.out.println( buyer1.hashCode() );
        System.out.println( buyer2.hashCode() );

        assertThat( buyer1.hashCode() ).hasSameHashCodeAs( buyer2.hashCode() );
    }

    @Test
    public void toStringTest() {
        final String name = "dimas";
        final String address = "Mitte";

        final Buyer buyer1 = new Buyer( name, address );

        System.out.println( buyer1 );
    }
}
