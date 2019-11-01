/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM :   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bilangan tambah,kurang;
        tambah = new JumlahBilangan();
        kurang = new SelisihBilangan();
        
        ((JumlahBilangan)tambah).tampilHasilJumlah();
        ((SelisihBilangan)kurang).tampilSelisih();
    }

}
