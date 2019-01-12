public class queue {

        private int[] q;
        private int size;
        private int front;
        private int rear;
        private int total;

        public queue(){
            size=50;
            front=0;
            rear=0;
            total=0;
            q=new int[size];
        }
        public queue(int size){
            this.size=size;
            front=0;
            rear=0;
            total=0;
            q=new int[this.size];
        }
        public boolean enqueue(int item){
            if(isfull()){
                return false;
            }
            else{
                total++;
                q[rear]=item;
                rear=(rear+1)%size;
                return true;
            }
        }
        public boolean isfull(){
            if(size==total){
                return true;
            }
            else
            {
                return false;
            }
        }
        public int dequeue(){
            int item=q[front];
            total--;
            front=(front+1)%size;
            return item;
        }

        public  void showall(){
            int f=front;
            if(total!=0){
                for(int i=0;i<total;i++){
                    System.out.println(" "+ q[f]);
                    f=(f+1)%size;
                }
            }
        }

}
