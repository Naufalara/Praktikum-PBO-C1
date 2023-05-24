/*
 * File : BangunDatarGeneric.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : main class BangunDatarGeneric
 */

package Bangundatar;

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling LIngkaran = "+bdg.hitungKeliling());
        System.out.println("Tipe Generic = "+bdg.get().getClass().getName());
    }
}
