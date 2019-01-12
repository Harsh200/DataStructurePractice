import java.util.*;
// implementation of queue class
    public class mainq{
        public static void main(String args[]){
            queue q=new queue();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter element in queue");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            q.enqueue(a);
            q.enqueue(b);
            q.enqueue(c);
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            q.showall();
        }
    }
