package study;

public class ArrayExam2 {

    public static void main(String[] args) {

        int[] [] arr = new int[5][5];
        int data = 1;

        for(int i =0; i<=4; i++) {
            for(int j = 0; j<=4; j++) {
                arr[i][j] = data;
                data++;
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
