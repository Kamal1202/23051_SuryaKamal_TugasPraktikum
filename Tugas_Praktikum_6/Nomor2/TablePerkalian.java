package Nomor2;

public class TablePerkalian {
    private int n;
    
    public TablePerkalian(int n){
        this.n = n;
    }
    
    public void printTable(){
        
        System.out.print("   ");
        for (int i = 1; i <= n; i++){//Looping untuk header table yang akan tampil horizontal, dan akan di eksekusi hingga = n
            System.out.printf("%4d", i);//printf berfungsi menampilkan output dengan format specifier dan diawali oleh %, dan angka 4 itu mengatur besaran nilai yang akan dicetak, dan d singkatan dari Decimal Integer mengatur tipe data apa yang akan ditampilkan.
        }
        
        System.out.println("\n "  + "-----".repeat(n));//"-----".repeat(n) berfungsi untuk mengulangan ----- sebanyak n kali
        
        for (int j = 1; j <= n; j++){
            System.out.printf("%2d|", j); //Outer looping ini mengatur kolom pertama tabel, jadi j akan di print hingga = n (belum dioperasikan)
            for (int k = 1; k <= n; k++){//Inner looping akan melakukan operasi perkalian dan menampilkan output secara horizontal
                System.out.printf("%4d", j * k);//operasi perkalian dilakukan disini
            }
            System.out.println();//Baris ini akan membuat baris baru setelah Inner Looping selesai
        }
    }
}
