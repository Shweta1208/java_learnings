package arrayDsa;

public class setZeros {

    public static void setZer0(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        // print the matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroBetter(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == 0){
                    for(int k=0;k<matrix.length;k++){
                        matrix[i][k] = 2;
                        matrix[k][j] = 2;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == 2){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroOptimal(int[][] matrix){
        // row - matrix [0][j] , col - matrix[i][0]
        boolean row0 = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] =0;
                    else row0 = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] !=0){
                    if(matrix[i][0] == 0 || (matrix[0][j]==0 && ((j!=0) || row0) ))  {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] ==0){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(row0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] matrix2 = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] matrix3 = {
            {1,1,1,1},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,1}
        };

        setZer0(matrix);
        System.out.println("_________________________");
        setZeroBetter(matrix2);
        System.out.println("_________________________");
        setZeroOptimal(matrix3);

    }
}
