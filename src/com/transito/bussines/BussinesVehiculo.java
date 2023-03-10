package com.transito.bussines;
import com.mysql.cj.protocol.Resultset;
import com.transito.objects.Vehiculo;
import com.transito.sql.Conexion;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class BussinesVehiculo {
    public void crearVehiculo(String placa, String marca, String color){

    }

    public void crearVechiculo(Vehiculo v){
             Conexion con = new Conexion();
        try{

            Statement st = con.conectar().createStatement();
            st.execute("Insert into vehiculos values('"+ v.getPlaca()+"','"+v.getMarca()+"', '"+v.getColor()+"','"+v.getModelo()+"')");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
            con.desconectar();
        }
    }

    public void eliminarVechiculo(String placa){
        Conexion con = new Conexion();
        try{

            Statement st = con.conectar().createStatement();
            st.execute("Delete from vehiculos where placa = '"+ placa +"' ");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
            con.desconectar();
        }
    }

    public Vehiculo consultarVechiculo(String placa){
        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("select * from vehiculos where placa = '"+ placa +"' ");

            if (!rs.next()) return null;

            return new Vehiculo( rs.getString("placa"), rs.getString("marca"), rs.getString("modelo"), rs.getString("color"));

        }catch(SQLException e){
            System.out.println(e);
            throw new Error(e.getMessage());
        }finally {
            System.out.println();
            con.desconectar();
        }
    }

    public ArrayList<Vehiculo> consultarMuchosVehiculos(){

        Conexion con = new Conexion();

        try{
            ResultSet rs;
            Statement st = con.conectar().createStatement();
            rs = st.executeQuery("select * from vehiculos");//Resultado CONSULTA

            ArrayList<Vehiculo> listVehiculos = new ArrayList<Vehiculo>();


           // if (!rs.next()) return null;

            while(rs.next()){
                String placa = rs.getString("placa");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String color = rs.getString("color");
                Vehiculo v = new Vehiculo(placa,marca,color,modelo);
                listVehiculos.add(v);
            }


            return listVehiculos;
        }catch(SQLException e){
            System.out.println(e);
            throw new Error(e.getMessage());
        }finally {
            System.out.println();
            con.desconectar();
        }
    }
}
