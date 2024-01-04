package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRes = null;
        PreparedStatement prepStament = null;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_sindicato", "root", "9PM8tv$h#$*e");

            // FIN DE INICIO DE CONEXION CON BASE DE DATOS -------------

            String  insertSql = ("INSERT INTO gestion_sindicato.cat_tipo_empleados (ID_TIPO_EMPLEADO, DESCRIPCION) VALUES" +
                    "(?, ?)");
            prepStament = myConn.prepareStatement(insertSql);
            prepStament.setString(1,"9");
            prepStament.setString(2,"Vendedor de Cabina");


            int rowsAffected = prepStament.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Se creo un nuevo registro");
            }

            //myStmt = myConn.createStatement();
            //myRes =  myStmt.executeQuery("SELECT * FROM gestion_sindicato.cat_tipo_empleados;");

            /*while(myRes.next()){
                System.out.println(myRes.getString("ID_EMPLEADO") + " " + myRes.getString("NOMBRE"));
            }*/

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Conexión errada");
        }
    }
}