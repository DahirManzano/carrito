/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.iu;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.entidades.Taller;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmision;


/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la distancia recorrida");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro");
        double velocidad = sc.nextDouble();
        
        //Generamos una instancia de la clase Carro 
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2022);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HIBRIDO);
        bmw.setTipoTransmision(TipoTransmision.AUTOMATICO);
        
        Propietario prop = new Propietario();
        prop.setNombre("Juan");
        prop.setDireccion("Calle hormigon #32");
        prop.setTelefono("911");
        prop.setEmail("juanitoloco@gmail.com");
        
        Taller taller = new Taller();
        taller.setDireccionTaller("Enrique Segoviano");
        taller.setNombreTaller("Manolo");
        taller.setTelefono("6221425266");
        
        bmw.setTaller(taller);
        bmw.setPropietario(prop);
        
        //Invocamos al método contenido en la clase Carro.
         double tiempo = bmw.calcularTiempo(distancia, velocidad);
        System.out.println("El tiempo que le tomara al carro " + bmw.getMarca() + 
                " de color " + bmw.getColor() + " y del año " + bmw.getAnio() + 
                " sera " + tiempo + " horas " +
                "y"
                        + " ahora su kilometraje es de " + bmw.getKilometraje() +
                "El propietario de este carro es " + bmw.getPropietario().getNombre() +
                " El taller donde se realizo el trabajo se llama " + bmw.getTaller().getNombreTaller());
        
    }
}
