class pc {
    int ram,memori;
    String nama;
    Keyboard kibot;
    Mouse mos;
    Monitor moni;
    pc(int ram, int memori, String nama){
        this.nama = nama;
        this.ram = ram;
        this.memori = memori;
    }

    // Relasi berada pada method setData disini menggunakan class mouse monitor dan keyboard
    public void setData(Mouse mos, Monitor moni, Keyboard kibot){
        this.kibot = kibot;
        this.moni = moni;
        this.mos = mos;
    }
}

class Keyboard{
    private String merk;

    public String getMerk() {
        return merk;
    }

    Keyboard(String merk) {
        this.merk = merk;
    }
}

class Mouse{
    private String merk;

    public String getMerk() {
        return merk;
    }

    Mouse(String merk) {
        this.merk = merk;
    }
}

class Monitor{
    private String merk;

    public String getMerk() {
        return merk;
    }

    Monitor(String merk) {
        this.merk = merk;
    }
    
}

class Tugas8{
    public static void main(String args[]){
        pc pc1 = new pc(6,1000,"pc1");
        // membuat objek dari class pc lalu mengisi method setData dengan 
        // tipe data mouse,monitor dan keyboard.
        pc1.setData(new Mouse("ProLink"),new Monitor("samsung"),new Keyboard("Logitech"));
        // KETERANGAN RELASI
        // Dapat dilihat dari class pc bahwa komponen kelas Mouse, Keyboard dan 
        // Cpu baru dibuat setelah pc dibuat. 
        // Apabila objek pc1 dihapus maka semua komponen juga terhapus
    }
}
