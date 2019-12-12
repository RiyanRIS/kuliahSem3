package pertemuan12;
public class BagiNol2 {
  public static void main(String[] args) {
    System.out.println("Sebelum pembagian");
    try { System.out.println(5/0); }
       catch (Exception t) {
            System.out.print("Pesan kesalahan: ");   
       System.out.println(t.getMessage()); 
     }      
     System.out.println("Sesudah pembagian");
   }
}