public class Queue_IN_Array {
    static  class Queue{
        // defined array without size
      static int [] arr;
      static  int size;
      static  int rear;
        //Queue constructor
        Queue(int n){
            arr = new int[n];// array ka size declear kiya hai yaha pr or upeer mai hum na static laga kiya hai array k size ko
                size=n;//size ko n sa initlize kiya hai
            rear=-1;
        }


        public  static  boolean isEmpty(){
            return  rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("this is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
return  front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5); //make object of queue
            q.add(1);
            q.add(2);
            q.add(4);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
    }
}
