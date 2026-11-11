import java.util.*;
public class Main {
 record Student(int roll,String name,double marks){}
 public static void main(String[]x){Scanner s=new Scanner(System.in);List<Student> a=new ArrayList<>();while(true){System.out.println("1.Add 2.List by roll 3.Search roll 0.Exit");int c=s.nextInt();if(c==0)break;if(c==1){System.out.print("Roll name marks: ");int r=s.nextInt();String n=s.next();double m=s.nextDouble();if(m<0||m>100){System.out.println("Marks must be 0..100");continue;}a.add(new Student(r,n,m));}if(c==2){a.sort(Comparator.comparingInt(Student::roll));a.forEach(System.out::println);}if(c==3){int k=s.nextInt();System.out.println(a.stream().filter(v->v.roll()==k).findFirst().orElse(null));}}}
}
