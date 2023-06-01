package Polymorphism;

public class Main {
    public static void main(String[] args) {
        double totalHarga = 0;
        double totalHargaKP = 0;
        double totalHargaKJ = 0;
        double totalBerat = 0;
        double totalJumlah = 0;
        double terbesar = 0;
        Kue kueterbesar = null;
        KueJadi vh = new KueJadi("wanto", 5, 10);
        KuePesanan vo = new KuePesanan("hakim", 10, 15);
        KuePesanan vx = new KuePesanan("sarah", 15, 20);
        KueJadi vq = new KueJadi("syifa", 20, 25);
        KuePesanan vw = new KuePesanan("hikam", 25, 30);
        KuePesanan ve = new KuePesanan("ardi", 30, 35);
        KueJadi vr = new KueJadi("fathur", 35, 40);
        KuePesanan vt = new KuePesanan("mushab", 40, 45);
        KuePesanan vy = new KuePesanan("salman", 45, 50);
        KueJadi vu = new KueJadi("tyo", 50, 55);
        KuePesanan vi = new KuePesanan("jen", 55, 60);
        KueJadi vp = new KueJadi("rizal", 60, 65);
        KuePesanan va = new KuePesanan("nurwan", 65, 70);
        KuePesanan vs = new KuePesanan("dhika", 70, 75);
        KueJadi vd = new KueJadi("khalid", 75, 80);
        KuePesanan vf = new KuePesanan("bagir", 80, 85);
        KuePesanan vg = new KuePesanan("andraw", 85, 90);
        KuePesanan vj = new KuePesanan("alfath", 90, 95);
        KueJadi vk = new KueJadi("haikal", 95, 100);
        KuePesanan vl = new KuePesanan("rehan", 100, 105);
        Kue[] kue = new Kue[20];
        kue[0] = vh;
        kue[1] = vo;
        kue[2] = vx;
        kue[3] = vq;
        kue[4] = vw;
        kue[5] = ve;
        kue[6] = vr;
        kue[7] = vt;
        kue[8] = vy;
        kue[9] = vu;
        kue[10] = vi;
        kue[11] = vp;
        kue[12] = va;
        kue[13] = vs;
        kue[14] = vd;
        kue[15] = vf;
        kue[16] = vg;
        kue[17] = vj;
        kue[18] = vk;
        kue[19] = vl;
        for (Kue a : kue) {
        System.out.println(a);
        System.out.println("Jenis Kue: " + a.getClass().getName());
        System.out.println("");
        if (a instanceof KueJadi) {
        KueJadi kuejadi = (KueJadi) a;
        totalHarga += kuejadi.hitungHarga();
        totalHargaKJ += kuejadi.hitungHarga();
        totalJumlah += kuejadi.getJumlah();
        if (kuejadi.hitungHarga() > terbesar) {
        terbesar = kuejadi.hitungHarga();
        kueterbesar = kuejadi;
        }
        } else if (a instanceof KuePesanan) {
        KuePesanan kuepesanan = (KuePesanan) a;
        totalHarga += kuepesanan.hitungHarga();
        totalHargaKP += kuepesanan.hitungHarga();
        totalBerat += kuepesanan.getBerat();
        if (kuepesanan.hitungHarga() > terbesar) {
        terbesar = kuepesanan.hitungHarga();
        kueterbesar = kuepesanan;
        }
        }
        }
        System.out.println("");
        System.out.println("Total harga keseluruhan: " + totalHarga);
        System.out.println("Total harga kue pesanan: " + totalHargaKP);
        System.out.println("Total harga kue jadi: " + totalHargaKJ);
        System.out.println("Total berat: " + totalBerat);
        System.out.println("Total jumlah: " + totalJumlah);
        System.out.println("Harga kue termahal: " + kueterbesar);
        }
    }