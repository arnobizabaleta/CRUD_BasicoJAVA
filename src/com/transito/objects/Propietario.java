package com.transito.objects;

public class Propietario {
    int id;
    String nombreCompleto;
    String direccion;
    String telefono;
    public Vehiculo vehiculo;

    //Constructores
    public Propietario(){

    }

    public Propietario(int id, String nombreCompleto, String direccion, String telefono, Vehiculo vehiculo){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
    }

    public int  getId(){
        return this.id;
    }

    public  void setId(int id){
        this.id= id;
    }

    public String  getTelefono(){
        return this.telefono;
    }

    public  void setTelefono(String telefono){
        this.telefono = telefono;
    }


    public String  getNombreCompleto(){
        return this.nombreCompleto;
    }

    public  void setNombre(String nombre){
        this.nombreCompleto = nombre;
    }

    public String  getDireccion(){
        return this.direccion;
    }

    public  void setDireccion(String direccion){
        this.direccion= direccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
