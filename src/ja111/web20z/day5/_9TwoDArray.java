package ja111.web20z.day5;

public class _9TwoDArray {
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];
        int[][] a = {
                {1, 2, 3}, //0
                {4, 5, 6, 9}, //1
                {7},
        };
        int R=a.length;
        for(int row=0;row<R;row++){
            int C=a[row].length;
            for (int column=0;column<C;column++){
                System.out.print(a[row][column]);
            }
        }
        System.out.println("");
        System.out.println(a[1][3]);
        //be careful:
       // System.out.println(a[2][3]);
    }
}
