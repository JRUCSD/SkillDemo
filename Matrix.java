/**
 * Creates a Matrix object, able to return a single row or column as a String 
 */
public class Matrix {

    int[][] matrix;

    //Create a matrix from a 2-D array
    public Matrix(int[][] arr)
    {
        matrix = arr;
    }
  
    //Returns a row or column of the matix as a String

    public String getRow(int row)
    {
        String matrixStr = "";
        matrixStr = "[";
        for(int i=0; i<matrix.length; i++)
        {
            if(i==matrix.length-1)
                matrixStr += matrix[row][i] + "]";
            else
                matrixStr += matrix[row][i] + ", ";
        }
        
        return matrixStr;
    }

    //Returns a column of the matrix in the form of a vector (nx1 matrix)
    public String getCol(int col)
    {
        String matrixStr = "";
        for(int i=0; i<matrix.length; i++)
            matrixStr += "[" + matrix[i][col] + "]\n";
        
        return matrixStr;
    }
}