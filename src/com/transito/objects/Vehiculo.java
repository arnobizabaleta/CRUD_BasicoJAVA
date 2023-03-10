package com.transito.objects;



public class Vehiculo {
    String placa;
    String marca;
    String color;
    String modelo;

    //Constructores
    public Vehiculo(){

    }

    public Vehiculo(String placa, String marca,String color,String modelo){
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }





    public void setPlaca(String placa){
        this.placa = placa;

    }

    public String getPlaca(){
        return this.placa;
    }

    public void setMarca(String marca){
        this.marca = marca;

    }


    public String getMarca(){
        return this.marca;
    }

    public void setColor(String color){
        this.color = color;

    }

    public String getColor(){
        return this.color;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

    public String getModelo(){
        return this.modelo;
    }
}
