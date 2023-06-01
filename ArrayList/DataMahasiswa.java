package ArrayList;

import java.util.ArrayList;

public class DataMahasiswa {

  private static ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
    mhs.add(mahasiswa);
    return mhs;
  }

  public static void tampilSemuaData(){
    // Gunakan perulangan
    int a = 0;
    for (Mahasiswa mahasiswa: mhs){
      System.out.println("=== Tampilan Data Mahasiswa " + a + " Filkom UB ===");

      tampilMahasiswa(mahasiswa);
      a++;
    }
  }

  public static Mahasiswa cariMahasiswa(String Mahasiswa){
    // Gunakan perulangan
    for(Mahasiswa mahasiswa: mhs){

      if (mahasiswa.getNama().equalsIgnoreCase(Mahasiswa)){
        System.out.println("Data Mahasiswa atas nama " + mahasiswa.getNama() + " ditemukan");
        return mahasiswa;
      }
    }
    System.out.println("Data Mahasiswa atas nama " + Mahasiswa + " tidak ditemukan");
    return null;
  }

  public static void tampilMahasiswa(Mahasiswa mhsa){
    for(Mahasiswa mahasiswa:mhs){
      if(mahasiswa.equals(mhsa)){
        System.out.println("Nama Mahasiswa  : " + mhsa.getNama());
        System.out.println("Jurusan         : " + mhsa.getJurusan());
        if(mhsa.getStatus())
          System.out.println("Status          : Menikah" );
        else
          System.out.println("Status          : Lajang");
        System.out.println();
        return;
      }
    }
    System.out.println("Data mahasiswa atas nama " + mhsa.getNama() +  " tidak ditemukan");
    System.out.println();
  }

  public static void updateMahasiswa(Mahasiswa mahasiswalama, Mahasiswa mahasiswabaru){
    int a = 0;
    for(Mahasiswa mahasiswa: mhs){
      if(mahasiswa.equals(mahasiswalama)){
        mhs.set(a, mahasiswabaru);
        System.out.println("Data Mahasiswa Atas Nama " + mahasiswalama.getNama() + " berhasil diupdate dengan nama " + mahasiswabaru.getNama());
        return;
      }
      a++;
    }

    System.out.println("Data mahasiswa atas nama " + mahasiswalama.getNama() + " tidak ditemukan");
  }
}
