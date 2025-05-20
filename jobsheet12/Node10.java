package jobsheet12;

public class Node10 {
    Mahasiswa10 data;
    Node10 prev;
    Node10 next;

    public Node10(Node10 prev, Mahasiswa10 data, Node10 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}