package ja111.web20.day8.TwoDArrays;

public class _3NumberOfRowsAndColums {
    public static void main(String[] args) {
        //int[] a=new int[5];
        int row=20;
        int column=30;
        int[][] matrix=new int[row][column];

        numOfRandC(matrix);

    }

    static void numOfRandC(int[][] matrix){
        System.out.println("number of rows?");
        System.out.println(matrix.length);
        System.out.println("columns?");
        System.out.println(matrix[0].length);
    }


}
