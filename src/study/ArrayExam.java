package study;

public class ArrayExam {

    public int[] fill100() {
        int[] array = new int[100];
        // array가 1부터 100까지 순서대로 값을 가지도록 만들어 보세요.

        return array;
    }

    public static void main(String[] args) {
        ArrayExam exam = new ArrayExam();
        int[] arr2 = exam.fill100();
        int errCount = 0;
        for (int i = 0; i < 100; i++) {
            if (arr2[i] != i + 1) {
                System.out.println("array[" + i + "]의 값이 틀립니다.");
                errCount++;
            }
        }
        if (errCount == 0) System.out.println("정답입니다.");
    }
}

