import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {


    public static void main(String[] args){
        try {

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","ee9c825a");

            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from jdbc_test");
            while (resultSet.next()){

                System.out.println(resultSet.getString("firstname"));

            }
        }

        catch (Exception e){

            e.printStackTrace();
        }
    }
}
