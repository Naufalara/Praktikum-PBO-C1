/*
 * File : BangunDatarGeneric.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : class abstract BangunDatarGeneric
 */

package Bangundatar;

public class BangunDatarGeneric<Hutao extends BangunDatar> {
    private Hutao bangunDatar;

    public void set(Hutao tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public Hutao get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungkeliling();
    }
}
// T merupakan parameter type yang digunakan untuk menentukan tipe data yang akan digunakan pada saat instansiasi
// apabila ingin menggunakan tipe data yang berbeda, maka cukup mengganti T dengan tipe data yang diinginkan
// disini saya menggunakan Hutao sebagai nama parameter type