import java.io.*;
import java.util.*;
public class Latihan2{
	public static void main(String args[]){
        ArrayList<String> arrli = new ArrayList<String>(100);
        if (arrli.isEmpty()==true){
			System.out.println("ArrayList kosong");
		}else{
			System.out.println("ArrayList isi");
		}
		arrli.add("Agungbp");
		arrli.add("Bambang");
		if (arrli.isEmpty()==true){
			System.out.println("ArrayList kosong");
		}else{
			System.out.println("ArrayList isi");
		}
	}
}