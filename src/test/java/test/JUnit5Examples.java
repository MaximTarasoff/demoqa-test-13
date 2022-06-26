package test;

import org.junit.jupiter.api.*;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("== Something before ALL tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("= Something before each tests =");
    }

    @AfterEach
    void afterEach() {
        System.out.println("= Something after each tests =====");
    }

    @Test
    void firstTest() {
        System.out.println("=========Started first test");
    }

    @Test
    void secondTest() {
        System.out.println("==========Started first test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("== Something after ALL tests");
    }


}
