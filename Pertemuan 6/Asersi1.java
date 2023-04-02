//Nama file: Asersi1.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: program untuk demo asersi

public class Asersi1{
  public static void main (String[] args){
    int x = 0;
	if(x > 0){
	  System.out.println("x bilangan positif");
	}else{
	  assert(x < 0): "ada kesalahan kode";
	  System.out.println("x bilangan negatif");
	}
  }
}