


import java.util.*;
 class Transpose
{
    public static void main(String[] args) 
    {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of array:");
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter all the elements:");
          for(int i = 0; i < n; i++) 
                 for(int j = 0; j < m; j++)
                   a[i][j]=sc.nextInt();

           System.out.println("transposed matrix is:");
          for(int i = 0; i < m; i++)
          { 
                 for(int j = 0; j < n; j++)
                   System.out.print(a[j][i] + " ");
            System.out.print("\n");
               
           }    
    }
}    