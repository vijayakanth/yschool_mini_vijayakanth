<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center> <h1>Student_Searching</h1>
        <form action="Search_Servlet" method="Post">
            <table border="0" width="400" height="200"cellspacing="0" cellpadding="0">           
                    
                
               
                    <tr>
                        <td > Student_Name:</td>
                        <td><input type="text" name="Student_Name"  /> </td>
                    </tr>
                    <tr>
                        <td> Grade: </td>
                        <td>  <select name="Grade">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
                <option>13</option>
            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="View" /></td>
                        <td> <input type="reset" value="Reset" /></td>
                    </tr>
                  
                
            </table></center>      
           
           
        </form>
    </body>
</html>
