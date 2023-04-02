//Nama file: BujurSangkar.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Representasi dari objek Bujur Sangkar

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

/*Soal
    Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? jelaskan!
*/
/*Penyelesaian
    Kelas BujurSangkar tidak dapat diinstansiasi karena tidak memiliki implementasi dari metode abstrak yang ada pada kelas BangunDatar
*/ 