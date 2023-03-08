//Nama file: Mpoligon.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: File main untuk menguji kelas PersegiPanjang dan SegiTiga

package org.main;

import org.bangundatar.*;

public class Mpoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printinfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungluas());
        
        SegiTiga segitiga = new SegiTiga(10, 10, 3);
        segitiga.printinfo();
        System.out.println("Luas segitiga: " + segitiga.hitungluas());
    }
}
