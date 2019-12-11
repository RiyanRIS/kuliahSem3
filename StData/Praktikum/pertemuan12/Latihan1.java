import java.util.LinkedList;
public class Latihan1{

	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.add(new Integer(10));
		list.add(new Double(9.34));
		list.add(new Float(7.25));
		System.out.println("============ Tampil =============");
		for (int i=0; i<= list.size()-1; i++){
			System.out.println(i + " " + list.get(i));
		}
		System.out.println("");
	}
}