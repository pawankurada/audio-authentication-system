
package rup_lab_project;
import java.sql.*;

public class sql_test {
   
    public static void main(String args[]){  
         String name=new String();
    int age=0;
    String gender=new String();
    String email=new String();
    String addr=new String();
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/dbs","root","kJhOEmFZhewErcPd");  
  
Statement stmt=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select  *from employee"); 
int id=0;
while(rs.next())
{id=rs.getInt(1);
 name=rs.getString(2);
age=rs.getInt(3);
gender=rs.getString(4);
email=rs.getString(5);
addr=rs.getString(6);
}

System.out.println(age);
System.out.println(name);
System.out.println(gender);
        
con.close();  
}
catch(Exception e)
{
    System.out.println(e);
} 
}  
}
