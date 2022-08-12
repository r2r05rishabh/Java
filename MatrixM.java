import java.util.Scanner;
 
class MatrixM
{
  public static void main(String args[])
  {
    int m, n, p, q, sum = 0, c, d, k;
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of first matrix");
    m = in.nextInt();
    n = in.nextInt();
 
    int m1[][] = new int[m][n];
 
    System.out.println("Enter elements of first matrix");
 
    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        m1[c][d] = in.nextInt();
 
    System.out.println("Enter the number of rows and columns of second matrix");
    p = in.nextInt();
    q = in.nextInt();
 
    if (n != p)
      System.out.println("The matrices can't be multiplied with each other.");
    else
    {
      int m2[][] = new int[p][q];
      int m3[][] = new int[m][q];
 
      System.out.println("Enter elements of second matrix");
 
      for (c = 0; c < p; c++)
        for (d = 0; d < q; d++)
          m2[c][d] = in.nextInt();
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++) {
          for (k = 0; k < p; k++)
            sum = sum + m1[c][k]*m2[k][d];
 
          m3[c][d] = sum;
          sum = 0;
        }
      }
 
      System.out.println("Product of the matrices:");
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++)
          System.out.print(m3[c][d]+"\t");
 
        System.out.print("\n");
      }
    }
  }
}
