import java.util.*;
public class Main {
 static class Node{int v;Node next;Node(int v){this.v=v;}}
 Node head;
 void add(int v){Node n=new Node(v);if(head==null){head=n;return;}Node p=head;while(p.next!=null)p=p.next;p.next=n;}
 void insert(int pos,int v){if(pos<0)throw new IllegalArgumentException();Node n=new Node(v);if(pos==0){n.next=head;head=n;return;}Node p=head;for(int i=0;i<pos-1&&p!=null;i++)p=p.next;if(p==null)throw new IndexOutOfBoundsException();n.next=p.next;p.next=n;}
 void delete(int pos){if(pos<0||head==null)throw new IndexOutOfBoundsException();if(pos==0){head=head.next;return;}Node p=head;for(int i=0;i<pos-1&&p!=null;i++)p=p.next;if(p==null||p.next==null)throw new IndexOutOfBoundsException();p.next=p.next.next;}
 void reverse(){Node prev=null,cur=head;while(cur!=null){Node n=cur.next;cur.next=prev;prev=cur;cur=n;}head=prev;}
 void show(){for(Node p=head;p!=null;p=p.next)System.out.print(p.v+" -> ");System.out.println("null");}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main l=new Main();while(true){System.out.println("1.Append 2.Insert(pos value) 3.Delete(pos) 4.Reverse 5.Display 0.Exit");int c=s.nextInt();if(c==0)break;try{if(c==1)l.add(s.nextInt());if(c==2)l.insert(s.nextInt(),s.nextInt());if(c==3)l.delete(s.nextInt());if(c==4)l.reverse();if(c==5)l.show();}catch(Exception e){System.out.println("Invalid position/operation");}}}
}
