package Latihan;
interface Bangun2D {
    public double hitungLuas ();
    public double hitungKeliling ();
}
interface Bangun3D {
    public double hitungVolume ();
    public void tampilInfo ();
}
interface Pola {
    public void setWarna (String warna);
    public String getWarna ();
}

class Lingkaran implements Bangun2D {

    private double jejari;
    public void setJejari(double jejari) {
        this.jejari = jejari;
    }

    public double getJejari() {
        return this.jejari;
    }
    public double hitungLuas() {
        return (3.14 * this.jejari * this.jejari);
    }
    public double hitungKeliling() {
        return (2 * 3.14 * this.jejari);
    }
}

public class Tabung implements Bangun3D, Pola {
    private double tinggi;
    private Lingkaran alas;
    private String warna;
    
    public void setTinggi(double tg){
        this.tinggi = tg;
    }
    
    public double hitungVolume (){
        alas = new Lingkaran();
        alas.setJejari(10);
        alas.hitungLuas();
        double volum = alas.hitungLuas()*tinggi;
        return volum;
    }
    
    public void tampilInfo (){
        System.out.println("Engkau aaaaaku cinta, dengan segenap rasa dihati...");
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna (){
        return warna;
    }  
}
