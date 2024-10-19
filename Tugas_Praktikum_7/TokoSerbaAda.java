package TokoSerbaAda;
import java.util.Scanner;

public class TokoSerbaAda {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Toko Serba Ada");
        System.out.println("*************************");
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahItem = input.nextInt();

        String[] kodeBarang = new String[jumlahItem];
        String[] namaBarang = new String[jumlahItem];
        int[] hargaBarang = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

        inputBarang(jumlahItem, kodeBarang, namaBarang, hargaBarang, jumlahBeli, jumlahBayar);
        int totalBayar = hitungTotalBayar(jumlahBayar);
        tampilkanHasil(jumlahItem, kodeBarang, namaBarang, hargaBarang, jumlahBeli, jumlahBayar, totalBayar);
    }

    public static void inputBarang(int jumlahItem, String[] kodeBarang, String[] namaBarang, int[] hargaBarang, int[] jumlahBeli, int[] jumlahBayar) {
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBarang[i] = input.next();
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 4000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Unknown";
                    hargaBarang[i] = 0;
                    break;
            }

            jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }
    }

    public static int hitungTotalBayar(int[] jumlahBayar) {
        int total = 0;
        for (int bayar : jumlahBayar) {
            total += bayar;
        }
        return total;
    }

    public static void tampilkanHasil(int jumlahItem, String[] kodeBarang, String[] namaBarang, int[] hargaBarang, int[] jumlahBeli, int[] jumlahBayar, int totalBayar) {
        System.out.println("\nToko Serba Ada");
        System.out.println("*************************");
        System.out.printf("%-4s %-10s %-15s %-10s %-16s %-12s\n", "No", "Kode", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("========================================================================");

        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-4d %-10s %-13s %6d %12d %18d\n",
                    (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }

        System.out.println("========================================================================");
        System.out.printf("Total Bayar : %53d\n", totalBayar);
        System.out.println("========================================================================");
    }
}
