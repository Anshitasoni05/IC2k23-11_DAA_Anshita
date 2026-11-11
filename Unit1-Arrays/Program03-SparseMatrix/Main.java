import java.util.*;
public class Main {
 public static void main(String[] x){Scanner s=new Scanner(System.in);System.out.print("Rows cols: ");int r=s.nextInt(),c=s.nextInt();if(r<1||c<1||r>100||c>100){System.out.println("Invalid dimensions");return;}
 int[][] a=new int[r][c];int count=0;System.out.println("Enter elements:");
 for(int i=0;i<r;i++)for(int j=0;j<c;j++){a[i][j]=s.nextInt();if(a[i][j]!=0)count++;}
 int[][] t=new int[count+1][3];t[0]=new int[]{r,c,count};int k=1;
 for(int i=0;i<r;i++)for(int j=0;j<c;j++)if(a[i][j]!=0)t[k++]=new int[]{i,j,a[i][j]};
 System.out.println("Triplet form (row col value):");for(int[] row:t)System.out.println(Arrays.toString(row));
 System.out.printf("Dense cells=%d, stored triplets=%d (excluding header)%n",r*c,count);
 }
}
