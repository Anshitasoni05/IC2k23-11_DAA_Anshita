import java.util.*;
public class Main {
 record Process(String id,int burst){}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Queue<Process> q=new ArrayDeque<>();System.out.print("Number of processes: ");int n=s.nextInt();for(int i=0;i<n;i++){System.out.print("Process ID and burst time: ");String id=s.next();int b=s.nextInt();if(b>0)q.add(new Process(id,b));}int clock=0;System.out.println("Round-robin simulation (quantum=2):");while(!q.isEmpty()){Process p=q.remove();int run=Math.min(2,p.burst());clock+=run;int left=p.burst()-run;System.out.println(p.id()+" ran "+run+"; remaining="+left+"; time="+clock);if(left>0)q.add(new Process(p.id(),left));}}
}
