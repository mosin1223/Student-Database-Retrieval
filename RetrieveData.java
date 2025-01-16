import java.sql.*;

public class RetrieveData {
    public static void main(String[] args)  {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password  = "root177";
        String query  = "select *from students;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("not installed ");
        }
        try{
            Connection con = DriverManager.getConnection(url ,username ,  password );
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("CMS_ID");
                String name = rs.getString("name");
                String uni = rs.getString("university");
                Double fee = rs.getDouble("UNI_FEEs");

                System.out.println();
                System.out.println("================================");
                System.out.println("Id : "+id);
                System.out.println("Name : "+name );
                System.out.println("University name : "+uni);
                System.out.println("University fees  : "+fee);
                System.out.println("================================");
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }



    }
}