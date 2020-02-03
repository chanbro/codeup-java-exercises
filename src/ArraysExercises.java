import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // Exercise 1
        int[] numbers = {1, 2, 3, 4, 5};
        // Arrays are an object that need to be converted into string to show on command line
        System.out.print(Arrays.toString(numbers));
        System.out.print("\n");


        String[] people = new String[]{"Max", "Sally", "Joe"};
        String[] colors = new String[]{"Blue", "red", "green", "purple", "pink"};
        for (String person : people) {
                    System.out.println(person);
        }
        addObject(colors, "yellow");
    }

    // Exercise 1
    public static void addObject(String[] array, String newObject){
        // newArray has a length of the passed array length plus 1
        String[] newArray = new String[array.length +1];
        // Object source (what to copy)= array; Source position (start position to be copied)= 0, Object destination (where to copy to) = newArray, Source destination position (end position to be copied) = (the original) array.length
        System.arraycopy(array, 0, newArray, 0, array.length);
        // Creating object in the array to be copied over into the last position of newArray
        newArray[newArray.length -1] = newObject;
        // Printing the array
        System.out.println(Arrays.toString(newArray));
        // Printing each object from newArray as a string
        for (String s : newArray) {
            System.out.println(s);
        }
    }




}
