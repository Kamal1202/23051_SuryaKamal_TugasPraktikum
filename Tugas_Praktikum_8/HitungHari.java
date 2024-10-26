package Tugas8;

public class HitungHari {
    private int tahun;
    private String bulan;
    
    public HitungHari(int tahun, String bulan){
        this.tahun = tahun;
        this.bulan = bulan;
    }
    
    public int hitung(){
        switch(bulan){
            case "Januari":
                return 31;
            case "Februari":
                return kabisatChecking()? 29:28;
            case "Maret":
                return 31;
            case "April":
                return 30;
            case "Mei":
                return 31;
            case "Juni":
                return 30;
            case "Juli":
                return 31;
            case "Agustus":
                return 31;
            case "September":
                return 30;
            case "Oktober":
                return 31;
            case "November":
                return 30;
            case "Desember":
                return 31;
            default:
                return 0;
            
        }
    }
    
    private boolean kabisatChecking(){
        if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        int jumlahHari = hitung();
        return String.format("Jumlah hari pada bulan %s tahun %d adalah %d", bulan, tahun, jumlahHari);
    }
}
