package Nomor1;

public class Main {

    public static void main(String[] args) {
        BilanganPrima pr = new BilanganPrima();
        BilanganGanjilGenap gg = new BilanganGanjilGenap();
        ReverseAbjad ra = new ReverseAbjad();
        LaguAnakAyam lagu = new LaguAnakAyam();
        
        pr.printPrima();
        gg.printGanjilGenap();
        ra.printAbjad();
        lagu.printLagu();
    }
    
}
