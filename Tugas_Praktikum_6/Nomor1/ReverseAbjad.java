/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;


public class ReverseAbjad {
    public void printAbjad(){
        System.out.println("\nHuruf Abjad Z-A: ");
        
        for (char abjad = 'Z'; abjad >= 'A'; abjad--){//variabel abjad dengan tipe data char diberi nilai awal z, dan akan mengakhiri looping di nilai a dengan operator decrement
            System.out.print(abjad+ ", ");
        }
    }
}
