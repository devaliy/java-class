public class SortingInJava {

    // Sorting can be defined as the process of arranging data in a specific
    // order(usually ascending or in descending).
    // int[] mixedVariables = { 8, 9, 4, 6, 21, 43 };
    // int[] orderAscending = { 4, 6, 8, 9, 21, 43 };
    // int[] orderDescending = { 43, 21, 9, 8, 6, 43 };

    // Importance of Sorting
    // 1. it Improves search speed
    // 2. it makes data easy to understand
    // 3. Many algorithm work faster on sorted data(e.g, binary search)

    // Types of Sorting
    // 1. Bubble Sort
    // 2. Selection Sort etc.

    // Bubble Sort Sort
    // * Compares two adjacent items.
    // * Swaps if they are in wrong order.
    // * Repeats this until the list/data is sorted.

    // Selection Sort
    // Find the Smallest element, places it in the correct position.
    // Repeats for the rest of the array/list

    // Time Complexity: this tells us how the performance of an algorithm grows as
    // in input increases.

    // Big O Notation: is used to describe the time and space complexity of an
    // algorithm, how it scales when the input grows larger.

    // Why is Big O Important
    // * It helps to compare the effieciency of algorithms.
    // * It predicts performance before running code
    // * it helps make better decisions in coding in an interview or in real
    // application.

    // Big O Notations in Java

    // O(1) => Constant Time => Accessing array element
    // O(n) => Linear Time => Single loop
    // O(n^2) => Quadratic Time => Nested loops
    // O(log n) => Logarithmic Time => binary Search
    // O(nlogn) => Linearithmin => Merge Sort, Quick Sort

    public static void main(String[] args) {
        // 1. O(1) Constant Time
        // No matter the input size, it takes always the same amount of time
        int[] arr = { 10, 20, 30, 40 };
        System.out.println("Cosntant Time Example:");
        System.out.println(arr[3]);

        // 2. O(n) Linear Time
        // Time grows directly with input size
        System.out.println("Linear Time Example:");
        System.out.println("The Length of our Array:" + arr.length);
        int lendthy = arr.length;
        for (int i = 0; i <= lendthy - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        // 3. O(n^2) Quadratic Time
        // Common in nested loops
        System.out.println("Quadratic Time Annotation:");
        int n = 10;
        for (int i = 1; i < n; i++) {
            System.out.println(" ");
            for (int j = 1; j < n; j++) {
                System.out.print(i * j + " ");
            }

        }
    }

    // write a java program to printout the timetable between 1 and 20 in this
    // format
    // 1*1 =1 1*2 = 2.....
    // 2*1 =2 2*2 = 4 .....
    // ..
}
