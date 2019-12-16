package simdesa;
public class Event extends Desa{
    // nama, jumlahKeluarga, kades,  
    private String nama, jenis;
    private int biaya;
    Desa des;

    public void setData(String nama, int biaya, String jenis){
        this.nama = nama;
        this.biaya = biaya;
        this.jenis = jenis;
    }

    public void showData(){
        System.out.println("\nNama Event : "+nama+"\nJenis Event : "+jenis+"\nBiaya Evet : Rp."+biaya);
    }
}
