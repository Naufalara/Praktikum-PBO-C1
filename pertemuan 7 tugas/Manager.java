/*
 * File : Manager.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : Kelas Manajer yang merupakan turunan dari kelas Pegawai
 */

 public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
