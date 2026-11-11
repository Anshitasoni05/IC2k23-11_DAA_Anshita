import java.util.*;
public class Main {
 static class Dir{String name;Map<String,Dir> children=new TreeMap<>();Dir(String n){name=n;}}
 Dir root=new Dir("/"),current=root;
 void mkdir(String n){current.children.putIfAbsent(n,new Dir(n));}
 void ls(){System.out.println(current.children.keySet());}
 void tree(Dir d,String prefix){System.out.println(prefix+d.name);for(Dir c:d.children.values())tree(c,prefix+"  ");}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Main fs=new Main();while(true){System.out.println("1.mkdir 2.ls 3.tree 4.cd 5.root 0.exit");int c=s.nextInt();if(c==0)break;if(c==1)fs.mkdir(s.next());if(c==2)fs.ls();if(c==3)fs.tree(fs.root,"");if(c==4){String n=s.next();if(n.equals(".."))fs.current=fs.root;else if(fs.current.children.containsKey(n))fs.current=fs.current.children.get(n);else System.out.println("Directory not found");}if(c==5)fs.current=fs.root;}}
}
