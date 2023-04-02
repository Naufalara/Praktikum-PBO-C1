//Nama file: AngkaSialException.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: eksepsi untuk angka sial

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!!!");
	}
}