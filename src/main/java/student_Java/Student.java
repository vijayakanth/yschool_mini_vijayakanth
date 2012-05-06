/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_Java;

import java.util.ArrayList;

/**
 *
 * @author Vijay
 */
public class Student {
    private ArrayList <Student_Search> stdnt = new ArrayList();
    
    public Student()
    {
      Student_Search st1=new Student_Search("vijay","1","Ganesh","pointpedro");
      Student_Search st2=new Student_Search("vanas","2","krish","punnalai");
      Student_Search st3=new Student_Search("ramanan","3","velu","nelliyady");
      Student_Search st4=new Student_Search("thenu","4","sri","vavuniya");
      Student_Search st5=new Student_Search("nilash","5","namsi","poonthoddam");
      
      stdnt.add(st1);
      stdnt.add(st2);
      stdnt.add(st3);
      stdnt.add(st4);
      stdnt.add(st5);
      
    }
    public Student_Search findStudent(String name,String grade)
    {
        Student_Search st=null;
        for(int i=0;i<stdnt.size();i++)
        {
            if(stdnt.get(i).getStudentName().equals(name) && stdnt.get(i).getGrade().equals(grade))
            {
                st=stdnt.get(i);
            }
        }
       // System.out.print(st);
        return st;
        
           
     }   
    
}
           
    
    

