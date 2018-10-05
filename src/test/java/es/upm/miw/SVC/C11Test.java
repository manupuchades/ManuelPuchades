package es.upm.miw.SVC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C11Test {
    @Test
    void m1Test()
    {
        assertEquals( "m1",new C11().m1());
    }

    void m2Test()
    {
        assertEquals( "m2",new C11().m2());
    }
}
