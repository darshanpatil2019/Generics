public class FindMaxValue {

    //compareTo method for Checking Maximum from 3 Integer Object
    public <T extends Comparable<T>> T compareTo(T a, T b, T c) {
        if (a.compareTo(b) > 0) {
            if (a.compareTo(c) > 0) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b.compareTo(c) > 0) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        //Creating Generic Integer Object for Integer Comparison
        FindMaxValue integerComparison = new FindMaxValue();
        System.out.println("Maximum from 3 Integer Object : " + integerComparison.compareTo(20, 50, 80));
        //Creating Generic Float Object for Float Comparison
        FindMaxValue floatComparison = new FindMaxValue();
        System.out.println("Maximum from 3 Float Object : " + floatComparison.compareTo(20.20F, 50.50F, 80.80F));
        //Creating Generic String Object for String Comparison
        FindMaxValue stringComparison = new FindMaxValue();
        System.out.println("Maximum from 3 String Object : " + stringComparison.compareTo("Apple", "Peach", "Banana"));
    }
}
