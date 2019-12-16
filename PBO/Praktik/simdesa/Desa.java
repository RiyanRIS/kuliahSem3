package simdesa;
class Desa{
    // nama, jumlahKeluarga, kades,  
    private String nama, kades;
    private int jumkel;

    public void setData(String nama, int jumkel, String kades){
        this.nama = nama;
        this.jumkel = jumkel;
        this.kades = kades;
    }

    public void showData(){
        System.out.println("\nNama Desa : "+nama+"\nJumlah Kepala Keluarga : "+jumkel+"\nNama Kades : "+kades);
    }
}
