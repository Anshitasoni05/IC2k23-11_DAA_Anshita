import java.util.*;
public class Main {
 static class HashDictionary {List<String>[] buckets;HashDictionary(int n){buckets=new List[n];for(int i=0;i<n;i++)buckets[i]=new LinkedList<>();}
 void add(String s){List<String>b=buckets[Math.floorMod(s.hashCode(),buckets.length)];if(!b.contains(s))b.add(s);}
 boolean contains(String s){return buckets[Math.floorMod(s.hashCode(),buckets.length)].contains(s);}
 }
 public static void main(String[]x){Scanner s=new Scanner(System.in);HashDictionary d=new HashDictionary(11);while(true){System.out.println("1.Add word 2.Search word 3.Show sorted dictionary 0.Exit");int c=s.nextInt();if(c==0)break;String w;if(c==1){w=s.next();d.add(w);}else if(c==2){w=s.next();System.out.println(d.contains(w)?"Found":"Not found");}else if(c==3){for(List<String>b:d.buckets)for(String v:b)System.out.println(v);}else System.out.println("Invalid");}}
}
