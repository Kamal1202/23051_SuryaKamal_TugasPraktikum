/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author soery
 */
public class Nilai {
    public double nilaiAkhir(double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        return (0.10 * nilaiKehadiran)+(0.20 * nilaiTugas)+(0.30 * nilaiUTS)+(0.40 * nilaiUAS);
    }
    
    public void grade(double nilaiAkhir){
        if(nilaiAkhir >= 0 && nilaiAkhir <= 45){
            System.out.println("Grade \t\t: E");
            System.out.println("Keterangan \t: Kurang Sekali");
        }else if(nilaiAkhir >= 46 && nilaiAkhir <= 55){
            System.out.println("Grade \t\t: D");
            System.out.println("Keterangan \t: Kurang");
        }else if(nilaiAkhir >= 56 && nilaiAkhir <= 65){
            System.out.println("Grade \t\t: C");
            System.out.println("Keterangan \t: Cukup");
        }else if(nilaiAkhir >= 66 && nilaiAkhir <= 75){
            System.out.println("Grade \t\t: B");
            System.out.println("Keterangan \t: Baik");
        }else if(nilaiAkhir >= 76 && nilaiAkhir <=100){
            System.out.println("Grade \t\t: A");
            System.out.println("Keterangan \t: Sangat Baik");
        }else{
            System.out.println("Nilai anda di luar nurul");
        }
    }
}
