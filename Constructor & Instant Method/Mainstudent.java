// import java.util.Scanner;
public class Mainstudent {
//     public Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//         System.out.println("Masukkan jumlah siswa yang ingin dimasukkan");
//         Scanner input = new Scanner(System.in);
//         int jumlahSiswa = input.nextInt();

//         Student[] siswa= new Student[jumlahSiswa];

//         System.out.println("===================");
//         for (int i = 0; i<jumlahSiswa; i++){
//             System.out.println("Data siswa ke-" + (i+1));
//             System.out.print("Nama siswa \t: ");
//             String name = input.next();
//             System.out.print("Alamat siswa \t: ");
//             String address = input.next();
//             System.out.print("Umur siswa \t: ");
//             int age = input.nextInt();
//             System.out.print("Nilai matematika \t: ");
//             int math = input.nextInt();
//             System.out.println("Nilai Bahasa Inggris");
//             int english = input.nextInt();
//             System.out.println("Nilai Sains");
//             int Science = input.nextInt();

//             siswa[i] = new Student();
//             siswa[i].setName(name);
//             siswa[i].setAddress(address);
//             siswa[i].setAge(age);
//             siswa[i].setMath(math);
//             siswa[i].setEnglish(english);
//             siswa[i].setScience(Science);
//         }
//         input.close();

//         System.out.println("\n");
//         System.out.println("Data siswa : ");
//         for(int i=0; i < jumlahSiswa; i++){
//             System.out.println("Siswa ke- " + (i+1));
//             siswa[i].displayMessage();
//         }
//     }





        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        anna.jumlahObjek();
        
         //menggunakan constructor lain
         System.out.println("===================");
         Student chris = new Student("Chris", "Kediri", 21);
         chris.setMath(70);
         chris.setScience(60);
         chris.setEnglish(90);
         chris.displayMessage();
         chris.jumlahObjek();

         //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();    

        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        chris.jumlahObjek();

        //contoh objek
        chris = new Student(100, 100, 100);
    }
}
