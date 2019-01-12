import java.util.*;
public class stackimplementation {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no to store in stack");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            int f=sc.nextInt();
            Intstack obj=new Intstack();
            if(!obj.isfull()){
                obj.push(a);
                obj.push(b);
                obj.push(c);
                obj.push(d);
                obj.push(e);
                obj.push(f);
            }
            System.out.println("pop element is " + "=" +obj.pop());
            System.out.println("pop element is " + "=" +obj.pop());
            System.out.println("pop element is " + "=" +obj.pop());
            System.out.println("pop element is " + "=" +obj.pop());
            System.out.println("pop element is " + "=" +obj.pop());
            System.out.println("pop element is " + "=" +obj.pop());
        }
    }



