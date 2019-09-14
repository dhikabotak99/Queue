/**
 *
 * @author Etem
 */
public class Queue {
    private int max;//Membuat nilai maksimal pada array
    private int front;//Nilai paling awal
    private int rear;//Nilai paling akhir
    private int nItems;//Jumlah Item
    private long[] queue;
    
    //Constructor
    public Queue(int s){
        max=s;
        queue = new long[max];
        front=0;
        rear=-1;
        nItems=0;
    }
    //Untuk Menabah Item di Queue
    public void enqueue(long j){
        if (rear==max-1) {//Mengatur lokasi Rear
            rear=-1;
        }
        queue[++rear]=j;//Menabahkan nilai rear dan memasukkan nilai
        nItems++;//Menambahkan nilai nItems
    }
    //Untuk Menghapus Item di Queue
    public long dequeue(){
        long temp = queue[front++];//Mengambil value dan mengurangi nilai front
        if (front==max) {//Mengatur Lokasi Front
            front=0;
        }
        nItems--;
        return temp;
    }
    //Jika queue kosong
    public boolean isEmpty(){
        return(nItems==0);
    }
}
