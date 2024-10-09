package Nomor2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;//Pendeklarasian variabel n untuk menampung nilai yang nanti akan digunakan pada pembuatan tabel
        
        do{//Looping untuk mengisi nilai n, jika kurang dari 1 atau lebih dari 10 maka program akan di ulang hingga user menginputkan nilai yang sesuai
            System.out.println("Masukkan nilai n (1-10)");
            System.out.print("n : ");
            n = input.nextInt();
        }while(n < 1 || n > 10);//Jika nilai bernilai true maka program akan terus berulang, hingga user menginputkan nilai false yaitu < 1 || > 10

        TablePerkalian tabel = new TablePerkalian(n); //Pembuatan objek dari class TablePerkalian sekaligus mengisi nilai n di clas TablePerkalian dengan nilai n yang sudah diinputkan user
        
        System.out.println("Tabel Perkalian: ");
        tabel.printTable();//Pemanggilan method printTable dari class TablePerkalian
    }
}