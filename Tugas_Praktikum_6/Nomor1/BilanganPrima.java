/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;
import java.util.ArrayList;

public class BilanganPrima {
    public static boolean Prima(int number){
        if (number <= 1){//Bilangan prima di mulai dari 1, jadi bilangan <= 1 pasti bukan prima
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){//Looping ini memeriksa bilangan prima dengan akar dari number agar lebih efisien
            if (number % i == 0){
                return false;
            }
        }
        return true;//Jika nilai number berhasil melewati pengkondisian tanpa merubah nilai boolean maka nilai tersebut adalah bilangan prima
    }
    
    public void printPrima(){
        ArrayList<Integer> bilanganPrima = new ArrayList<>();
        ArrayList<Integer> bilanganNonPrima = new ArrayList<>();
        
        for(int i = 0; i <= 20; i++){
            if(Prima(i)){//pengkondisian untuk menentukkan penyimpanan nilai yang diperoleh dari method Prima
                bilanganPrima.add(i);
            }else{
                bilanganNonPrima.add(i);
            }
        }
        
        System.out.println("Bilangan Prima dan Non Prima antar 0-20:");
        System.out.println("Bilangan Prima: " +bilanganPrima);
        System.out.println("Bilangan Non Prima: " +bilanganNonPrima);
    }
}
