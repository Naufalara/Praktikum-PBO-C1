//Nama file: PersegiPanjang.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: representasi dari objek persegi panjang

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungluas(){
        return panjang * lebar;
    }

    public void printinfo(){
        System.out.println("Bangun persegi panjang bersisi "+ this.getJumlahSisi());
    }
}
