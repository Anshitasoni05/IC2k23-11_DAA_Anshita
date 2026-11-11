import java.util.*;
public class Main {
 public static void main(String[]x){Scanner s=new Scanner(System.in);System.out.print("Courses and prerequisite links: ");int n=s.nextInt(),m=s.nextInt();List<List<Integer>>g=new ArrayList<>();int[]in=new int[n];for(int i=0;i<n;i++)g.add(new ArrayList<>());for(int i=0;i<m;i++){int pre=s.nextInt(),course=s.nextInt();g.get(pre).add(course);in[course]++;}Queue<Integer>q=new ArrayDeque<>();for(int i=0;i<n;i++)if(in[i]==0)q.add(i);List<Integer>order=new ArrayList<>();while(!q.isEmpty()){int u=q.remove();order.add(u);for(int v:g.get(u))if(--in[v]==0)q.add(v);}if(order.size()!=n)System.out.println("Cycle detected: prerequisites impossible");else System.out.println("Valid order: "+order);}
}
