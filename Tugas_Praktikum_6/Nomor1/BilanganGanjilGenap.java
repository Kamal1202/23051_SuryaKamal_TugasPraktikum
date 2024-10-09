
package Nomor1;
import java.util.ArrayList;

public class BilanganGanjilGenap {
    public void printGanjilGenap(){
        //Array Integer digunakan untuk menampung nilai yang sudah melalui pengkondisian
        ArrayList<Integer> bilanganGanjil = new ArrayList<>();
        ArrayList<Integer> bilanganGenap = new ArrayList<>();
        
        for (int i = 0; i <= 20; i++){//Looping untuk mencari bilangan Ganjil dan genap dari 0-20
            if (i % 2 == 0){//Jika nilai i habis di bagi 2 maka nilai tersebut adalah bilangan genap
                bilanganGenap.add(i);//baris untuk mengisi array bilanganGenap dengan nilai i
            }else{
                bilanganGanjil.add(i);//baris untuk mengisi array bilanganGenap dengan nilai i
            }
        }
        
        //Menampilkan Output
        System.out.println("\nBilangan Ganjil & Genap antara 0-20: ");
        System.out.println("Bilangan Ganjil: " +bilanganGanjil);
        System.out.println("Bilangan Genap: " +bilanganGenap);
    }
}
