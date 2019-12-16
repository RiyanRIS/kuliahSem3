package simdesa;
import java.util.Scanner;
class Tugas{

    public static void main(String args[]){
        Desa desa1 = new Desa();
        Event event[] = new Event[100];
        Keluarga kel[] = new Keluarga[100];
        int i = 1;

        // class desa digunakan untuk menyimpan data desa
        // class event digunakan untuk menyimpan data event

        desa1.setData("Desa Maju Terus",34,"Karno");
        
        event[0] = new Event();
        event[0].setData("Bersih Desa",1000000,"Kerja Bakti");
        event[1] = new Event();
        event[1].setData("Pengajian Umum",2500000,"Rohani");

        kel[0] = new Keluarga();
        kel[0].setData("Basuki",4,"60G");
        kel[1] = new Keluarga();
        kel[1].setData("Surya",4,"60C");
        kel[2] = new Keluarga();
        kel[2].setData("Supriono",7,"9A");

        for(int a = 0;a<3;a++){
            for(int b = 0;b<2;b++){
                System.out.println("\n-------------"+i+"--------------");
                desa1.showData();
                event[b].showData();
                kel[a].showData();
                i++;
            }
        }

    }
}
