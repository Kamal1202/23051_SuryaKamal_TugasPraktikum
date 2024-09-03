package Nomor1Dan2;

public class MatematikaMain {

    public static void main(String[] args) {
        Matematika math = new Matematika(); //Pemanggilan class Matematika dengan nama objek math
        
        math.pertambahan(20, 10); //Pemanggilan method pertambahan(int a, int b) dan pengisian variablenya
        math.pengurangan(10, 5);
        math.perkalian(10, 3);
        math.pembagian(21, 2);
        
    }
    
}
