import java.util.*;
public class Main {
 static class N{String v;N l,r;N(String x){v=x;}}
 static N build(String p){Deque<N>s=new ArrayDeque<>();for(char c:p.toCharArray()){N n=new N(""+c);if("+-*/".indexOf(c)>=0){if(s.size()<2)throw new IllegalArgumentException("Invalid postfix");n.r=s.pop();n.l=s.pop();}s.push(n);}if(s.size()!=1)throw new IllegalArgumentException("Invalid postfix");return s.pop();}
 static int eval(N n){if(n.l==null)return Integer.parseInt(n.v);int a=eval(n.l),b=eval(n.r);return switch(n.v){case "+"->a+b;case "-"->a-b;case "*"->a*b;case "/"->{if(b==0)throw new ArithmeticException("divide by zero");yield a/b;}default->0;};}
 public static void main(String[]x){Scanner s=new Scanner(System.in);System.out.print("Postfix expression (single digit operands): ");try{N r=build(s.next());System.out.println("Evaluated result: "+eval(r));}catch(Exception e){System.out.println(e.getMessage());}}
}
