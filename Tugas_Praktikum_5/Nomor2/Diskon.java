package Nomor2;
public class Diskon {
    public void hitungDiskon(double harga){
        double diskon = 0, hargaFinal = 0;
        
        if(harga > 0  && harga < 50000){
            diskon = 0.05 * harga; 
            hargaFinal = harga - diskon;
        }else if(harga >= 50000){
            diskon = 0.20 * harga;
            hargaFinal = harga - diskon;
        }else{
            System.out.println("Harga tidak valid");
        }
        
        System.out.println("\nBesarnya potongan : "+diskon);
        System.out.println("Harga yang harus dibayar : "+hargaFinal);
        
    }
}
