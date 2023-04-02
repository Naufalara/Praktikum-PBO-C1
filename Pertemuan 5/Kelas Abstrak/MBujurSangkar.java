//Nama file: MKBujurSangkar.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: File main untuk menguji kelas BujurSangkar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}