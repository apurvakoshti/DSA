public class queueusingjavacollection {
    public static void main(String args[]){
        Queue q= new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
