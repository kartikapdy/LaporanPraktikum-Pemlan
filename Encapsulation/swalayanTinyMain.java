package Encapsulation;
import java.util.Scanner;

public class swalayanTinyMain {
   public static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
      int jenisAktivitas;
      double topUp, beli;
      String nopel, pin;

      System.out.println("Selamat Datang di Swalayan Tiny, belanja hemat harga pas");
      swalayanTiny aktivitas = new swalayanTiny (500000.0,"2412");
      aktivitas.setNama("Kartika");

      System.out.println("Masukkan nomor pelanggan Anda : ");
      nopel = input.nextLine();
      while(nopel.length()!=10){
         System.out.println("Nomor Pelanggan yang Anda masukkan tidak valid");
         System.out.println("Nomor Pelanggan terdiri dari 10 digit.");
         System.out.println("==============================");
         System.out.println("Masukkan nomor pelanggan Anda : ");
         nopel = input.nextLine();
      }
      aktivitas.setNoPelanggan(nopel);
      System.out.println("=================================");
      aktivitas.displayIdentitas();
      System.out.println("=================================");

      while(true){
         System.out.println("Transaksi apa yang ingin anda lakukan : ");
         System.out.println("1 Beli barang \n2 Top up saldo \n3 Keluar");
         jenisAktivitas = input.nextInt();
         if(jenisAktivitas==1){
            System.out.println("Masukkan total belanja : ");
            beli = input.nextDouble();
            System.out.println("Masukkan pin : ");
            pin = input.next();
            aktivitas.pembelian(beli, pin);
         }else if(jenisAktivitas==2){
            System.out.println("Masukkan jumlah top up : ");
            topUp = input.nextDouble();
            System.out.println("Masukkan pin : " );
            pin = input.next();
            aktivitas.topUp(topUp,pin);
         }else if(jenisAktivitas==3){
            System.out.println("Terima kasih.");
            System.exit(0);
         }
         System.out.println("=================================");
      }
   }
}