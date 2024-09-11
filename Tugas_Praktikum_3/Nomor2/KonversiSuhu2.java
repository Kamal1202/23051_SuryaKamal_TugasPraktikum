package Nomor2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soery
 */
public class KonversiSuhu2 extends KonversiSuhu{
    public double fahrenheitToReamur(){
        double reamur = (fahrenheit - 32) * 4/9;
        System.out.println("\nHasil konversi Fahrenheit ke Reamur");
        System.out.println(fahrenheit + "°F = " + reamur + "°R");
        return reamur;
    }
}
