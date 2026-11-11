import java.util.*;
public class Main {
 static class N{int v;N prev,next;N(int x){v=x;}}
 N head,tail;
 void insert(int p,int v){if(p<0)throw new IndexOutOfBoundsException();N n=new N(v);if(p==0){n.next=head;if(head!=null)head.prev=n;else tail=n;head=n;return;}N q=head;for(int i=0;i<p-1&&q!=null;i++)q=q.next;if(q==null)throw new IndexOutOfBoundsException();n.next=q.next;n.prev=q;if(q.next!=null)q.next.prev=n;else tail=n;q.next=n;}
 void delete(int p){N q=head;for(int i=0;i<p&&q!=null;i++)q=q.next;if(q==null)throw new IndexOutOfBoundsException();if(q.prev!=null)q.prev.next=q.next;else head=q.next;if(q.next!=null)q.next.prev=q.prev;else tail=q.prev;}
 void reverse(){N q=head;while(q!=null){N t=q.next;q.next=q.prev;q.prev=t;q=t;}N t=head;head=tail;tail=t;}
 void show(){for(N q=head;q!=null;q=q.next)System.out.print(q.v+" <-> ");System.out.println("null");}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main d=new Main();while(true){System.out.println("1.Insert(pos value) 2.Delete(pos) 3.Reverse 4.Display 0.Exit");int c=s.nextInt();if(c==0)break;try{if(c==1)d.insert(s.nextInt(),s.nextInt());if(c==2)d.delete(s.nextInt());if(c==3)d.reverse();if(c==4)d.show();}catch(Exception e){System.out.println("Invalid position");}}}
}
