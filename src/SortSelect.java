import java.util.Date;
import java.util.Random;

public class SortSelect {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = n ew Random();
        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(1000);
        }
        StopWatch stopWatch = new StopWatch();
        for (int i = 0; i < 99999; i++) {
            for (int j = i + 1; j < 100000; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 100000; i++) {
            System.out.print(arr[i] + " ");
        }
        stopWatch.stop();
        long result = stopWatch.getElapsedTime();
        System.out.println();
        System.out.println("Thoi gian thuc hien la:" + result);
    }
}
