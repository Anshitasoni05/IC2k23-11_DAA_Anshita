import java.util.*;
public class Main {
 static class N{int v,h=1;N l,r;N(int x){v=x;}}
 int h(N n){return n==null?0:n.h;}void fix(N n){n.h=1+Math.max(h(n.l),h(n.r));}
 N right(N y){N x=y.l,t=x.r;x.r=y;y.l=t;fix(y);fix(x);return x;}
 N left(N x){N y=x.r,t=y.l;y.l=x;x.r=t;fix(x);fix(y);return y;}
 N add(N n,int v){if(n==null)return new N(v);if(v<n.v)n.l=add(n.l,v);else if(v>n.v)n.r=add(n.r,v);else return n;fix(n);int b=h(n.l)-h(n.r);if(b>1&&v<n.l.v)return right(n);if(b<-1&&v>n.r.v)return left(n);if(b>1&&v>n.l.v){n.l=left(n.l);return right(n);}if(b<-1&&v<n.r.v){n.r=right(n.r);return left(n);}return n;}
 void show(N n){if(n!=null){show(n.l);System.out.print(n.v+" ");show(n.r);}}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main t=new Main();N r=null;while(true){System.out.println("1.Insert 2.Display 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1)r=t.add(r,s.nextInt());if(c==2)t.show(r);}}
}
