import java.util.*;
public class Main {
 public static void main(String[]x){Scanner s=new Scanner(System.in);Deque<String> undo=new ArrayDeque<>(),redo=new ArrayDeque<>();String text="";while(true){System.out.println("Text='"+text+"' 1.Type 2.Undo 3.Redo 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1){undo.push(text);text=s.next();redo.clear();}if(c==2&&!undo.isEmpty()){redo.push(text);text=undo.pop();}if(c==3&&!redo.isEmpty()){undo.push(text);text=redo.pop();}}}
}
