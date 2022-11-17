public class FindMaximum {
    // UC2- finding maximum value of 3 Integers
    public static Integer maxInteger(Integer a, Integer b, Integer c) {

        if (a.compareTo(b) > 0) {
            return a;
        } else if (c.compareTo(b) > 0) {
            return c;
        } else {
            return b;
        }

    }

    // UC2- finding maximum value of 3 floats
    public static Float maxFloat(Float A, Float B, Float C) {

        if (A.compareTo(B) > 0) {
            return A;
        } else if (C.compareTo(B) > 0) {
            return C;
        } else {
            return B;
        }
    }


    public static void main(String[] args) {
        System.out.println("Maximum of 3 Integers is : " + maxInteger(20, 50, 80));
        System.out.println("Maximum of 3 Floats is : " + maxFloat(20.20f, 50.50f, 80.80f));
    }
}



