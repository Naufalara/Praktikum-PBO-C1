/*
 * File : Programmer.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : Kelas Programmer yang merupakan turunan dari kelas Vehicle
 */

 public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}
