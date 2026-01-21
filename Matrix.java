package classroom;

import java.util.Scanner;

public class Matrix {
    private int[][] m;
    Matrix(int row,int col){
        m = new int[row][col];
    }

    int det() throws Exception{
        if (m.length != m[1].length) {
            throw new Exception("this is not a square matrix that means it cannot be find determinant");
        }
        
        
        int d=0;
        
        return d;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[1].length; j++) {
                System.out.print("enter value of element [" + i+"]["+j+"]=");
                m[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    void print(){
        for(int[] row: m){
            for(int element :row){
                System.out.print(element +"\t");
            }
            System.out.println("\n");
        }
    }
}
