package Polymorphism;

public abstract class Kue {
        private String nama;
        private double harga;
        public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        }
        public String getNama() {
        return nama;
        }
        public double getHarga() {
        return harga;
        }
        public String toString() {
        return String.format("Nama: " + getNama() + " Harga: " + getHarga());
        }
        abstract double hitungHarga();
       }       
