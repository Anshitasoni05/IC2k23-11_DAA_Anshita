import java.util.*;
public class Main {
 static class N{int v;N l,r;N(int x){v=x;}}
 N root;
 N put(N n,int x){if(n==null)return new N(x);if(x<n.v)n.l=put(n.l,x);else if(x>n.v)n.r=put(n.r,x);return n;}
 N del(N n,int x){if(n==null)return null;if(x<n.v)n.l=del(n.l,x);else if(x>n.v)n.r=del(n.r,x);else{if(n.l==null)return n.r;if(n.r==null)return n.l;N m=n.r;while(m.l!=null)m=m.l;n.v=m.v;n.r=del(n.r,m.v);}return n;}
 boolean has(N n,int x){while(n!=null){if(x==n.v)return true;n=x<n.v?n.l:n.r;}return false;}
 void inorder(N n){if(n!=null){inorder(n.l);System.out.print(n.v+" ");inorder(n.r);}}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main t=new Main();while(true){System.out.println("1.Insert 2.Delete 3.Search 4.Inorder 0.Exit");int c=s.nextInt();if(c==0)break;int v;if(c>=1&&c<=3){v=s.nextInt();if(c==1)t.root=t.put(t.root,v);if(c==2)t.root=t.del(t.root,v);if(c==3)System.out.println(t.has(t.root,v));}if(c==4)t.inorder(t.root);}}
}
