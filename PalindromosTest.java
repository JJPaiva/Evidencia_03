import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromosTest {
    @Test
    public void testIngresarString() {

    }

    @Test
    public void testEsPalindromo() {
        assertEquals(true, Palindromos.esPalindromo(""));
        assertEquals(true, Palindromos.esPalindromo(" "));
        assertEquals(true, Palindromos.esPalindromo("aibofobia"));
        assertEquals(true, Palindromos.esPalindromo("AlA"));
        assertEquals(true, Palindromos.esPalindromo("02020"));
        assertEquals(true, Palindromos.esPalindromo("Anita Lava La Tina"));
        assertEquals(true, Palindromos.esPalindromo("aca"));
        assertEquals(false, Palindromos.esPalindromo("acas"));
        assertEquals(true, Palindromos.esPalindromo("h"));
        assertEquals(false, Palindromos.esPalindromo("java"));
        assertEquals(false, Palindromos.esPalindromo("200"));
        assertEquals(true, Palindromos.esPalindromo("aaabccbaaa"));
        assertEquals(false, Palindromos.esPalindromo("ahabccbaaa"));
        assertEquals(true, Palindromos.esPalindromo("La tele letal"));
        assertEquals(true, Palindromos.esPalindromo("La Ruta Nos aporto oTRo PasO NaturAl"));
    }

    @Test
    public void testMain() {

    }
}