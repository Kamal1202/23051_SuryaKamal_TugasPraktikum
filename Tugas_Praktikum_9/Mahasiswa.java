package Mahasiswa;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private double nilaiAkhir;

    public Mahasiswa(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getnpm() { return npm; }
    public String getnama() { return nama; }
    public String getalamat() { return alamat; }
    public String getMataKuliah() { return mataKuliah; }
    public double getNilaiAkhir() { return nilaiAkhir; }
}
