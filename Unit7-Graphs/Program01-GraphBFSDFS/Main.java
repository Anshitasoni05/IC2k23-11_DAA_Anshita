import java.util.*;
public class Main {
 List<List<Integer>> g;
 Main(int n){g=new ArrayList<>();for(int i=0;i<n;i++)g.add(new ArrayList<>());}
 void edge(int a,int b){g.get(a).add(b);g.get(b).add(a);}
 void bfs(int s){boolean[]v=new boolean[g.size()];Queue<Integer>q=new ArrayDeque<>();q.add(s);v[s]=true;while(!q.isEmpty()){int u=q.remove();System.out.print(u+" ");for(int w:g.get(u))if(!v[w]){v[w]=true;q.add(w);}}}
 void dfs(int u,boolean[]v){v[u]=true;System.out.print(u+" ");for(int w:g.get(u))if(!v[w])dfs(w,v);}
 public static void main(String[]x){Scanner s=new Scanner(System.in);System.out.print("Vertices edges: ");int n=s.nextInt(),m=s.nextInt();if(n<1||m<0)return;Main g=new Main(n);for(int i=0;i<m;i++){int a=s.nextInt(),b=s.nextInt();if(a<0||b<0||a>=n||b>=n){System.out.println("Invalid edge");return;}g.edge(a,b);}System.out.print("Start: ");int st=s.nextInt();if(st<0||st>=n)return;System.out.print("BFS: ");g.bfs(st);System.out.print("\nDFS: ");g.dfs(st,new boolean[n]);}
}
