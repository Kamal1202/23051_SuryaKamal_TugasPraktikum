/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;
import java.util.Scanner;
/**
 *
 * @author soery
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Diskon disk = new Diskon();
        
        System.out.println("Kasir IndoAlfa ;)");
        System.out.print("Masukkan Total Harga Belanja : ");
        double harga = input.nextDouble();
        
        Pembelian beli = new Pembelian(harga);
        
        
        System.out.println("\nRincian Harga : ");
        System.out.print("Total Harga Belanja : "+beli.harga());
        disk.hitungDiskon(harga);        
    }
}
