package Nomor3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IMT imt = new IMT();
        
        System.out.println("Selamat datang di program Penghitungan Indeks Massa Tubuh");
        System.out.print("Masukkan Berat Badan (kg) : ");
        double bb = input.nextDouble();
        System.out.print("Masukkan Tinggai Badan (m) : ");
        double tb = input.nextDouble();
        
        double score = imt.hitungIMT(bb, tb);
        
        imt.klasifikasiIMT(score);
    }
    
}
