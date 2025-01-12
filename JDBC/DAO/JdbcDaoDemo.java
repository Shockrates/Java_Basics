package JDBC.DAO;

import java.sql.*;




public class JdbcDaoDemo {
    
    public static void main(String[] args) throws SQLException {
        
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(1);
        System.out.println();
        System.out.println(s1.sname);
    }
}

class StudentDAO {
 
    public Student getStudent(int rollno) throws SQLException{

        String url = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String pass = "password";
        try {
            String query ="SELECT username FROM student where userid = "+rollno+";";
            Student s = new Student();
            s.rollno = rollno;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = (Statement) con.createStatement();
            ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
            rs.next();
            s.sname = rs.getString(1);

            return s;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                return null;
     
    }
}

class Student{

    int rollno;
    String sname;
}
