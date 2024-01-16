import java.util.*;

// public class ArraysLec1 {
//     public static void main(String args[]) {
//         int marks[] = new int[10];

// Length of array
// System.out.println("The length of array is " + marks.length);

// Scanner sc = new Scanner(System.in);

// int numbers[] = {1,2,4};

// marks[0] = sc.nextInt(); // Chem
// marks[1] = sc.nextInt(); // Phy
// marks[2] = sc.nextInt(); // Math

// System.out.println("Chem : " + marks[0]);
// System.out.println("Phy : " + marks[1]);
// System.out.println("Math : " + marks[2]);

// marks[2] = marks[2] + 4;

// System.out.print("Updated math marks : " + marks[2]);

//     }
// }

/**
 * Array pass by ref
 */

public class ArraysLec1 {

    public static void update_marks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 84, 78, 82 };

        update_marks(marks);

        // Print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

}