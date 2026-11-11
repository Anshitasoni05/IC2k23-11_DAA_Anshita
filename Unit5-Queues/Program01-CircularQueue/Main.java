import java.util.*;
public class Main {
 int[] a;int front=0,size=0;Main(int n){a=new int[n];}
 void add(int x){if(size==a.length)throw new IllegalStateException("Queue full");a[(front+size)%a.length]=x;size++;}
 int remove(){if(size==0)throw new NoSuchElementException("Queue empty");int x=a[front];front=(front+1)%a.length;size--;return x;}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main q=new Main(5);while(true){System.out.println("1.Enqueue 2.Dequeue 3.Display 0.Exit");int c=s.nextInt();if(c==0)break;try{if(c==1)q.add(s.nextInt());if(c==2)System.out.println(q.remove());if(c==3)for(int i=0;i<q.size;i++)System.out.print(q.a[(q.front+i)%q.a.length]+" ");}catch(Exception e){System.out.println(e.getMessage());}}}
}
