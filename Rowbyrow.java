public class Rowbyrow {
    public static void main(String[] args) {
        int[][] twoD = {{5, 6, 7}, {8, 9, 10}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(twoD[j][i] + " ");
            }
            System.out.println();
        }
    }
}
//    int[row][col] twoD = {{5, 6, 7}, {8, 9, 10}};


    /* i  j
     * [0}[0] 5
     * [0}[1] 6
     * [0}[2] 7
     * [1}[0] 8
     * [1}[1] 9
     * [1}[2] 10
           col 0:    5     8
       	   col 1:    6     9
           col 2:    7    10

     *
    *
    *
    * */