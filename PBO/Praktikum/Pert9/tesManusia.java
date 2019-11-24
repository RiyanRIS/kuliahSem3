abstract class Manusia{
    protected String nama;
    protected int umur;
    public void getData(){
        System.out.print("nama : "+nama+"/n umur : "+umur+" adalah ");
    }
    abstract public void getJabatan(); 
}

class Dosen extends Manusia{
    public Dosen(int umur, String nama){
        this.umur = umur;
        this.nama = nama;
    }
    public void getJabatan(){
        System.out.println("Dosen");
    }
}

class Mahasiswa extends Manusia{
    public Mahasiswa(int umur, String nama){
        this.umur = umur;
        this.nama = nama;
    }
    public void getJabatan(){
        System.out.println("Mahasiswa");
    }
}

class tesManusia{
    public static void cetakData(Manusia mns){
        mns.getData();mns.getJabatan();
    }

    public static void main(String args[]){
        Dosen dsn = new Dosen(50,"Rully");
        Mahasiswa mhs = new Mahasiswa(20,"Meli");
        cetakData(dsn);
        cetakData(mhs);
    }
}