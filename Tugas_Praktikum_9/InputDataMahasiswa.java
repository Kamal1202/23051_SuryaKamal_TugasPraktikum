package Mahasiswa;
import java.util.ArrayList;

public class InputDataMahasiswa {
    private ArrayList<Mahasiswa> listMahasiswa;

    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList<>();
    }

    public void insertData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listMahasiswa;
    }

    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }
}
