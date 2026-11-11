import java.util.*;
public class Main {
 int[] a;int top=-1;Main(int n){if(n<1)throw new IllegalArgumentException();a=new int[n];}
 void push(int x){if(top==a.length-1)throw new IllegalStateException("Stack overflow");a[++top]=x;}
 int pop(){if(top<0)throw new NoSuchElementException("Stack underflow");return a[top--];}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main st=new Main(5);while(true){System.out.println("1.Push 2.Pop 3.Peek 0.Exit");int c=s.nextInt();if(c==0)break;try{if(c==1)st.push(s.nextInt());if(c==2||c==3){if(st.top<0)throw new NoSuchElementException();System.out.println(c==2?st.pop():st.a[st.top]);}}catch(Exception e){System.out.println(e.getMessage());}}}
}
