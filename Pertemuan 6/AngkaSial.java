//Nama file: AngkaSial.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: File main untuk menguji kelas BujurSangkar dan Kubus

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/* Pertanyaan
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 */
/* Penyelesaian: 
 * tidak dieksekusi karena class AngkaSialException belum dibuat , jadi perlu sebuah class AngkaSialException terlebih dahulu 
 */