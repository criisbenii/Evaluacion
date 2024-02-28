package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private static final String SQL_DROP_CREATE_ODONTOLOGO = "DROP TABLE IF EXISTS " +
            "ODONTOLOGO; CREATE TABLE ODONTOLOGO (ID INT AUTO_INCREMENT PRIMARY KEY," +
            " NUM_MATRICULA INT NOT NULL," +
            " NOMBRE VARCHAR(100) NOT NULL," +
            " APELLIDO VARCHAR(100) NOT NULL," +
            ")";
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./clinica", "sa", "sa");

    }
    public static void crearTabla(){
        Connection connection=null;
        try {
            connection=getConnection();
            Statement statement=connection.createStatement();
          //  statement.execute(SQL_DROP_CREATE_ODONTOLOGO);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
            connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }




    }
}

