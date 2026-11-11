import java.util.*;
public class Main {
 static void bubble(int[] a){for(int i=0;i<a.length-1;i++)for(int j=0;j<a.length-i-1;j++)if(a[j]>a[j+1])swap(a,j,j+1);}
 static void selection(int[] a){for(int i=0;i<a.length;i++){int m=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[m])m=j;swap(a,i,m);}}
 static void insertion(int[] a){for(int i=1;i<a.length;i++){int v=a[i],j=i-1;while(j>=0&&a[j]>v)a[j+1]=a[j--];a[j+1]=v;}}
 static void mergeSort(int[] a,int l,int r){if(l>=r)return;int m=(l+r)/2;mergeSort(a,l,m);mergeSort(a,m+1,r);int[] t=new int[r-l+1];int i=l,j=m+1,k=0;while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];while(i<=m)t[k++]=a[i++];while(j<=r)t[k++]=a[j++];System.arraycopy(t,0,a,l,t.length);}
 static void quick(int[] a,int l,int r){if(l>=r)return;int p=a[(l+r)/2],i=l,j=r;while(i<=j){while(a[i]<p)i++;while(a[j]>p)j--;if(i<=j)swap(a,i++,j--);}if(l<j)quick(a,l,j);if(i<r)quick(a,i,r);}
 static void heap(int[] a){for(int i=a.length/2-1;i>=0;i--)down(a,a.length,i);for(int i=a.length-1;i>0;i--){swap(a,0,i);down(a,i,0);}}
 static void down(int[]a,int n,int i){int largest=i,l=2*i+1,r=l+1;if(l<n&&a[l]>a[largest])largest=l;if(r<n&&a[r]>a[largest])largest=r;if(largest!=i){swap(a,i,largest);down(a,n,largest);}}
 static void radix(int[] a){if(a.length==0)return;int max=Arrays.stream(a).max().getAsInt(),min=Arrays.stream(a).min().getAsInt();long shift=-(long)min;long[] v=new long[a.length];for(int i=0;i<a.length;i++)v[i]=a[i]+shift;long mx=max+shift;for(long exp=1;mx/exp>0;exp*=10){int[] c=new int[10];long[] out=new long[v.length];for(long x:v)c[(int)(x/exp%10)]++;for(int i=1;i<10;i++)c[i]+=c[i-1];for(int i=v.length-1;i>=0;i--){int d=(int)(v[i]/exp%10);out[--c[d]]=v[i];}v=out;if(exp>Long.MAX_VALUE/10)break;}for(int i=0;i<a.length;i++)a[i]=(int)(v[i]-shift);}
 static void swap(int[]a,int i,int j){int t=a[i];a[i]=a[j];a[j]=t;}
 static int binary(int[]a,int x){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==x)return m;if(a[m]<x)l=m+1;else r=m-1;}return -1;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);System.out.print("Count and values: ");int n=s.nextInt();if(n<0||n>100000){System.out.println("Invalid size");return;}int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println("1 Bubble 2 Selection 3 Insertion 4 Merge 5 Quick 6 Heap 7 Radix 8 Binary search");int op=s.nextInt();long start=System.nanoTime();switch(op){case 1->bubble(a);case 2->selection(a);case 3->insertion(a);case 4->mergeSort(a,0,n-1);case 5->quick(a,0,n-1);case 6->heap(a);case 7->radix(a);case 8->{Arrays.sort(a);System.out.print("Search key: ");System.out.println("Index: "+binary(a,s.nextInt()));}default->{System.out.println("Invalid option");return;}}System.out.println(Arrays.toString(a));System.out.println("Elapsed ns: "+(System.nanoTime()-start));}
}
