/**
 *
 * @author Etem
 */
public class QueueMain {
    public static void main(String[] args){
        //Membuat Object Queue
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();//Menghapus queue pertama (1)
        q.dequeue();//Menghapus queue kedua (2)
        q.dequeue();//Menghapus queue ketiga (3)
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        
        while(!q.isEmpty()){//Hapus dan tampilkan semua data
            long n=q.dequeue();//4,5,6,7,8,9
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
