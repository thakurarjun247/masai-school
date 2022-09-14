package ja111.web20.day8.TwoDArrays;

public class _1TwoDArrays {
    public static void main(String[] args) {
        //int[] a=new int[5];
        int row=3;
        int column=4;
        int[][] matrix=new int[row][column];
        for (int r = 0; r <row ; r++) {
            for(int c=0;c<column;c++){
                //set
                  matrix[r][c]=10;
            }
        }

        for (int r = 0; r <row ; r++) {
            for(int c=0;c<column;c++){
                System.out.println(matrix[r][c]);
            }
        }

    }
}
