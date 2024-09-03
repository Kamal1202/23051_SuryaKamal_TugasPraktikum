package Nomor3;


public class Menyanyi {
    
    public Menyanyi(){ //Konstruktor Menyanyi yang isinya method" lainnya
        paragraph1();
        paragraph2();
        paragraph3();
        paragraph4();
        paragraph5();
        paragraph6();
    }
    
    public void paragraph1(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){ //Perulangan untuk menampilkan B-I-N-G-O sebanyak 3 kali
            System.out.println("B-I-N-G-O");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
    public void paragraph2(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){
            System.out.println("(clap)-I-N-G-O");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
    public void paragraph3(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){
            System.out.println("(clap)-(clap)-N-G-O");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
    public void paragraph4(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){
            System.out.println("(clap)-(clap)-(clap)-G-O");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
    public void paragraph5(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){
            System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
    public void paragraph6(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for(int i = 0; i < 3; i++){
            System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    
}
