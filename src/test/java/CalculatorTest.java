import org.junit.jupiter.api.*;
import org.wildfly.common.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

//Junit reports:
    //mvn clean install
    //mvn site
    // mvn surefire-report:report


    @Test
    void assertAllTest() {
        Calculator calc = new Calculator();
        assertAll(
                () -> assertEquals(100, calc.add(1,1), "Doesn't add two positive numbers properly"),
                () -> assertEquals(100, calc.add(-1,1), "Doesn't add a negative and a positive number properly"),
                () -> assertNotNull(calc, "The calc variable should be initialized")
        );
    }


    //Assumptions:
//    boolean aBoolean;
//
//    @BeforeEach
//    void init() {
//        aBoolean = false;
//        calculator = new Calculator();
//    }
//    @Test
//    void addTest() {
//        Assumptions.assumeTrue(aBoolean, "Java sees this assumption isn't true -> stop executing the test.");
//        Assertions.assertAll(
//                () -> assertEquals(2, calculator.add(1,1), "Doesn't add two positive numbers properly"),
//                () -> assertEquals(0, calculator.add(-1, 1), "Doesn't add a negative and a positive number properly"),
//                () -> assertNotNull(calculator, "The calculator variable should be initialize")
//        );
//    }


//Assertion:
//    @BeforeAll
//    static void setUp() {
//        this.calculator = new Calculator(); //????
//    }

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(8, calculator.add(3, 5));
    }

    @Test
    public void addTestNotEquals() {
        Assertions.assertNotEquals(2, calculator.add(3, 5));
    }

    @Test
    public void testFalse() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5.2, calculator.add(1.2, 3.0));
    }


}