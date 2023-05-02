/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInTest {
    
    LogIn login = new LogIn();
    
    @Test
    public void testCheckUserNameCorrectlyFormatted() {
        boolean actual = login.checkUserName("Kyl_1");
        assertEquals(true, actual);
    }
    
    @Test
    public void testCheckUserNameInCorrectlyFormatted() {
        boolean actual = login.checkUserName("kyl!!!!!");
        assertEquals(false, actual);     
    }

    @Test
    public void testCheckPasswordComplexitySuccess() {
        boolean actual = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(true, actual);
    }
    
    @Test
    public void testCheckPasswordComplexityFail() {
        boolean actual = login.checkPasswordComplexity("password");
        assertEquals(false, actual);
    }
}
