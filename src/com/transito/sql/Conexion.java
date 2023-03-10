package com.transito.sql;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
;
       private String username = "root";
       private String password = "";
       private String hostname = "localhost";
       private String port = "3306";
       private String database = "TransitoMedellin";
       private  String classname = "com.mysqljdbc.Driver";
       private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + this.database;
       private Connection conn;

       public Conexion (){
           try{
               //Class.forName(classname);
               conn = DriverManager.getConnection(url, username, password);
           } catch(Exception e){
               System.out.println(e);
       }

    }

    public Connection conectar(){
           return conn;

    }

    public void desconectar(){

           try{
               conn.close();
           }catch(SQLException e){
               e.printStackTrace();
           }

    }
}
