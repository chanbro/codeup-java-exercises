import java.util.*;

public class ProgrammingPushups {
    public static void main(String[] args) {
        System.out.println(factor(200));
//        System.out.println(multiply(3, 4));
//        System.out.println(exponent(2, 4));
//        String a = "1101", b="100";
//        System.out.print(addBinary(a, b));

        //Create a String[] with at least 6 String objects. Also create an empty ArrayList<String>. Then loop over the array and put the items into the ArrayList so that we have the same contents

//        String[] fruits = new String[]{"banana", "apple", "orange", "grapefruit", "pear", "kiwi"};
//
//        ArrayList<String> fruitArray = new ArrayList<>(Arrays.asList(fruits));
//        System.out.println(fruitArray);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//
//        String listString = "";
//
//        for (String s : list){
//            listString += s + "\n";
//        }
//
//        System.out.println(listString);

//        // Better solution from stackoverflow
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//
//        StringBuilder sb = new StringBuilder();
//        for (String s : list)
//        {
//            sb.append(s);
//            sb.append("\n");
//        }
//
//        System.out.println(sb.toString());

    }

    // Factors of a number

//    public static ArrayList<Integer> factor(int num){
//        ArrayList<Integer> factors = new ArrayList<>();
//        for (int i = 1; i <= num; i++){
//            if (num % i == 0) {
//                factors.add(i);
//            }
//    }
//        return factors;
//    }

//Method that takes in a list of integers and an int, parses to find pairs of integers in the list that sum to int parameter. Return result as a list of lists of integers

//    public static ArrayList<ArrayList<Integer>> listPairSum(int x){
//        ArrayList<ArrayList<Integer>> sums = new ArrayList<>();
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(1);
//        a1.add(2);
//        a1.add(3);
//        a1.add(3);
//        a1.add(4);
//        a1.add(8);
//        sums.add(a1);
//
//        ArrayList<Integer> a2 = new ArrayList<>();
//        a2.add(5);
//        a2.add(6);
//        a2.add(2);
//        a2.add(5);
//        sums.add(a2);
//
//        ArrayList<Integer> a3 = new ArrayList<>();
//        a3.add(1);
//        a3.add(1);
//        a3.add(7);
//        a3.add(9);
//        sums.add(a3);
//
//        for (ArrayList<Integer> sum : sums) {
//            for (Integer integer : sum) {
//                System.out.print(integer + " ");
//                if (integer)
//            }
//            System.out.println();
//        }
//        return sums;
//    }

    //  Write a Java program to add two binary numbers. Go to the editor
    //Input Data:
    //Input first binary number: 10
    //Input second binary number: 11
    //Expected Output

    // Sum of two binary numbers: 101

    // java program to add
// two binary strings

    // This function adds two
    // binary strings and return
    // result as a third string
//        static String addBinary(String a, String b)
//        {
//
//            // Initialize result
//            String result = "";
//
//            // Initialize digit sum
//            int sum = 0;
//
//            // Traverse both strings starting
//            // from last characters
//            int i = a.length() - 1, j = b.length() - 1;
//            while (i >= 0 || j >= 0 || sum == 1)
//            {
//
//                // Compute sum of last digits and carry
//                sum += ((i >= 0)? a.charAt(i) - '0': 0);
//                sum += ((j >= 0)? b.charAt(j) - '0': 0);
//
//                // If current digit sum is 1 or 3, add 1 to result
//                result = (char)(sum % 2 + '0') + result;
//
//                // Compute carry
//                sum /= 2;
//
//                // Move to next digits
//                i--; j--;
//            }
//
//            return result;
//        }


//    public static int multiply(int x, int y){
//        int sum = 0;
//        for (int i=1;i<=y;++i){
//            sum += x;
//        }
//        return sum;
//    }
//
//    public static int exponent(int x, int y){
//        int product = 1;
//        for (int i=1;i<=y;++i){
//            product *= x;
//            //recursion
//            // product = multiply(product, a);
//        }
//        return product;
//    }


}
