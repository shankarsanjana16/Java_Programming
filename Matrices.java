import java.util.Scanner;
class Matrices
{
	int matrix[][], row, column;
	Matrices(int row, int column)
	{
		this.row = row;
		this.column = column;
		matrix = new int[row][column];
	}
	void getElements()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Elements: ");
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	void add(Matrices mat1, Matrices mat2)
	{
		if((mat1.row!=mat2.row)||(mat1.column!=mat2.column))
		{
			System.out.println("Matrix Addition is not possible as the Dimensions of both the Matrices do not Match.");
			return;
		}
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				matrix[i][j] = mat1.matrix[i][j]+mat2.matrix[i][j];
			}
		}
	}
	void multiply(Matrices mat1, Matrices mat2)
	{
		if(mat1.column!=mat2.row)
		{
			System.out.println("Matrix Multiplication is not Possible.");
			return;
		}
		for(int i = 0;i<mat1.row;i++)
		{
			for(int j = 0;j<mat2.column;j++)
			{
				for(int k = 0;k<mat2.row;k++)
				{
					matrix[i][j]+=(mat1.matrix[i][k]*mat2.matrix[k][j]);
				}
			}
		}
	}
	void displayMatrix()
	{
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Matrices mat1, mat2, sum_mat, product_mat;
		System.out.print("Enter no. of Rows and Columns for Matrix A = ");
		mat1 = new Matrices(sc.nextInt(),sc.nextInt());
		System.out.print("Enter no. of Rows and Columns for Matrix B = ");
		mat2 = new Matrices(sc.nextInt(),sc.nextInt());
		System.out.println("Matrix A: ");
		mat1.getElements();
		System.out.println("Matrix B: ");
		mat2.getElements();
		sum_mat = new Matrices(mat1.row,mat1.column);
		product_mat = new Matrices(mat1.row,mat2.column);
		sum_mat.add(mat1,mat2);
		product_mat.multiply(mat1,mat2);
		System.out.println("Matrix A: ");
		mat1.displayMatrix();
		System.out.println("Matrix B: ");
		mat2.displayMatrix();
		System.out.println("Sum: ");
		sum_mat.displayMatrix();
		System.out.println("Product: ");
		product_mat.displayMatrix();
	}
}