package jobsheet11;
public class NodeAntrian {
    Mahasiswa data;
    NodeAntrian next;
    public NodeAntrian() {
    }
    public NodeAntrian(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }
}