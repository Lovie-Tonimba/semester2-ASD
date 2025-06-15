package jobsheet11;
public class QueueLinkedList {
    NodeAntrian front;
    NodeAntrian rear;
    int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return false;
    }
    public void print(){
        if(!isEmpty()){
            NodeAntrian tmp = front;
            System.out.println("Mahasiswa yang mengantri:");
            while (tmp != null) { 
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Antrian masih kosong, belum ada mahasiswa yang mendaftar");
        }
    }
    public void enqueue(Mahasiswa mahasiswa) {
        NodeAntrian newNode = new NodeAntrian(mahasiswa);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa dengan nama " + mahasiswa.nama + " berhasil mendaftar ke antrian layanan unit kemahasiswaan");
    }
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, belum ada mahasiswa yang mendaftar");
            return null;
        }
        Mahasiswa mahasiswaDipanggil = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        System.out.println("Panggilan mahasiswa atas nama " + mahasiswaDipanggil.nama + " dengan NIM " + mahasiswaDipanggil.nim);
        return mahasiswaDipanggil;
    }

    //     public Kendaraan dequeue(){
    //     if(isEmpty()){
    //         System.out.println("Antrian masih kosong, belum ada kendaraan yang mengantri");
    //         return null;
    //     }
    //     Kendaraan kendaraanYangDilayani = head.data;
    //     head = head.next;
    //     size--;
    //     if(isEmpty()){
    //         tail = null;
    //     }
    //     System.out.println("Petugas melayani " + kendaraanYangDiLayani.platNomor);
    //     return kendaraanYangDilayani;
    // }


    public Mahasiswa peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, belum ada mahasiswa yang mendaftar");
            return null;
        }
        front.data.tampilInformasi();
        return front.data;
    }
    public Mahasiswa peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, belum ada mahasiswa yang mendaftar");
            return null;
        }
        rear.data.tampilInformasi();
        return rear.data;
    }
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
    public int size() {
        return size;
    }
}
