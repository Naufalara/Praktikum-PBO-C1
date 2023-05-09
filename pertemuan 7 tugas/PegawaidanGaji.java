/*
 * File : PegawaiDanGaji.java
 * Penulis : Naufal Arya Ramadhan 24060121110042
 * Deskripsi : Kelas yang berisi program utama Pegawai dan gaji pegawai
 */

 public class PegawaidanGaji{
    public static void main(String args[]){
      Pegawai pegawai = new Programmer("Mira");
      Pegawai pegawai2 = new Manager("Joko");
      Pegawai pegawai3 = new Manager("Argo");
  
      Payroll payroll = new Payroll();
      payroll.cetakGaji(pegawai);
      payroll.cetakGaji(pegawai2);
      payroll.cetakGaji(pegawai3);
    }
  }