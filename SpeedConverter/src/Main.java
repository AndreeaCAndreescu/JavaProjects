public class Main {

    public static void main(String[] args) {

       long miles = SpeedConverter.toMilesPerHour(10.5);
       System.out.println("Miles = " + miles);

       SpeedConverter.printConversion(10.5);

       SpeedConverter.printMegaBytesAndKiloBytes(2500);

       SpeedConverter.shouldWakeUp(true,1);
       SpeedConverter.shouldWakeUp(false,2);
       SpeedConverter.shouldWakeUp(true, 8);
       SpeedConverter.shouldWakeUp(true,-1);

       SpeedConverter.isLeapYear(1700);
       SpeedConverter.isLeapYear(1600);
    }
}
