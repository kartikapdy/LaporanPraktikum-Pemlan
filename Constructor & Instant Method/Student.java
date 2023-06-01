public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int jumlahObjek = 0;
    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }
        
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = 0;
        jumlahObjek++;
    }
    // contoh objek dari penambahan connstructor
    public Student(double mathg, double englishg, double scienceg){
        mathGrade = mathg;
        englishGrade = englishg;
        scienceGrade = scienceg;
        jumlahObjek++;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    // method boolean
    private boolean statusAkhir(){
        boolean lulus = true;
        getAverage();
        if(average>=61){
            lulus = false;
        }
        return lulus;
    }

    public void jumlahObjek(){
        System.out.println("Jumlah objek yang digunakan adalah : " + jumlahObjek);
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata"+getAverage());
        
        //boolean
        if(statusAkhir() == false){
            System.out.println("siswa " + name + "dinyatakan lolos");
        }else{
            System.out.println("siswa "+ name + "dinyatakan tidak lolso");
        }
    }
}