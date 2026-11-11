import java.util.*;
public class Main {
 static class N{int v;N next;N(int x){v=x;}} N tail;
 void add(int x){N n=new N(x);if(tail==null){tail=n;n.next=n;}else{n.next=tail.next;tail.next=n;tail=n;}}
 void delete(int x){if(tail==null)throw new NoSuchElementException();N p=tail.next,prev=tail;do{if(p.v==x){if(p==tail&&p.next==tail)tail=null;else{prev.next=p.next;if(p==tail)tail=prev;}return;}prev=p;p=p.next;}while(p!=tail.next);throw new NoSuchElementException();}
 void show(){if(tail==null){System.out.println("Empty");return;}N p=tail.next;do{System.out.print(p.v+" -> ");p=p.next;}while(p!=tail.next);System.out.println("(back to head)");}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main c=new Main();while(true){System.out.println("1.Add 2.Delete value 3.Display 0.Exit");int k=s.nextInt();if(k==0)break;try{if(k==1)c.add(s.nextInt());if(k==2)c.delete(s.nextInt());if(k==3)c.show();}catch(Exception e){System.out.println("Value/list not found");}}}
}
