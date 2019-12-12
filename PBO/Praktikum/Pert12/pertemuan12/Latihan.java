package pertemuan12;
import java.io.*;

public class Latihan {
   public static void main(String args[]) {
       // penanganan jika index array melebihi kuota
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      // penanganan jika data bukan bertipe number
      try{
	 int num=Integer.parseInt("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}
