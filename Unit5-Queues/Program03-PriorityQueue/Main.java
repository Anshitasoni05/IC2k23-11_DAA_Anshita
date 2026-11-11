import java.util.*;
public class Main {
 record Task(String name,int priority){}
 public static void main(String[]x){Scanner s=new Scanner(System.in);PriorityQueue<Task> q=new PriorityQueue<>(Comparator.comparingInt(Task::priority));while(true){System.out.println("1.Add task(name priority) 2.Process next 3.Show 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1)q.add(new Task(s.next(),s.nextInt()));if(c==2)System.out.println(q.isEmpty()?"Queue empty":q.poll());if(c==3)System.out.println(q);}}
}
