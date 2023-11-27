package unicam.spm2023.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.EnabledOnOs;
import unicam.spm2023.HelloWorld;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

import java.util.logging.Logger;

public class HelloWorldTest {

    private HelloWorld hW;
    private String inputNumber;

    //To prove when code gets executed
    private final static Logger LOGGER = Logger.getLogger("HelloWorldTest");

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        LOGGER.info("@BeforeAll - executes once before all test methods in this class");
//		Thread.sleep(1000);
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        LOGGER.info("@AfterAll - executes once after all test methods in this class");
//		Thread.sleep(1000);
    }

    @BeforeEach
    void setUp() throws Exception {
        hW = new HelloWorld();
//		Thread.sleep(1000);
        LOGGER.info("@BeforeEach - executes before each test methods in this class");
    }

    @AfterEach
    void tearDown() throws Exception {
        hW = null;
//		Thread.sleep(1000);
        LOGGER.info("@AfterEach - executes after each test methods in this class");
    }

    @Test
    @Disabled
    void testHelloShouldNotReturnNull() {
        assertNotNull(HelloWorld.hello());
    }

    @Test
    //@Disabled
    @Tag("display")
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    }

    @Test
    //@Disabled
    @Tag("display")
    @DisplayName(" (°□°） ")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    //@Disabled
    @Tag("display")
    @DisplayName("😈")
    void testWithDisplayNameContainingEmoji() {
    }

    @Test
    //@Disabled
    @DisplayName("Custom testNumber")
    void testNumber() {
        inputNumber = hW.printNumber(3);
        assertEquals(inputNumber, "n: " + 3);
    }

    @DisplayName("Custom testNumberFizz")
    //@Disabled
    @Test
    void testNumberFizz() {
        inputNumber = hW.printNumber(7);
        assertNotEquals(inputNumber, "Fizz");
    }

    @Test
        //@Disabled
    void testName() throws Exception {

    }

    @Test
    @DisplayName("😈")
    @Disabled
    void testMain() {
        fail("Not yet implemented");
    }

    @Test
    @Disabled
    void failingTest() {
        fail("Not yet implemented");
    }

    @Test
    //@Disabled
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {
        HelloWorld tester = new HelloWorld();
        tester.getOS().equals("Mac OS X");
    }

    @Test
    @EnabledOnOs(WINDOWS)
    void onlyOnWindowsOs() {
        HelloWorld tester = new HelloWorld();
        tester.getOS().contains("Windows");
    }

    @Test
    //@Disabled
    @EnabledOnOs(LINUX)
    void onlyOnLinuxOs() {
        HelloWorld tester = new HelloWorld();
        tester.getOS().contains("Linux");
    }

    @Test
    //@Disabled
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}