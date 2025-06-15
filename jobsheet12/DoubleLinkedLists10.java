package jobsheet12;

public class DoubleLinkedLists10 {
    Node10 head;
    Node10 tail;
    int size;

    public DoubleLinkedLists10() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa10 data){
        if(isEmpty()){
            head = new Node10(null, data, null);
            tail = head;
        }else{
            Node10 newNode = new Node10(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa10 data){
        if(isEmpty()){
            // head = tail = newNode;
            addFirst(data);
        }else{
            Node10 newNode = new Node10(tail, data, null);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void add(Mahasiswa10 data, int index)throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        else if (index == 0) {
            addFirst(data);
        }
        else if (index == size) {
            addLast(data);
        }
        else {
            Node10 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node10 newNode = new Node10(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++; 
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        Mahasiswa10 deletedData = head.data;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next; 
            head.prev = null;
        }
        size--;
         System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        Mahasiswa10 deletedData = tail.data;
        if (size == 1) { 
            head = null;
            tail = null; 
        } else {
            tail = tail.prev; 
            if (tail != null) { 
                tail.next = null; 
            } else {
                head = null; 
            }
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }

    public void removeAfter(String keyNim) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus setelah node tertentu!");
        }
        Node10 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }

        Node10 nodeToDelete = current.next; 
        Mahasiswa10 deletedData = nodeToDelete.data;

        current.next = nodeToDelete.next;
        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = current;
        } else {
            tail = current;
        }
        nodeToDelete.prev = null; 
        nodeToDelete.next = null; 

        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas atau Linked List kosong!");
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node10 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Mahasiswa10 deletedData = current.data; 
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.prev = null; 
            current.next = null; 
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus. Data yang terhapus adalah:");
            deletedData.tampil();
        }
    }

    public Node10 search(String nim){
        Node10 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) { 
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void insertAfter(String keyNim, Mahasiswa10 data){
        Node10 current = head;
        //Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) { 
            current = current.next;
        }
        if(current == null){
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node10 newNode = new Node10(current, data, current.next);

        //Jika current adalah tail, cukup tambahkan di akhir
        if(current == tail){
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else{
            //Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        //modif nomor 6
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak ada data untuk ditampilkan.");
        }else{
            Node10 current = head;
            while (current != null) { 
                current.data.tampil();
                current = current.next;
            }
        }
    }
    public Mahasiswa10 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        return head.data;
    }

    public Mahasiswa10 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        return tail.data;
    }

    public Mahasiswa10 get(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas atau Linked List kosong!");
        }
        Node10 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public int getSize() {
        return size;
    }
}