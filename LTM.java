package classroom;

import java.util.Scanner;

public class LTM {
    private int order = 0;
    private float[][] arr;

    LTM(int order) {
        this.order = order;
        arr = new float[order][order];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < order; row++) {
            for (int col = 0; col < order; col++) {
                if (row < col) {
                    this.arr[row][col] = 0;
                } else {

                    System.out.print("enter element [" + row + "][" + col + "]=");
                    arr[row][col] = sc.nextFloat();
                }
            }
        }
    }

    void add(LTM other) {
        for (int row = 0; row < other.arr.length; row++) {
            for (int col = 0; col < other.arr[0].length; col++) {
                if (row < col) {
                    arr[row][col] = 0;
                } else
                    arr[row][col] += other.arr[row][col];
            }
        }
    }

    void subs(LTM other) {
        for (int row = 0; row < other.arr.length; row++) {
            for (int col = 0; col < other.arr[0].length; col++) {
                if (row < col) {
                    arr[row][col] = 0;
                } else
                    arr[row][col] -= other.arr[row][col];
            }
        }
    }
    //error on it
    void mul(LTM other) {
        for (int row = 0; row < other.arr.length; row++) {
            for (int col = 0; col < other.arr[0].length; col++) {
                if (row < col) {
                    arr[row][col] = 0;
                } else {
                    float result=0;
                    for (int i = 0; i < other.arr[0].length; i++) {
                        result = arr[row][col] * other.arr[col][row];
                    }
                    arr[row][col] = result;
                }
            }
        }
    }

    void print() {
        for (float[] row : arr) {
            for (float element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
