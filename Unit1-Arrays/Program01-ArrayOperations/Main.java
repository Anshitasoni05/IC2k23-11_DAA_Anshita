import java.util.*;
public class Main {
  static void print(int[] a){ System.out.println(Arrays.toString(a)); }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); int[] a={10,20,30,40};
    while(true){
      System.out.println("\n1.Display 2.Insert 3.Delete 4.Search 5.Left rotate 0.Exit");
      int ch=sc.nextInt(); if(ch==0) break;
      try {
        switch(ch){
          case 1 -> print(a);
          case 2 -> { System.out.print("Index and value: "); int i=sc.nextInt(),v=sc.nextInt();
            if(i<0||i>a.length) throw new IndexOutOfBoundsException();
            int[] b=new int[a.length+1]; System.arraycopy(a,0,b,0,i); b[i]=v;
            System.arraycopy(a,i,b,i+1,a.length-i); a=b; print(a); }
          case 3 -> { System.out.print("Index: "); int i=sc.nextInt();
            if(i<0||i>=a.length) throw new IndexOutOfBoundsException();
            int[] b=new int[a.length-1]; System.arraycopy(a,0,b,0,i);
            System.arraycopy(a,i+1,b,i,a.length-i-1); a=b; print(a); }
          case 4 -> { System.out.print("Value: "); int v=sc.nextInt(),p=-1;
            for(int i=0;i<a.length;i++) if(a[i]==v){p=i;break;}
            System.out.println("Index: "+p); }
          case 5 -> { if(a.length>0){int first=a[0];System.arraycopy(a,1,a,0,a.length-1);a[a.length-1]=first;} print(a); }
          default -> System.out.println("Choose a valid option.");
        }
      } catch(IndexOutOfBoundsException e){System.out.println("Invalid index.");}
    }
  }
}
