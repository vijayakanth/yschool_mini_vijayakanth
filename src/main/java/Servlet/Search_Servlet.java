/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_Java.Student;
import student_Java.Student_Search;


/**
 *
 * @author Vijay
 */
@WebServlet(name = "Search_Servlet", urlPatterns = {"/Search_Servlet"})
public class Search_Servlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String studentName;
        String grade;
        
       studentName=request.getParameter("Student_Name");
       grade=request.getParameter("Grade");
       
       Validate v=new Validate();
       boolean rslt=v.checkFields1(studentName, grade);
       
        
       if(rslt){
		Student s=new Student();
         //  Student_Search st=new Student_Search();
            Student_Search object1=s.findStudent(studentName,grade);
                if(object1!=null){
                        request.setAttribute("object",object1);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("View.jsp");
                        dispatcher.forward(request,response);
                }
                else{
                        response.sendRedirect("error.jsp");

                }
            
        }
        else{
            response.sendRedirect("warning.jsp");
           
        }
        
    }
          
    @Override
    public String getServletInfo() {
        return "Short description";
    }   
   
    
}

