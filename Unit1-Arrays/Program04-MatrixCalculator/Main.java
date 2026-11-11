import java.util.*;
public class Main {
 static int[][] read(Scanner s){int r=s.nextInt(),c=s.nextInt();if(r<1||c<1||r>20||c>20)throw new IllegalArgumentException("Dimensions 1..20");int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();return a;}
 static void show(int[][] a){for(int[] row:a)System.out.println(Arrays.toString(row));}
 public static void main(String[] q){Scanner s=new Scanner(System.in);try{System.out.println("Enter rows cols then values for A:");int[][] a=read(s);System.out.println("Enter rows cols then values for B:");int[][] b=read(s);
 while(true){System.out.println("1.Add 2.Multiply 3.Transpose A 4.Determinant A (square <=10) 0.Exit");int op=s.nextInt();if(op==0)break;
 if(op==1){if(a.length!=b.length||a[0].length!=b[0].length)System.out.println("Order mismatch");else{int[][] z=new int[a.length][a[0].length];for(int i=0;i<z.length;i++)for(int j=0;j<z[0].length;j++)z[i][j]=a[i][j]+b[i][j];show(z);}}
 if(op==2){if(a[0].length!=b.length)System.out.println("A columns must equal B rows");else{int[][] z=new int[a.length][b[0].length];for(int i=0;i<a.length;i++)for(int j=0;j<b[0].length;j++)for(int k=0;k<b.length;k++)z[i][j]+=a[i][k]*b[k][j];show(z);}}
 if(op==3){int[][] z=new int[a[0].length][a.length];for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)z[j][i]=a[i][j];show(z);}
 if(op==4){if(a.length!=a[0].length||a.length>10)System.out.println("Requires square matrix of order <=10");else System.out.println("Determinant = "+det(a));}
 }}catch(Exception e){System.out.println("Input/calculation error: "+e.getMessage());}}
 static long det(int[][] a){int n=a.length;if(n==1)return a[0][0];long d=0;for(int col=0;col<n;col++){int[][] m=new int[n-1][n-1];for(int i=1;i<n;i++){int jj=0;for(int j=0;j<n;j++)if(j!=col)m[i-1][jj++]=a[i][j];}d+=(col%2==0?1:-1)*(long)a[0][col]*det(m);}return d;}
}
