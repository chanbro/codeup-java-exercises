public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        System.out.print("Hello,");
//        System.out.print(" World!");
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);
        String myString = "Nice.";
//        String myString = 'n'; //does not work, character != string
//        String myString = 3.14159; //does not work, int != string
        System.out.println(myString);
//        long myNumber = 3.14; // double is for decimals, long is for integers
//        long myNumber = 123L; // prints as 123
        long myNumber = 123; // prints as 123; int < long, can take on more precise type
//        float myNumber = 3.14; // does not print because 3.14 is a double, and float is less precise; pretty much should always opt for double for best practice
        System.out.println(myNumber);
    }
}

/* Syntax Notes

*** FORMAT ***

{
    System.out.println("Code inside of curly braces should be indented");
    System.out.println("with four spaces");
}

*** DATA TYPES ***

TYPE	    BYTES	    DESCRIPTION
byte	    1	        Very short integers from -128 to 127
short	    2	        Short integers from -32,768 to 32,767
int	        4	        Integers from -2,147,483,648 to 2,147,483,647
long	    8	        Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4	        Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
double	    8	        Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
char	    2	        A single Unicode character that’s stored in two bytes
boolean	    1	        A true or false value

* Decimal and integer numbers are different types
* Can assign greater types but not lesser than the value's base units

*** STRINGS ***

* String- "double quotes"
* Character- 's' single quotes
* Escaping characters in strings

    "\"" // => "
    "\\" // => \
    "\n" // => the newline character
    "\t" // => the tab character

*** VARIABLES ***

* Assign type and assignName

int theAnswer = 42;
String question = "What is your favorite color?";

** IDENTIFIERS AND KEYWORDS ***

* Identifier- valid name for a class, method, or variable
    - start with a letter, underscore, or dollar sign. (SHOULD ONLY USE LETTERS)
    - consist of letters, dollar signs, underscores, and digits.
    - be no more than 255 characters.
    - cannot be a reserved word

    *** CONSTANTS ***

* Denoted by final
* CAPS_AND_UNDERSCORES

final int SIDES_OF_A_DICE = 6;
final String API_KEY = "b75b703d8195f6f433ca";
final String GITHUB_API_BASE_URL = "https://api.github.com";

*** OPERATORS ***

Binary Operator	    Meaning
+	                Addition
-	                Subtraction
*	                Multiplication
/	                Division
%	                Modulus

Examples- discount * price; sum / total

Unary Operator	    Meaning
++	                increment (pre and post)
--	                decrement (pre and post)
+	                Positive sign
-	                Negative sign

Examples-
++numberOfLessonsCompleted
numberOfDaysUntilDemoDay--

Assignment Operator     Meaning
=                       Assigns value to variable
+=                      someVariable = someVariable + number
-=                      someVariable = someVariable - number

*** CASTING ***

* Implicit- less precise to more precise (more specific to less specific)
    Example- widening conversion, int to long
    int myInteger = 900; ( 4 bytes)
    long morePrecise = myInteger; (8 bytes)

* Explicit- more precise to less precise (less specific to a more specific)
** Name of type we are casting to inside of parenthesis before the value to be cast

    Example- narrowing conversion, double (decimal) to int (integer)
    double pi = 3.14159;
    int almostPi = (int) pi;
 */
