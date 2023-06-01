package Inheritance;
import java.time.LocalDate;
public class Manager extends Pekerja {
   private String departemen;

   public Manager(String nama, String nik, boolean jenisKelamin, boolean Menikah, double gaji, LocalDate tahunMasuk,int jumlahAnak, String departemen ){
      super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, Menikah);
      this.departemen= departemen;
   }

   public void setDepartemen(String departemen){
      this.departemen = departemen;
   }
   public String getDepartemen(){
      return departemen;
   }
   
   public double getTunjanganManager(){
      return getGaji()*0.1;
   }

   public double getPendapatan(){
      return getGaji()+getBonus()+getTunjangan()+getTunjanganManager()+ getTambahTunjangan();
   }

   public String toString(){
      return "nama              : " + getNama() + "\nNIK               : " + getNik() + "\nJenis Kelamin     : " + getJenisKelamin() + "\nJumlah Pendapatan : " + getPendapatan() + "\nTahun Masuk       : " + getTahunMasuk() + "\nJumlah Anak       : " + getJumlahAnak() + "\nGaji              : " + getGaji()+ "\nDepartemen        : " + getDepartemen();
   }
}



