package TugasPertemuan2;

public class Matematika implements InterfaceMatematika{
    public int hasil;
    
    public int pertambahan(int a, int b){ //Pemanggilan method pertambahan dan pengisian bodynya
        hasil = a + b; //Penggunaan variable a dan b
        System.out.println("\nPertambahan :");
        System.out.println(a+ " + " +b+ " = " +hasil);
        return hasil;
    }
    
    public int pengurangan(int a, int b){        
        hasil = a - b;
        System.out.println("\nPengurangan :");
        System.out.println(a+ " + " +b+ " = " +hasil);
        return hasil;
    }
    
    public int perkalian(int a, int b){
        hasil = a * b;
        System.out.println("\nPerkalian :");
        System.out.println(a+ " + " +b+ " = " +hasil);
        return hasil;
    }
    
    public int pembagian(int a, int b){
        hasil = a / b;
        System.out.println("\nPembagian :");
        System.out.println(a+ " + " +b+ " = " +hasil);
        return hasil;
    }
}
