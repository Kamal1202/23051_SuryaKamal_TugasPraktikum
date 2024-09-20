/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author soery
 */
public class Overloading {
    int s, p, l, t;
    
    public Overloading(int s){
        this.s = s;
    }
    
    public Overloading(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
//    public double[] luas(){
//        luasKubus = 6*s*s;
//        luasBalok = 2*(p*l*p*t*l*t);
//        
//        return new double[] {luasKubus, luasBalok};
//    }
//    
//    public double[] volume(){
//        volKubus = s*s*s;
//        volBalok = p*l*t;
//        
//        return new double[] {volKubus, volBalok};
//    }
    
    public double luasKubus(){
        return 6*s*s;
    }
    
    public double volumeKubus(){
        return s*s*s;
    }
    
    public double luasBalok(){
        return 2*(p*l+p*t+l*t);
    }
    
    public double volumeBalok(){
        return p*l*t;
    }
    
}
