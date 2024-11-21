import java.sql.SQLOutput;
import java.util.Scanner;


public class Average {
    private int data[];
    private double mean;

    public Average() {
        data = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter your score " + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        int total = 0;
        for (int score : data) {
            total += score;
        }
        mean = (double) total / data.length;
    }

    public String toString() {
        String result = "Scores in descending order: ";
        for (int i = 0; i < data.length; i++) {
            result += data[i] + " ";
        }
        result += "\nMean: " + mean;
        return result;
    }

    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int MaxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[MaxIndex]) {
                    MaxIndex = j;
                }
            }
            int temp = data[MaxIndex];
            data[MaxIndex] = data[i];
            data[i] = temp;
        }
    }
}
