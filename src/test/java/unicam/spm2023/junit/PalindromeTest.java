package unicam.spm2023.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import unicam.spm2023.Palindrome;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


class PalindromeTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    @Disabled
    void test() {
        fail("Not yet implemented");
    }

    @ParameterizedTest
    @Disabled
    @ValueSource(strings = { "pippo" , "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {

        assertTrue(Palindrome.isPalindrome(candidate));
    }


}
