package Nomor2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author soery
 */
import java.util.Scanner;
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        System.out.print("Masukkan suhur awal (dalam satuan suhu \u00B0C) : ");
        konversi.celcius = input.nextDouble();
        
        konversi.celciusToFahrenheit();
        konversi.celciusToReamur();
        konversi.fahrenheitToReamur();
    }
    
}
