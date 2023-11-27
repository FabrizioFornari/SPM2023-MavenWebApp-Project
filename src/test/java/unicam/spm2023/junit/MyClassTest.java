package unicam.spm2023.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import unicam.spm2023.MyClass;

public class MyClassTest {

    @Test
    //@Disabled
    public void testMultiply() {
        MyClass tester = new MyClass();
        assertEquals(50, tester.multiply(10, 5));
    }
}