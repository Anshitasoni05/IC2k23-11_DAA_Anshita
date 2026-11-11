import java.util.*;
public class Main {
 static class Line{String text;Line prev,next;Line(String s){text=s;}}
 Line head,tail,current;
 void append(String s){Line n=new Line(s);if(tail==null)head=n;else{tail.next=n;n.prev=tail;}tail=n;current=n;}
 void move(int delta){if(current==null)return;Line n=current;while(delta>0&&n.next!=null){n=n.next;delta--;}while(delta<0&&n.prev!=null){n=n.prev;delta++;}current=n;}
 void edit(String s){if(current==null)append(s);else current.text=s;}
 void show(){int i=1;for(Line n=head;n!=null;n=n.next)System.out.println((i++)+": "+n.text);}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main e=new Main();while(true){System.out.println("1.Append line 2.Move previous 3.Move next 4.Edit current 5.Show 0.Exit");int c=Integer.parseInt(s.nextLine());if(c==0)break;if(c==1)e.append(s.nextLine());if(c==2)e.move(-1);if(c==3)e.move(1);if(c==4)e.edit(s.nextLine());if(c==5)e.show();}}
}
