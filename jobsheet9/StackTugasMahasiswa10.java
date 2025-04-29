package jobsheet9;
public class StackTugasMahasiswa10 {
    mahasiswa10[] stack;
    int top;
    int size;

    public StackTugasMahasiswa10(int size) {
        this.size = size;
        stack = new mahasiswa10[size];
        top = -1;
    }
    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(mahasiswa10 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public mahasiswa10 pop(){
        if(!isEmpty()){
            mahasiswa10 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public mahasiswa10 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    //modif no4 percobaan 1
    public mahasiswa10 peekTerbawah(){
        if(!isEmpty()){
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    //modif no5 percobaan 1
    public int jumlahTugas(){
        return top + 1;
    }
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    //percobaan 2
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi10 stack = new StackKonversi10();
        while(nilai > 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}