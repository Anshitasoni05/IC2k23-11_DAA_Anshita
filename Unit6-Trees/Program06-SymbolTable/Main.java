import java.util.*;
public class Main {
 static class N{String key,value;N l,r;N(String k,String v){key=k;value=v;}}
 N root;
 N put(N n,String k,String v){if(n==null)return new N(k,v);int c=k.compareTo(n.key);if(c<0)n.l=put(n.l,k,v);else if(c>0)n.r=put(n.r,k,v);else n.value=v;return n;}
 String get(N n,String k){while(n!=null){int c=k.compareTo(n.key);if(c==0)return n.value;n=c<0?n.l:n.r;}return null;}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main t=new Main();while(true){System.out.println("1.Define identifier 2.Lookup 0.Exit");int c=s.nextInt();if(c==0)break;String k=s.next();if(c==1)t.root=t.put(t.root,k,s.next());if(c==2)System.out.println(Objects.toString(t.get(t.root,k),"Undefined identifier"));}}
}
