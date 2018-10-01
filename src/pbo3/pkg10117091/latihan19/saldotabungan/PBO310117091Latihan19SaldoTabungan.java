/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan19.saldotabungan;

/**
 *
 * @author Lenovo
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat menampilkan saldo tabungan
 */
public class PBO310117091Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal;
        int bunga;
        int jbunga;
        int lamaBulan;
        
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
        for (int i = 1; i <= lamaBulan; i++) {

            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;

            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
    }
    
}
