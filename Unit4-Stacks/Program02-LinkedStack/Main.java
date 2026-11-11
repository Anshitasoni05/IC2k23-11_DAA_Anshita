import java.util.*;
public class Main {
 static class N{int v;N next;N(int x,N n){v=x;next=n;}} N top;
 void push(int x){top=new N(x,top);}int pop(){if(top==null)throw new NoSuchElementException("Underflow");int x=top.v;top=top.next;return x;}
 public static void main(String[]z){Scanner s=new Scanner(System.in);Main st=new Main();while(true){System.out.println("1.Push 2.Pop 3.Peek 0.Exit");int c=s.nextInt();if(c==0)break;try{if(c==1)st.push(s.nextInt());if(c==2)System.out.println(st.pop());if(c==3)System.out.println(st.top==null?"Empty":st.top.v);}catch(Exception e){System.out.println(e.getMessage());}}}
}
