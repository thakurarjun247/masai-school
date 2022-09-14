package ja111.web20.day8.TwoDArrays;

public class _2TwoDArraysYouProblem {
    public static void main(String[] args) {
        //int[] a=new int[5];
        int row=2;
        int column=3;
        int[][] matrix=new int[row][column];
        int variable=0;
        for (int r = 0; r <row ; r++) {
            for(int c=0;c<column;c++){
                //set
                  matrix[r][c]=variable;
                  variable++;
            }
        }

        for (int r = 0; r <row ; r++) {
            for(int c=0;c<column;c++){
                System.out.println(matrix[r][c]);
            }
        }

        System.out.println("number of rows?");


    }
}
