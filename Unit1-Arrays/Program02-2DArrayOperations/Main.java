import java.util.*;
public class Main {
 public static void main(String[] z){Scanner s=new Scanner(System.in);
  System.out.print("Rows and columns: ");int r=s.nextInt(),c=s.nextInt();
  if(r<=0||c<=0||r>50||c>50){System.out.println("Dimensions must be 1..50");return;}
  int[][] a=new int[r][c]; System.out.println("Enter matrix:");
  for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();
  while(true){System.out.println("1.Display 2.Search 3.Rotate clockwise 0.Exit");int op=s.nextInt();if(op==0)break;
   if(op==1)show(a);
   else if(op==2){int x=s.nextInt();boolean found=false;for(int i=0;i<r;i++)for(int j=0;j<c;j++)if(a[i][j]==x){System.out.println("Found at "+i+","+j);found=true;}if(!found)System.out.println("Not found");}
   else if(op==3){if(r!=c){System.out.println("Rotation requires a square matrix.");continue;}for(int i=0;i<r;i++)for(int j=i+1;j<c;j++){int t=a[i][j];a[i][j]=a[j][i];a[j][i]=t;}for(int[] row:a)for(int l=0,h=c-1;l<h;l++,h--){int t=row[l];row[l]=row[h];row[h]=t;}show(a);}
  }
 }
 static void show(int[][] a){for(int[] row:a)System.out.println(Arrays.toString(row));}
}
