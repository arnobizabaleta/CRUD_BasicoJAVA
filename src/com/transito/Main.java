package com.transito;

import com.transito.bussines.BussinesVehiculo;
import com.transito.objects.Propietario;
import com.transito.objects.Vehiculo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola mundo");

        /*
        Vehiculo v = new Vehiculo("QEJ426","Rojo","Mazda","2008");
        Propietario p1 = new Propietario(1,"Adrian Zabaleta","Campo Valdes","3005775066", v);

        */

        /*
        p1.setTelefono("3005775066");
        System.out.println(p1.getTelefono());
        p1.setId(1);
        System.out.println(p1.getId());
        p1.setDireccion("Campo Valdes, Medellín");
        p1.getDireccion();

         */

       /*
        p1.setVehiculo(v);

       */
        /*
        System.out.println("Datos del propietario 1");
        System.out.println(p1.getId());
        System.out.println(p1.getTelefono());
        p1.getDireccion();

        Vehiculo vehiculoP1 = p1.getVehiculo();
        System.out.println("Datos del vehiculo pertenciente al propietario 1");

        System.out.println(vehiculoP1.getPlaca());
        System.out.println(vehiculoP1.getColor());
        System.out.println(vehiculoP1.getMarca());
        System.out.println(vehiculoP1.getModelo());
*/


        //p1.setVehiculo("Mazda");
        //p1.obtenerVeniculo();



        Vehiculo m = new Vehiculo();
        m.setPlaca("MIY098");
        m.setColor("Negro");
        m.setMarca("TOYOTA");
        m.setModelo("2012");

        BussinesVehiculo bl = new BussinesVehiculo();
        //bl.crearVechiculo(m);
        //bl.eliminarVechiculo("MIY098");

        ArrayList<Vehiculo> vehiculos = bl.consultarMuchosVehiculos();

        if(vehiculos == null){
            System.out.println("Array vacio");

        }else{
            //System.out.println(vehiculos);
            System.out.println("Cantidad de vehiculos: " + vehiculos.size());

            for(int i = 0; i < vehiculos.size(); i ++){
                /*
                Vehiculo vh = new Vehiculo();
                vh.setPlaca(vehiculos.get(i).getPlaca());
                vh.setMarca(vehiculos.get(i).getMarca());
                vh.setModelo(vehiculos.get(i).getModelo());
                vh.setColor( vehiculos.get(i).getColor());
                */

                System.out.println(vehiculos.get(i).getPlaca());
                System.out.println(vehiculos.get(i).getMarca());
                System.out.println(vehiculos.get(i).getModelo());
                System.out.println(vehiculos.get(i).getColor());
                System.out.println("\n");
            }
        }

        /*
        for(int i = 0; i < vehiculos.size(); i ++){
            Vehiculo vh = new Vehiculo();
            vh.setColor( vehiculos[i]);
            System.out.println(vehiculos[i]);

        }

         */



    }
}
