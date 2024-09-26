/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author soery
 */
public class Mahasiswa {
    private final long npm;
    private final String nama;
    private final double nilaiKehadiran;
    private final double nilaiTugas;
    private final double nilaiUTS;
    private final double nilaiUAS;
    
    public Mahasiswa(long npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public long getnpm(){
        return npm;
    }
    
    public String getnama(){
        return nama;
    }
    
    public double getnilaiKehadiran(){
        return nilaiKehadiran;
    }
    
    public double getnilaiTugas(){
        return nilaiTugas;
    }
    
    public double getnilaiUTS(){
        return nilaiUTS;
    }
    
    public double getnilaiUAS(){
        return nilaiUAS;
    }
}