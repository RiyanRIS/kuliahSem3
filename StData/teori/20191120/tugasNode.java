import java.util.Scanner;
class Node{
    public int data;
    public Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}

class tugasNode{
    private Scanner in = new Scanner(System.in);
    private Node head,tail;
    public tugasNode(){
        head = null;
    }

    public void tambahDepan(int d){
        Node baru = new Node(d);
        if(head==null){
            head = baru;
            tail = baru;
        }else{
            baru.next = head;
            head = baru;
        }
    }

    public void tambahBelakang(int d){
        Node baru = new Node(d);
        if(head==null){
            head = baru;
            tail = baru;
        }else{
            tail.next = baru;
            tail = baru;
            baru.next = null;
        }
    }

    public Node hapusDepan(){
        if(head!=null){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }else{
            System.out.println("\nList kosong");
            return null;
        }
    }

    public Node hapusBelakang(){
        if(head!=null){
            Node bantu ,temp;
            if(head.next==null){
                temp = head;
                head = tail = null;
            }else{
                bantu = head;
                while(bantu.next!=tail){
                    bantu = bantu.next;
                }
                temp = tail;
                tail = bantu;
                tail.next = null;
            }
            return temp;
        }else{
            System.out.println("\nList Kosong");
            return null;
        }
    }

    public int hitungJumlahSimpul()
    { 
        int N = 0;
        Node bantu;
        bantu = head;
        while (bantu!=null)
        { 
            N++;
            bantu = bantu.next;
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
        int N = this.hitungJumlahSimpul();
        Node A=null;
        Node B=null;
        Node berhenti = tail.next;
        System.out.println ("Banyaknya simpul = " + hitungJumlahSimpul());
        for (int i=1; i<= this.hitungJumlahSimpul()-1; i++)
        {
            A = head;
            B = head.next;
            int nomor = 1;
            while (B != berhenti)
            { 
                if (A.data > B.data){
                    this.tukarNilai(A,B);
                }
                A = A.next;
                B = B.next;
                nomor++;
            }
            berhenti = A;
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    public void cariLinear(int d)
    {
        if (head==null) // jika senarai masih kosong
        System.out.println("\n....LIST KOSONG....\nPencarian tidak dapat dilakukan");
        else // jika senarai tidak kosong
        {
            boolean statusKetemu = false;
            int i = 0;
            int posisiKetemu=-1;
            Node bantu;
            bantu = head;
            while (bantu != null)
            {
                if (d == bantu.data)
                { 
                    statusKetemu = true;
                    posisiKetemu = i;
                }
                bantu = bantu.next;
                i++;
            }
            System.out.println("\nStatus Ketemu = "+statusKetemu +" di posisi ke "+posisiKetemu);
        }
    }

    public void editData(){
        if (head==null){
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
            bantu = head;
            while (bantu != null)
            {
                if (data==bantu.data)
                { 
                    // Node nodeBaru = new Node(pengganti);
                    statusKetemu = true;
                    posisiKetemu = i;
                    bantu.data = pengganti;
                }
                bantu = bantu.next;
                i++;
            }
            System.out.println("\n" + data + " telah diedit menjadi " + pengganti);
        }
    }

    public void cetakSenarai()
    {
        System.out.println("\nList Data :");
        if (head==null)
        System.out.print("....List Kosong.....");
        else
        {
            Node bantu;
            bantu = head;
            while (bantu != null)
            {
                System.out.print(bantu.data + "\t ");
                bantu = bantu.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        tugasNode tg = new tugasNode();
        Scanner in = new Scanner(System.in);
        int pilihan,pilihankedua,data;
        do{
            System.out.println("\n----- PILIHAN ----");
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
                System.out.println("\n1. Input Didepan");
                System.out.println("2. Input Dibelakang");
                System.out.print("Masukkan Pilihan : ");

                pilihankedua = in.nextInt();
                System.out.print("Masukkan Data : ");
                data = in.nextInt();

                if(pilihankedua==1){
                    tg.tambahDepan(data);
                }else if(pilihankedua==2){
                    tg.tambahBelakang(data);
                }else{
                    System.out.println("Inputan Salah.");
                }
                tg.cetakSenarai();
            }else if(pilihan==2){
                // System.out.println("\n--- BELUM BISA MELAKUKAN EDIT DATA ---");
                tg.editData();
            }else if(pilihan == 3){
                System.out.println("1. Hapus Didepan");
                System.out.println("2. Hapus Dibelakang");
                System.out.print("Masukkan Pilihan : ");
                pilihankedua = in.nextInt();
                if(pilihankedua==1){
                    tg.hapusDepan();
                    tg.cetakSenarai();
                }else if(pilihankedua==2){
                    tg.hapusBelakang();
                    tg.cetakSenarai();
                }else{
                    System.out.println("Inputan Salah.");
                }
            }else if(pilihan == 4){
                int OXO = tg.hitungJumlahSimpul();
                if(OXO==0){
                    System.out.println("\n.........List Kosong..........\n Tidak ada data untuk diurutkan");
                }else{
                    tg.mengurutkanData();
                    tg.cetakSenarai();
                }
            }else if(pilihan == 5){
                System.out.print("Masukkan Data Yang Dicari : ");
                data = in.nextInt();
                tg.cariLinear(data);
            }else if(pilihan == 6){
                tg.cetakSenarai();
            }else if(pilihan == 7){
            }else{
                System.out.println("Inputan Salah");
            }

        }while(pilihan!=7);
        System.out.println("Program Selesai....");
    }
}
