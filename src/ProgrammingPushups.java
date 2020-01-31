public class ProgrammingPushups {
    public static void main(String[] args){
        System.out.println(multiply(3, 4));
        System.out.println(exponent(2, 4));
    }

    public static int multiply(int x, int y){
        int sum = 0;
        for (int i=1;i<=y;++i){
            sum += x;
        }
        return sum;
    }

    public static int exponent(int x, int y){
        int product = 1;
        for (int i=1;i<=y;++i){
            product *= x;
            //recursion
            // product = multiply(product, a);
        }
        return product;
    }



}
