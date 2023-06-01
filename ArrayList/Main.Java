package ArrayList;

public class Main {
  public static void main(String[] args) {

    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

    // Lakukan modifikasi data tambah mahasiswa ...
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Kartika Putri Dewa Yani", "Sistem Informasi", false));
    Mahasiswa rayhan = new Mahasiswa("Rayhan Priambodo","Teknik Informatika",false);
    DataMahasiswa.tambahMahasiswa(rayhan);

    // Method tampilSemuaData
    DataMahasiswa.tampilSemuaData();

    // Method cariMahasiswa (jika data ada)  
    DataMahasiswa.cariMahasiswa("Rayhan Priambodo");
    DataMahasiswa.cariMahasiswa("Grenda Jamaludin");

    // Method cariMahasiswa (jika data tidak ada)
    DataMahasiswa.cariMahasiswa("Rayhan Riambodo");
    DataMahasiswa.cariMahasiswa("Grenda Jamaludi");

    // Method tampilMahasiswa (sebelum diupdate)
    DataMahasiswa.tampilMahasiswa(rayhan);

    // Method tampilMahasiswa (setelah diupdate)
    Mahasiswa raySitepu = new Mahasiswa("Rayhan Sitepu", "Magister Ilmu Komputer",true);
    DataMahasiswa.updateMahasiswa(rayhan, raySitepu);

    DataMahasiswa.tampilMahasiswa(rayhan);
    DataMahasiswa.tampilMahasiswa(raySitepu);

    DataMahasiswa.tampilSemuaData();
  }
}
