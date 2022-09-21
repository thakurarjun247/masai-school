package ja111.web17.day6;

import java.util.Arrays;

public class _4Matrix {
    public static void main(String[] args) {
        //first way
        int[][] m=new int[3][4];
        m[1][1]=17;
        //second way:
        int[][] matrix={

                //columns =>
                //c0, c1, c2
                {1,2},              //row 0
                {3,4,5},            //row 1
                {0}                 //row 2
        };
        //System.out.println(matrix[0][2]); //IOB
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++ ){
                System.out.println(matrix[row][column]);
                //50 lines
                //51
            }
        }
        System.out.println(matrix[0][0]);
        for(int i=0;i<matrix.length;i++)
        System.out.println(Arrays.toString(matrix[i]));




    }
}
