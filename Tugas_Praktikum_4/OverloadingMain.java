/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunRuang;
import java.util.Scanner;
/**
 *
 * @author soery
 */
public class OverloadingMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("1. Hitung Luas & Volume Kubus");
        System.out.println("2. Hitung Luas & Volume Balok");
        System.out.print("Pilih : ");
        int opsi = input.nextInt();
        
        if(opsi == 1){
            System.out.print("Masukkan panjang sisi : ");
            int s = input.nextInt();
            Overloading kubus = new Overloading(s);
            
            kubus.luasKubus();
            kubus.volumeKubus();
            
            System.out.println("Luas Kubus : " + kubus.luasKubus());
            System.out.println("Volume Kubus : " + kubus.volumeKubus());
        }else if (opsi == 2) {
            System.out.print("Masukkan panjang balok: ");
            int p = input.nextInt();
            System.out.print("Masukkan lebar balok: ");
            int l = input.nextInt();
            System.out.print("Masukkan tinggi balok: ");
            int t = input.nextInt();
            Overloading balok = new Overloading(p, l, t);

            balok.luasBalok();
            balok.volumeBalok();

            System.out.println("Luas Balok: " + balok.luasBalok()); 
            System.out.println("Volume Balok: " + balok.volumeBalok()); 
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        input.close();
        
    }
    
}
