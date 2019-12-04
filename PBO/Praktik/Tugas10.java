abstract class Film {
    protected String judul,negara;
    protected int tahun;
    public String asalFilm(){
        return negara;
    }
    abstract public void setNegara(); 
}

interface Mobil {
    public void maju();
    public void mundur();
}

class Honda implements Mobil {

    private String type;
    public String getType() {
        return type;
    }

    Honda(String type) {
        this.type = type;
    }

    public void maju(){
        System.out.println("Mobil Maju");
    }

    public void mundur(){
        System.out.println("Mobil Mundur");
    }
    
}
class AADI extends Film{
    AADI(String judul, int tahun){
        this.judul = judul;
        this.tahun = tahun;
    }
    public void setNegara(){
        System.out.println("BotoranKu");
    }
}