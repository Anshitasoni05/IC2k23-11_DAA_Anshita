import java.util.*;
public class Main {
 static class N{int v;N l,r;N(int x){v=x;}}
 static void pre(N n){if(n!=null){System.out.print(n.v+" ");pre(n.l);pre(n.r);}}
 static void in(N n){if(n!=null){in(n.l);System.out.print(n.v+" ");in(n.r);}}
 static void post(N n){if(n!=null){post(n.l);post(n.r);System.out.print(n.v+" ");}}
 public static void main(String[]x){N r=new N(1);r.l=new N(2);r.r=new N(3);r.l.l=new N(4);r.l.r=new N(5);System.out.print("Preorder: ");pre(r);System.out.print("\nInorder: ");in(r);System.out.print("\nPostorder: ");post(r);System.out.print("\nIterative level order: ");Queue<N>q=new ArrayDeque<>();q.add(r);while(!q.isEmpty()){N n=q.remove();System.out.print(n.v+" ");if(n.l!=null)q.add(n.l);if(n.r!=null)q.add(n.r);}}
}
