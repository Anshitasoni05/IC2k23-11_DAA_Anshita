import java.util.*;
public class Main {
 static class Term{int coef,exp;Term next;Term(int c,int e){coef=c;exp=e;}}
 static Term add(Term a,Term b){Term dummy=new Term(0,0),t=dummy;while(a!=null||b!=null){int c,e;if(b==null||(a!=null&&a.exp>b.exp)){c=a.coef;e=a.exp;a=a.next;}else if(a==null||b.exp>a.exp){c=b.coef;e=b.exp;b=b.next;}else{c=a.coef+b.coef;e=a.exp;a=a.next;b=b.next;}if(c!=0){t.next=new Term(c,e);t=t.next;}}return dummy.next;}
 static Term read(Scanner s){System.out.print("Number of terms: ");int n=s.nextInt();Term d=new Term(0,0),t=d;for(int i=0;i<n;i++){System.out.print("coefficient exponent (descending exponents): ");t.next=new Term(s.nextInt(),s.nextInt());t=t.next;}return d.next;}
 static void show(Term t){while(t!=null){System.out.print(t.coef+"x^"+t.exp+(t.next==null?"":" + "));t=t.next;}System.out.println();}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Term a=read(s),b=read(s);show(add(a,b));}
}
