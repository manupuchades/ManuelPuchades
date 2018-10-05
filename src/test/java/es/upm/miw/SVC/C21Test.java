package es.upm.miw.SVC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class C21Test {

    @Test
    void m1Test()
    {
        assertEquals( "m1",new C21().m1());
    }
    @Test
    void m2Test()
    {
        assertEquals("m2",new C21().m2());
    }
}
