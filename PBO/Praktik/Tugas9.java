class Peralatan_Elektronik{
    String merk, nama;
    int harga;

    public Peralatan_Elektronik(String n){
        this.nama = n;
        System.out.println("Ini adalah sebuah " + nama);
    }
    
    public void setInfo(String merk, int harga){
        this.harga = harga;
        this.merk = merk;
    }

    public int getHarga(){
        return harga;
    }

    public String getMerk(){
        return merk;
    }

    public void info(){    
        System.out.println("Belum ada info");
    }
}

class Handphone extends Peralatan_Elektronik{
    public Handphone(String n){
        super(n);
    }

    @Override
    public void info(){
        System.out.println("Alat ini adalah " + nama + "\n" + nama + " ini bermerk " + getMerk() + " berharga Rp." + getHarga());
    }
}

class Tugas9{
    public static void main(String[] args){
        Peralatan_Elektronik peralatan1 = new Peralatan_Elektronik("alat elektronik");
        peralatan1.info();
        Handphone hp1 = new Handphone("handpone");
        Handphone hp2 = new Handphone("handphone");
        
        hp1.setInfo("Xiaomi", 1600000);
        hp2.setInfo("Google Pixel", 3000000);

        hp1.info();
        hp2.info();
    }
}