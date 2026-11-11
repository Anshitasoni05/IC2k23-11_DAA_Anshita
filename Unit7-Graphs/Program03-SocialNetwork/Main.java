import java.util.*;
public class Main {
 Map<String,Set<String>> g=new HashMap<>();
 void connect(String a,String b){g.computeIfAbsent(a,k->new HashSet<>()).add(b);g.computeIfAbsent(b,k->new HashSet<>()).add(a);}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main n=new Main();while(true){System.out.println("1.Add friendship 2.Friends of friend 3.Components 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1)n.connect(s.next(),s.next());if(c==2){String p=s.next();Set<String>r=new TreeSet<>();for(String f:n.g.getOrDefault(p,Set.of()))r.addAll(n.g.getOrDefault(f,Set.of()));r.remove(p);r.removeAll(n.g.getOrDefault(p,Set.of()));System.out.println(r);}if(c==3){Set<String>seen=new HashSet<>();int count=0;for(String p:n.g.keySet())if(seen.add(p)){count++;Queue<String>q=new ArrayDeque<>();q.add(p);while(!q.isEmpty())for(String z:n.g.get(q.remove()))if(seen.add(z))q.add(z);}System.out.println("Connected components: "+count);}}}
}
