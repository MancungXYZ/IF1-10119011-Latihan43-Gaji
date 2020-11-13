/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan43.gaji;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan43Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Reihan Wiyanda");
        gp.setAlamat("Jalan Sekeloa No 6");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(450000);
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.getTotalGaji());
    }
    
}
