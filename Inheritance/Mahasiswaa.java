package Inheritance;
public class Mahasiswaa extends Manusia {
    String nama;
    int umur;
    String nim;

    Mahasiswaa(String nama, int umur, String nim){
        super(nama, umur);
        this.nim = nim;
    }

    @Override
    // void perkenalan(){
    //     System.out.println("Hai aku mahasiswa");
    // }

    public String toString(){
        return super.toString() + " NIM saya " +  this.nim;
    }
}
