import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
   private Calculator calculator;

    //Assertion:
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
        Assertions.assertNotEquals(5.2, calculator.add(1.2, 3.0));
    }

    @Test
    void assertAllTest() {
        Calculator calc = new Calculator();
        assertAll(
                () -> assertNotEquals(100, calc.add(1, 1), "Doesn't add two positive numbers properly"),
                () -> assertNotEquals(100, calc.add(-1, 1), "Doesn't add a negative and a positive number properly"),
                () -> assertNotNull(calc, "The calc variable should be initialized")
        );
    }


    //Assumptions:
    boolean aBoolean;

    @BeforeEach
    void init() {
        aBoolean = true;
        calculator = new Calculator();
    }
    @Test
    void addTestAll() {
        Assumptions.assumeTrue(aBoolean, "Java sees this assumption isn't true -> stop executing the test.");
        Assertions.assertAll(
                () -> assertEquals(2, calculator.add(1,1), "Doesn't add two positive numbers properly"),
                () -> assertEquals(0, calculator.add(-1, 1), "Doesn't add a negative and a positive number properly"),
                () -> assertNotNull(calculator, "The calculator variable should be initialize")
        );
    }


    @AfterAll
    static void afterAll() {
        System.out.println("Print after all");
    }
}