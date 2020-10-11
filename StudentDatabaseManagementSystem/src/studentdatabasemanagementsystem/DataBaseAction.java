
package studentdatabasemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataBaseAction {
    Connection getConnection() throws SQLException{
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/macem","root","");
        return conn;
    }
    ObservableList<newStudentInfo>getAllStudents() throws SQLException{
        
        ObservableList<newStudentInfo> stdList=FXCollections.observableArrayList();
        
        Connection conn=getConnection();
        Statement statement=conn.createStatement();
        String query="select * from student";
        
       ResultSet  rs=statement.executeQuery(query);
        
        while(rs.next()){
            String name=rs.getString("name");
            String id=rs.getString("id");
            String email=rs.getString("email");
            String depertment=rs.getString("depertment");
            String address=rs.getString("address");
            
            newStudentInfo student=new newStudentInfo(name,id,email,depertment,address);
            stdList.add(student);
        }
        return stdList;
        
    }
    
    String insertStudent(newStudentInfo student) throws SQLException{
        Connection conn=getConnection();
        Statement statement=conn.createStatement();
        
        String query="insert into student"+" values('"+student.getName()+"','"+student.getId()+"','"+student.getEmail()+"','"+student.getDepertment()+"','"+student.getAddress()+"')";
        
        if(statement.executeUpdate(query)>0){ 
            return "student added successfully";
        }else{
            return "failed";
        }
        //statement.executeUpdate(query);
        
    }
}
