/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/**
 *
 * @author Vijay
 */
public class Validate {
       
    
     public boolean checkFields1(String studentName, String grade)
    {
        if("".equals(studentName.trim()) || studentName==null || "".equals(grade.trim()) || grade==null )
            return false;
        return true;
    }
    
    }
    

