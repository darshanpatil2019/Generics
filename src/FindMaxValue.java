public class FindMaxValue<T extends Comparable<T>> {

    T a, b, c;

    //Generic Constructor for Handling Different Type Object
    FindMaxValue(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //compareTo method for Checking Maximum from 3 Integer Object
    public T compareTo() {
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
        FindMaxValue<Integer> integerComparison = new FindMaxValue(20, 50, 80);
        System.out.println("Maximum from 3 Integer Object : " + integerComparison.compareTo());
        //Creating Generic Float Object for Float Comparison
        FindMaxValue<Float> floatComparison = new FindMaxValue<>(20.20F, 50.50F, 80.80F);
        System.out.println("Maximum from 3 Float Object : " + floatComparison.compareTo());
        //Creating Generic String Object for String Comparison
        FindMaxValue<String> stringComparison = new FindMaxValue<>("Apple", "Peach", "Banana");
        System.out.println("Maximum from 3 String Object : " + stringComparison.compareTo());
    }
}

