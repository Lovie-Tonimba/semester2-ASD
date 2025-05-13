package jobsheet11;
public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa00 mhs2 = new Mahasiswa00("23212201", "Bimon", "2B", 3.8);
        Mahasiswa00 mhs3 = new Mahasiswa00("22212202", "Cintia", "3C", 3.5);
        Mahasiswa00 mhs4 = new Mahasiswa00("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}