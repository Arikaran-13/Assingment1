package Class_And_Objects;

public class Question5 {
    public static void main(String[] args) {
        queueArray queue = new queueArray();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
class queueArray{
    private int [] arr = new int[5];
    private int f=0;
    private int l =0;

    public void enqueue(int elem){
        if(arr.length<=l){
            System.out.println("Queue is full");
        }
        else{
            arr[l]=elem;
            l++;
        }
    }
    public void dequeue(){
        if(l==f){
            System.out.println("Queue is empty");
        }
        else{
            for (int i = 1; i < l; i++) {
                arr[i-1]=arr[i];
            }
            l--;
        }
    }
    public void display(){
        for (int i = 0; i < l ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}