/*
 * File : Maptest.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : contoh penggunaan Map
 */

package Maptest;
import java.util.*;

public class Maptest {
    public static void main(String[] args){
        // inisialisasi Arrayzist yang hanya dapat
        //berisi objek string
        Map<Integer,String> Map = new HashMap<Integer,String>();
        // menambah elemen
        Map.put(1, "satu");
        Map.put(2, "dua");
        //mengambil elemen pertama 
        System.out.println(Map.get(1));
        //Mengambil keseluruhan kunci sebagai object collection set
        Set<Integer> key = Map.keySet();
        //Bagaimana iterasi untuk mengambil keseluruhan
        //nilai dari kunci? tulis pada laporan anda
        //Petunjuk : gunakan iterasi seperti program ArrayListTest
        for (Integer i : key) {
            System.out.println("Kunci : " + key + " Nilai : " + Map.get(i));
        }
    }
}
