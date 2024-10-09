/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

public class LaguAnakAyam {
    public void printLagu(){
        int i = 1, j = 1;
        
        System.out.println("\n\nLagu Anak Ayam: \n");
        
        while (i<=2){//Nested if untuk mengefisiensikan pengulangan lirik yang sama
            while (j<=3){
                System.out.print("tekotek, ");
                j++;
            }
            System.out.println("\nanak ayam turun berkotek\n");
            
            j = 1;//j harus dikembalikan ke nilai awal yaitu 1, agar inner looping berjalan normal
            i++;
        }
        
        for (int k = 10; k >= 1; k--){//looping untuk menampilkan lirik yang sama
            System.out.println("anak ayam turun " +k);
            int sisa = k - 1;//operasi dibuat untuk menyesuaikan lirik lagu
            System.out.println("mati 1 sisa " +sisa+ "\n");
        }
    }
}
