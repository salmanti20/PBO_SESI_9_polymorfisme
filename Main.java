/*
 * Nama     : Salman Alfariji
 * NIM      : 20200040033
 * Kelas    : TI20A
 */
import polymorfisme.JumlahGaji;


public class Main extends JumlahGaji {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(" Gaji Dan Tunjangan Guru");
        System.out.println("-------------------------------------------");
        main.nip();
        main.nama();
        main.jabatan();
        main.gT();
        main.gaji();
        System.out.println("-------------------------------------------");
        System.out.println("Total Gaji Poko + Tunjangan : Rp. "+main.all()+",-");
        
    }
}
