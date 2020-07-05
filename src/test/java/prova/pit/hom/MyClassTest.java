package prova.pit.hom;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MyClassTest {
    MyClass sut;

    @BeforeEach
    public void createSut(){
        sut = new MyClass();
    }

    @Test
    public void testApositiveTrue1() {
        assertTrue(sut.myMethod(1, true));
    }

    @Test
    public void testApositiveTrue2() {
        assertTrue(sut.myMethod(2, true));
    }

    @Test
    public void testApositiveFalse1() {
        assertTrue(sut.myMethod(1, false));
    }
    @Test
    public void testApositiveFalse2() {
        assertTrue(sut.myMethod(2, false));
    }

    @Test
    public void testAzeroFalse(){
        assertFalse(sut.myMethod(0, false));
    }
    @Test
    public void testAzeroTrue(){
        assertTrue(sut.myMethod(0, true));
    }

    @Test
    public void testAnegativeTrue(){
        assertTrue(sut.myMethod(-2, true));
    }
    @Test
    public void testAnegativeFalse(){
        assertFalse(sut.myMethod(-3, false));
    }
}
