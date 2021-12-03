
/*
 * Nama     : Salman Alfariji
 * NIM      : 20200040033
 * Kelas    : TI20A
 */
package polymorfisme;
import polymorfisme.Gaji;


public class JumlahGaji extends Gaji{
    double all;
    
    public void gaji(){
        JumlahGaji jumlahgaji = new JumlahGaji();
        jumlahgaji.g_pokok(1800000);
        jumlahgaji.t(400000);
        jumlahgaji.t1(300000);
        jumlahgaji.t2(200000);
        jumlahgaji.t3(100000);
        
        System.out.println("Gaji Pokok \t : Rp. "+jumlahgaji.gGP() +",-");
        System.out.println("Gaji Tunjangan 1 \t : Rp. "+jumlahgaji.gT1()  +",-");
        System.out.println("Gaji Tunjangan 2 \t : Rp. "+jumlahgaji.gT2() +",-");
        System.out.println("Gaji Tunjangan 3 \t : Rp. "+jumlahgaji.gT3() +",-");
        System.out.println("Gaji Tunjangan 4 \t : Rp. "+jumlahgaji.gT() +",-");  
        
        all = (double) jumlahgaji.gGP()  + jumlahgaji.gT1() + jumlahgaji.gT2() + jumlahgaji.gT3() + jumlahgaji.gT(); 
    }
    
    public double all(){
        return all;
    }
}