import java.util.*;
public class Main {
 Deque<Integer> d=new ArrayDeque<>();
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main q=new Main();while(true){System.out.println("1.AddFirst 2.AddLast 3.RemoveFirst 4.RemoveLast 5.Display 0.Exit");int c=s.nextInt();if(c==0)break;try{switch(c){case 1->q.d.addFirst(s.nextInt());case 2->q.d.addLast(s.nextInt());case 3->System.out.println(q.d.removeFirst());case 4->System.out.println(q.d.removeLast());case 5->System.out.println(q.d);default->System.out.println("Invalid");}}catch(Exception e){System.out.println("Deque empty or invalid operation");}}}
}
