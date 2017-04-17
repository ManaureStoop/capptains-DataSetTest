import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest{

    @Test
    public void testIsPalindromeWhenEvenLength() throws Exception{
        assertTrue(Palindrome.isPalindrome("2112"));
    }
    @Test
    public void testIsPalindromeWhenOddLength() throws Exception{
        assertTrue(Palindrome.isPalindrome("212"));
    }
    @Test
    public void testIsNotPalindrome() throws Exception{
        assertFalse(Palindrome.isPalindrome("21"));
    }
    @Test
    public void testIsPalindromeEmpty() throws Exception{
        assertEquals(true, Palindrome.isPalindrome(""));
    }
    @Test(expected=Exception.class)
    public void testIsPalindromeNull() throws Exception{
        Palindrome.isPalindrome(null);
    }
}