package simdesa;
public class Keluarga extends Desa{
    // nama, jumlahKeluarga, kades,  
    private String namaKepala, alamat;
    private int jumang;

    public void setData(String namaKepala, int jumang, String alamat){
        this.namaKepala = namaKepala;
        this.jumang = jumang;
        this.alamat = alamat;
    }

    public void showData(){
        System.out.println("\nNama Kepala Keluarga : " + namaKepala);
        System.out.println("Jumlah anggota Keluarga : "+jumang);
        System.out.println("Alamat : "+alamat);
    }
}
