package Class_And_Objects;

public class Question4 {
    public static void main(String[]args){
        stackedArray stack = new stackedArray();
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(11);
        //stack.push(1);
        stack.pop();
        stack.pop();
        stack.peek();
    }
}

class stackedArray{

   private int [] arr = new int[5];
   private int ptr=-1;

    public void push(int element){
        if(ptr>=arr.length){
            System.out.println("Stack memory is full");
        }
        else {
            arr[++ptr] = element;
        }
    }
    public void pop(){
        if(ptr==-1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(arr[ptr--]);
            System.out.println("Element successfully popped");
        }
    }
    public void peek(){
        System.out.println("Peek element is : "+arr[ptr]);
    }

}