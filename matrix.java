import java.util.*;
class matrix
 {
   public static void main(String args[])
   {
    int r,c,ch;
    Scanner sc=new Scanner(System.in);   	
	  System.out.println("enter number of rows and columns for 1st Matrix:");
	  r=sc.nextInt();
    c=sc.nextInt();
	  int[][] a=new int[r][c]; 
    System.out.println("enter number matrix elements:");
    for(int i=0; i<r; i++)
	  {
	  for(int j=0; j<c; j++)
		  a[i][j]=sc.nextInt();
	  }
	  
	  System.out.println("enter number of rows and columns for 2nd Matrix:");
    r=sc.nextInt();
    c=sc.nextInt();
	  int[][] b=new int[r][c];
    System.out.println("enter number matrix elements:");
    for(int i=0; i<r; i++)
	  {
	  for(int j=0; j<c; j++)
		  b[i][j]=sc.nextInt();
		}
		
    System.out.println("Matrix 1:");
    for(int i=0; i<r; i++)
	  {
	  for(int j=0; j<c; j++)	
		  System.out.print(a[i][j]+"\t");
	  System.out.println();
	  }
	  
    System.out.println("Matrix 2:");
    for(int i=0; i<r; i++)
	  {
	  for(int j=0; j<c; j++)	
		  System.out.print(b[i][j]+"\t");
	  System.out.println();
	  }
	
	do
	{
	System.out.println("\n\n 1.Matrix Addition\n 2.Matrix Multiplication\n 3.Transpose of Matrix\n 4.Exit");
	System.out.println("Enter your choice:");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:	
		System.out.println("Matrix Addition :");
		for(int i=0; i<r; i++)
		{
		for(int j=0; j<c; j++)	
		System.out.print((a[i][j]+b[i][j])+"\t");
		System.out.println();
		}		
		break;
	case 2: 
		int[][] mul=new int[r][c];
		for(int i=0; i<r; i++)
		{
		for(int j=0; j<c; j++)
		{
		mul[i][j]=0;
		for(int k=0;k<c; k++)
		{
		mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
		}
		}
		}

		System.out.println("Matrix Multiplication :");
		for(int i=0; i<r; i++)
		{
		for(int j=0; j<c; j++)	
		System.out.print((mul[i][j])+"\t");
		System.out.println();
		}		
		break;

	case 3:
		System.out.println("Transpose of Matrix 1:");
		for(int i=0; i<r; i++)
		{
		for(int j=0; j<c; j++)	
		System.out.print((a[j][i])+"\t");
		System.out.println();
		}		
		break;
	}
	}while(ch<4);
   }
}