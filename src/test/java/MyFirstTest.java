import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    //TODO: Create a test method that uses assertEquals or assertNotEquals
    // to verify if the String Codeup is the same as CodeUp.

    @Test
    public void testIfNameIsEqual() {
        String expected = "Codeup";
        String actual = "CodeUp";

//        assertEquals(expected, actual); //test fails b/c they are not equal
        assertNotEquals(expected, actual); //test passes b/c they are NOT equal
    }




    //TODO: Create a test method that uses assertNotSame to verify
    // that the following ArrayLists are not the same:

    @Test
    public void testIfObjectsAreNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages); //test passes b/c they are NOT the same object
    }



    //TODO: Create a test method that uses assertArrayEquals to verify the following arrays are equal.

    @Test
    public void testIfArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];

        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers); //test passes b/c the arrays are equal
    }


    //TODO: Create a test method that uses both assertFalse and assertTrue to verify the following statements:

    @Test
    public void testIfLanguageContains() {
        String language = "PHP";

        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue("The language contains H",language.contains("H")); //test passes b/c language does have an H
        assertFalse("The language DOES NOT contain J", language.contains("J")); //test passes b/c language DOES NOT have a J
    }
}
