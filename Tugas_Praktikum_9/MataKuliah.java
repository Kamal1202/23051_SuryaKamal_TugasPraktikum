package Mahasiswa;

public class MataKuliah{
    private String namaMatkul;
    private Nilai nilai;
    
    public MataKuliah(String namaMatkul, Nilai nilai){
        this.namaMatkul = namaMatkul;
        this.nilai = nilai;
    }
    
    public double getNilaiAkhir(){
        return nilai.nilaiAkhir();
    }
    
    public String namaMatkul(){
        return namaMatkul;
    }
}
