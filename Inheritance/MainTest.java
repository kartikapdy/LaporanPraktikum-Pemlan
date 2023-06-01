package Inheritance;
import java.time.LocalDate;

public class MainTest {
   public static void main(String[] args) {
      System.out.println("======================================");
      Manusia a = new Manusia("Johnny", "09567843", true, true);
      System.out.println(a); 
      System.out.println("======================================");
      System.out.println();
      System.out.println("======================================");
      Manusia b = new Manusia("Lauren", "09347658",false, true);
      System.out.println(b); 
      System.out.println("======================================");
      System.out.println();
      System.out.println("======================================");
      Manusia c = new Manusia("Tika", "2497860594", false, false);
      System.out.println(c); 
      System.out.println("======================================");
      System.out.println(); 


      System.out.println("======================================");
      MahasiswaFILKOM d = new MahasiswaFILKOM("225150407111023", 1.5, "Tika", "2497860594", false, false);
      System.out.println(d);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      MahasiswaFILKOM e = new MahasiswaFILKOM("225150407111023", 3.4, "Tika", "2497860594", false, false);
      System.out.println(e);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      MahasiswaFILKOM f = new MahasiswaFILKOM("225150407111023", 3.9, "Tika", "2497860594", false, false);
      System.out.println(f);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja g = new Pekerja(1000, LocalDate.of(2021, 4, 7), 2, "Dewi", "88224122003", false, true);
      System.out.println(g);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja h = new Pekerja(1000, LocalDate.of(2014, 3, 15), 0, "Sovi", "456734509876", false, false);
      System.out.println(h);
      System.out.println("======================================");
      System.out.println();

      System.out.println("======================================");
      Pekerja i = new Pekerja(1000, LocalDate.of(2003, 4, 5), 10, "Tika", "71029384756", false, true);
      System.out.println(i);
      System.out.println("======================================");
      System.out.println(); 

      Manager j = new Manager("Tika", "71029384756", false, true, 7500, LocalDate.of(2008, 4, 1), 0, "HRD");
      System.out.println(j); 
   }  
}

