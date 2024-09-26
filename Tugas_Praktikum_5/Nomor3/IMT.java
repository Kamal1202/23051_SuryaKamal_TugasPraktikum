/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor3;

/**
 *
 * @author soery
 */
public class IMT {
    private double score;
    
    public double hitungIMT(double bb, double tb){
        score = bb / (tb*tb);
        System.out.println("Score IMT mu = "+score);
        return score;
    }
    public void klasifikasiIMT(double score){
        if(score >= 40){
            System.out.println("Sangat Gemuk");
        }else if(score >= 30){
            System.out.println("Gemuk");
        }else if(score >= 25){
            System.out.println("Berat Badan Lebih");
        }else if(score >= 18.5){
            System.out.println("Berat Badan Ideal");
        }else if(score < 18.5){
            System.out.println("Berat Badan Kurang");
        }
    }
}
