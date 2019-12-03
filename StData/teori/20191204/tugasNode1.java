import java.util.Scanner;
class Node{
    public int data;
    public Node kanan;
    public Node kiri;
    public Node(int d){
        data = d;
        kanan = null;
    }
}

class tugasNode1{
    private Scanner in = new Scanner(System.in);
    private Node awal,akhir;
    public tugasNode1(){
        awal = null;
        akhir = null;
    }

    public void tambahDepan(int d){
        Node baru = new Node(d);
        if (awal == null){ 
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        }else{ 
            baru.kanan = awal;
            awal.kiri = baru;
            awal = baru;
            awal.kiri = null;
        }
    }

    public void tambahBelakang(int d){
        Node baru = new Node(d);
        if (awal == null) { 
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        }else {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public Node hapusDepan(){
        if(awal!=null){
            Node temp = awal;
            awal = awal.kanan;
            temp.kanan = null;
            return temp;
        }else{
            System.out.println("List kosong.");
            return null;
        }
    }

    public Node hapusBelakang(){
        if(awal!=null){
            Node bantu ,temp;
            if(awal.kanan==null){
                temp = awal;
                awal = akhir = null;
            }else{
                bantu = awal;
                while(bantu.kanan!=akhir){
                    bantu = bantu.kanan;
                }
                temp = akhir;
                akhir = bantu;
                akhir.kanan = null;
            }
            return temp;
        }else{
            System.out.println("List Kosong.");
            return null;
        }
    }

    public int hitungJumlahSimpul()
    { 
        int N = 0;
        Node bantu;
        bantu = awal;
        while (bantu!=null)
        { 
            N++;
            bantu = bantu.kanan;
        }
        return(N);
    }

    public void tukarNilai( Node X, Node Y)
    { 
        Node sementara = new Node(4);
        sementara.data = X.data;
        X.data = Y.data;
        Y.data = sementara.data;
    }

    public void mengurutkanData()
    {
        int N = hitungJumlahSimpul();
        Node bantu = awal;
        System.out.println ("Banyaknya simpul = " + hitungJumlahSimpul());
        for (int i=1; i<= hitungJumlahSimpul(); i++){
            //khusus menguji simpul pertama dgn sebelahnya
            if (awal.data <= awal.kanan.data){
                bantu = awal.kanan;
                awal.kanan = bantu.kanan;
                bantu.kanan.kiri = awal;
                bantu.kanan = awal;
                bantu.kiri = null;
                awal.kiri = bantu;
                awal = bantu;
            }
            //khusus menguji simpul kedua dgn sebelahnya, simpul ketiga dgn sebelahnya,dst,
            bantu = awal;
            while (bantu.kanan != akhir)
            { 
                Node A = bantu.kanan;
                Node B = bantu.kanan.kanan;
                if (A.data <= B.data){
                    //tukarkan simpul A dan simpul B
                    A.kanan = B.kanan;
                    if (B!=akhir) A.kanan.kiri = A;
                    B.kanan.kiri = A;
                    B.kanan = A;
                    A.kiri = B;
                    bantu.kanan = B;
                    B.kiri = bantu;
                    if (B==akhir) akhir = A;
                }
                bantu = bantu.kanan;
            }
            System.out.println ("");
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI=====");
    }

    public void cariLinear(int d)
    {
        if (awal==null) // jika senarai masih kosong
        System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            boolean statusKetemu = false;
            int i = 0;
            int posisiKetemu=-1;
            Node bantu;
            bantu = awal;
            while (bantu != null)
            {
                if (d == bantu.data)
                { 
                    statusKetemu = true;
                    posisiKetemu = i;
                }
                bantu = bantu.kanan;
                i++;
            }
            System.out.println("Status Ketemu = "+statusKetemu +" di posisi ke "+posisiKetemu);
        }
    }

    public void cetakSenarai()
    {
        if (awal==null)
        System.out.print("....List Kosong.....");
        else
        {
            Node bantu;
            bantu = awal;
            while (bantu != null)
            {
                System.out.println(bantu.data + "\t ");
                bantu = bantu.kanan;
            }
        }
    }

    public void editData(){
        if (awal==null){
            System.out.println("\n....LIST KOSONG....\nPencarian tidak dapat dilakukan");
        }else{
            System.out.print("Masukkan Data Yang di Edit : ");
            int data = in.nextInt();
            System.out.print(data+" di edit menjadi :");
            int pengganti = in.nextInt();


            boolean statusKetemu = false;
            int i = 0;
            int posisiKetemu=-1;
            Node bantu;
            bantu = awal;
            while (bantu != null)
            {
                if (data==bantu.data)
                { 
                    // Node nodeBaru = new Node(pengganti);
                    statusKetemu = true;
                    posisiKetemu = i;
                    bantu.data = pengganti;
                }
                bantu = bantu.kanan;
                i++;
            }
            System.out.println("\n" + data + " telah diedit menjadi " + pengganti);
        }
    }

    public static void main(String[] args){
        tugasNode1 tg = new tugasNode1();
        Scanner in = new Scanner(System.in);
        int pilihan,pilihankedua,data;
        do{
            System.out.println("----- PILIHAN ----");
            System.out.println("1. Input Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Pencarian Data");
            System.out.println("6. Lihat Data");
            System.out.println("7. Exit");
            System.out.print("Masukkan Pilihan : ");
            pilihan = in.nextInt();
            if(pilihan == 1){
                System.out.println("1. Input Didepan");
                System.out.println("2. Input Dibelakang");
                System.out.print("Masukkan Pilihan : ");
                pilihankedua = in.nextInt();
                System.out.print("Masukkan Data : ");
                data = in.nextInt();
                if(pilihankedua==1){
                    tg.tambahDepan(data);
                }else if(pilihankedua==2){
                    tg.tambahDepan(data);
                }else{
                    System.out.println("Inputan Salah.");
                }
                tg.cetakSenarai();
            }else if(pilihan==2){
                tg.editData();
            }else if(pilihan == 3){
                System.out.println("1. Hapus Didepan");
                System.out.println("2. Hapus Dibelakang");
                System.out.print("Masukkan Pilihan : ");
                pilihankedua = in.nextInt();
                if(pilihankedua==1){
                    tg.hapusDepan();
                }else if(pilihankedua==2){
                    tg.hapusBelakang();
                }else{
                    System.out.println("Inputan Salah.");
                }
                tg.cetakSenarai();
            }else if(pilihan == 4){
                tg.mengurutkanData();
                tg.cetakSenarai();
            }else if(pilihan == 5){
                System.out.print("Masukkan Data Yang Dicari : ");
                data = in.nextInt();
                tg.cariLinear(data);
            }else if(pilihan == 6){
                tg.cetakSenarai();
            }else{
                System.out.println("Inputan Salah");
            }

        }while(pilihan!=7);
        System.out.println("Program Selesai....");
    }
}