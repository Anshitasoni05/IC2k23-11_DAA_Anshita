import java.util.*;
public class Main {
 static class Song{String name;Song next;Song(String n){name=n;}} Song tail,current;
 void add(String n){Song s=new Song(n);if(tail==null){tail=s;s.next=s;current=s;}else{s.next=tail.next;tail.next=s;tail=s;}}
 void next(){if(current!=null)current=current.next;}
 void previous(){if(current==null)return;Song p=tail.next;while(p.next!=current)p=p.next;current=p;}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main p=new Main();while(true){System.out.println("1.Add song 2.Next 3.Previous 4.Current 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1)p.add(s.next());if(c==2)p.next();if(c==3)p.previous();if(c==4)System.out.println(p.current==null?"Playlist empty":p.current.name);}}
}
