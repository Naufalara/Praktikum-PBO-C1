/*
 * File : ArrayListTest.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : contoh penggunaan ArrayList
 */

package ArrayListTest;
import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        // inisialisasi Arrayzist yang hanya dapat
        //berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for (String s:strings){
            System.out.print(s+" ");
        }
    }
}