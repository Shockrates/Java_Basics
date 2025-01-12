import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String url = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String pass = "password";

        String query ="SELECT username FROM student where userid = 1;";
        String query2 ="SELECT * FROM student ;";
        String query3 ="insert into student values (4, 'User4');";

        int id=5;
        String userName="User5";
        String query4 ="insert into student values (?, ?);";
     
        

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);

        Statement st = con.createStatement();

        //GETTING A SINGLE VALUE FROM A SINGLE ROW
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("username");

        //GETTING MULTIPLE VALUES FROM MULTIPLE ROWS
        ResultSet rs2 = st.executeQuery(query2);
        while (rs2.next()) {

            String userData = rs2.getInt(1)+" : " +rs2.getString(2);

            System.out.println(userData);
        }

        //INSERTING NEW VALUES
        int count = st.executeUpdate(query3);
        System.out.println(count+ " row/s affected");
       
        //PREPARED STATEMENT
        PreparedStatement pst = con.prepareStatement(query4);
        pst.setInt(1, id);
        pst.setString(2, userName);
        int pcount = pst.executeUpdate();
        System.out.println(pcount+ " row/s affected");


        st.close();
        pst.close();
        con.close();
    }
}
