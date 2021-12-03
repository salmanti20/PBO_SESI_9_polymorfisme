/*
 * Nama     : Salman Alfariji
 * NIM      : 20200040033
 * Kelas    : TI20A
 */
package polymorfisme;
import polymorfisme.ID;


public class Gaji extends ID{
    int g_pokok, t, t1, t2, t3;
    
    public void g_pokok(int gp){
        this.g_pokok = gp;
    }
    
    public int gGP(){
        return g_pokok;
    }
    
    public void t (int tj){
        this.t = tj;
    }
    
    public int gT(){
        return t;
    }
    
    public void t1(int tj1){
        this.t1 = tj1;
    }
    
    public int gT1(){
        return t1;
    }
    
    public void t2(int tj2){
        this.t2 = tj2;
    }
    
    public int gT2(){
        return t2;
    }
    
    public void t3(int tj3){
        this.t3 = tj3;
    }
    
    public int gT3(){
        return t3;
    }
    
    
}