/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class LogIn {
     String userName ="";
    String passWord ="";
    String firstName = "";
    String lastName = "";
    boolean checkUN, checkPW,checkLog;
    String checkApprove = "";
    String logApprove = "";
    
    
    
    //Username Check
    public boolean checkUserName(String uN)
    {
        
        userName = uN;
        if(userName.contains("_") && userName.length() <= 5)
        {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        return false;
    }
    
    //Password Check
    public boolean checkPasswordComplexity(String pW)
    {
        passWord = pW;
        if(passWord.length() >= 8 && passWord.matches(".*[A-Z]*[0-9]*[!@#$%^&*()].*"))
        {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");  
        }
        return false;
    }
    
    //Username and password error or approval message
    public String registerUser(String lU, String lP)
    {
        if(checkUserName(lU) == false)
        {
            checkApprove = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        }
        if(checkPasswordComplexity(lP) == false)
        {
            checkApprove = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        else
        {
            checkApprove = "Username and Password Formatted Correctly";
        }
        return checkApprove;
    }
    
    //Check for log in and register match
    public boolean loginUser(String lU, String lP)
    {
        String loginUN = lU;
        String loginPW = lP;
        
        if(loginUN.equals(userName) && loginPW.equals(passWord))
        {
            checkLog = true;
        }
        else
        {
            checkLog = false;
        }
       
        return checkLog;
    }
    
    //Log in error or approval message
    public String returnLoginStatus(String fN, String lN)
    {
        firstName = fN;
        lastName = lN;
        if(checkLog == true)
        {
            logApprove = "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        }
        else
        {
            logApprove = "Username or password incorrect, please try again";
        }
        return logApprove;
    }
            
}
    

