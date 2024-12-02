/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;




public class Conexion {
    Connection cn;

    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://hakaton.cdggooyqe936.us-east-1.rds.amazonaws.com:3306/hackaton?useSSL=false&serverTimezone=UTC", "admin", "hakaton983447196");
            System.out.println("SE CONECTO CORRECTAMENTE LA BASE DE DATOS");
        } catch (Exception e) {
            System.out.println("NO SE LOGRO CONECTAR LA BASE DE DATOS");
        }
    }
    public Connection getConexion(){
    return cn;
    }
}
