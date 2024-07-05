import java.util.Scanner;

public class SortApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Prompt the user to choose the sorting algorithm
        System.out.println("Enter 1 for Bubble Sort or 2 for Selection Sort:");
        int choice = scanner.nextInt();

        // Sort the array based on user's choice
        if (choice == 1) {
            bubbleSort(numbers);
            System.out.println("Sorted array using Bubble Sort:");
        } else if (choice == 2) {
            selectionSort(numbers);
            System.out.println("Sorted array using Selection Sort:");
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Display the sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort method
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort method
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

//checkin
