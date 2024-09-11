package Nomor2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soery
 */
public class KonversiSuhu {
    public double celcius, fahrenheit;
    
    public double celciusToFahrenheit(){
        fahrenheit = (celcius * 9/5) + 32;
        System.out.println("\nHasil konversi Celcius ke Fahrenheit : ");
        System.out.println(celcius + "°C = " + fahrenheit + "°F");
        return fahrenheit;
    }
    
    public double celciusToReamur(){
        double reamur = celcius * 4/5;
        System.out.println("\nHasil konversi Celcius ke Reamur : ");
        System.out.println(celcius + "°C = " + reamur + "°R");
        return reamur;
    }
}
