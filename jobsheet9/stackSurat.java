package jobsheet9;
public class stackSurat {
    surat10[] stack;
    int top;
    int size;
    public stackSurat(int size) {
        this.size = size;
        stack = new surat10[size];
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
    public void push(surat10 surat){
        if(!isFull()){
            top++;
            stack[top] = surat;
        }else{
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
    public surat10 pop(){
        if(!isEmpty()){
            surat10 surat = stack[top];
            top--;
            return surat;
        }else{
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
    public surat10 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada surat yang diterima");
            return null;
        }
    }
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }
    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}