package Nomor1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Pemanggilan Class Scanner dengan nama object Input   
        
        Mahasiswa mhs = inputMahasiswa(input);//Pemanggilan Clas Mahasiswa dengan nama object mhs dan nilai parameter dari input user
        
        double nilaiAkhir = hitungNilaiAkhir(mhs);//Pengisian nilai method hitungNilaiAkhir dari Class Mahasiswa & Pendeklarasian variabel nilaiAkhir
        
        tampilkanBiodata(mhs, nilaiAkhir);//Pemanggilan method tampilkanBiodata dengan parameter object mhs dan nilaiAkhir
        
    }
    
    
    public static Mahasiswa inputMahasiswa(Scanner input) {
        System.out.println("Input Biodata Mahasiswa\n");
        
        System.out.print("NPM \t\t: ");
        long npm = input.nextLong();
        
        input.nextLine();//Wajib digunakan sebelum melakukan input tipe data String setelah inputan dengan tipe data lain
        
        System.out.print("Nama \t\t: ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas \t: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS \t: ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS \t: ");
        double nilaiUAS = input.nextDouble();
        
        return new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
    }
    
    public static double hitungNilaiAkhir(Mahasiswa mhs){
        Nilai nilai = new Nilai();
        return nilai.nilaiAkhir(mhs.getnilaiKehadiran(), mhs.getnilaiTugas(), mhs.getnilaiUTS(), mhs.getnilaiUAS());//Mereturn method nilaiAkhir dengan nilai parameter yang diambil dari class Mahasiswa
    }
    
    public static void tampilkanBiodata(Mahasiswa mhs, double nilaiAkhir) {
        Nilai nilai = new Nilai();//Pemanggilan Class Nilai untuk method grade()
        System.out.println("\nBiodata Mahasiswa");
        System.out.println("NPM \t\t: " + mhs.getnpm());
        System.out.println("Nama \t\t: " + mhs.getnama());
        System.out.println("Nilai Kehadiran : " + mhs.getnilaiKehadiran());
        System.out.println("Nilai Tugas \t: " + mhs.getnilaiTugas());
        System.out.println("Nilai UTS \t: " + mhs.getnilaiUTS());
        System.out.println("Nilai UAS \t: " + mhs.getnilaiUAS());
        System.out.println("Nilai Akhir \t: " + nilaiAkhir);
        nilai.grade(nilaiAkhir);
    }
}