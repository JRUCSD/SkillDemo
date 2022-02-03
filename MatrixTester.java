import static org.junit.Assert.*;
import org.junit.*;

public class MatrixTester {
    
    int[][] squareArray;
    int[][] myArray;
    Matrix squareMatrix;
    Matrix myMatrix;

    @Before
    public void setUp()
    {
        squareArray = new int[3][3];
        myArray = new int[2][4];
        int count = 0;
        //squareArray = [[1, 2, 3], [2, 4, 6], [3, 6, 9]] 
        for(int i=1; i<4; i++)
        {
            for(int j=1; j<4; j++)
                squareArray[i-1][j-1] = i*j;
        }
        //myArray = [[0, 1, 2, 3], [4, 5, 6, 7]] 
        for(int i=0; i<myArray.length; i++)
        {
            for(int j=0; j<myArray[0].length; j++)
            {
                myArray[i][j] = count;
                count++;
            }
        }
        squareMatrix = new Matrix(squareArray);
        myMatrix = new Matrix(myArray);
    }

    @Test
    public void testgetRow()
    {
        assertEquals("[2, 4, 6]", squareMatrix.getRow(1));
        assertEquals("[0, 1, 2, 3]", myMatrix.getRow(0)); 
    }
    @Test
    public void testgetCol()
    {
        assertEquals("[3]\n[6]\n[9]\n", squareMatrix.getCol(2));
        assertEquals("[1]\n[5]\n", myMatrix.getCol(1));
    }
}
