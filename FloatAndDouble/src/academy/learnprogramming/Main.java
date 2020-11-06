package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double maximum value = "+myMaxDoubleValue);

//        int myIntValue = 5;
//        float myFloatValue = (float)5.25; // echivalent cu float myFloatValue = 5.25f;
//        double myDoubleValue = 5.25d;

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue = " + myIntValue); //af fara zecimala
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
