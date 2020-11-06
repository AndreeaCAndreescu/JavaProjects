public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value!");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");

        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = Math.round(kiloBytes / 1024);
            int newKiloBytes = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + newKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true) {
            if ((hourOfDay > 0) && ((hourOfDay < 8) || (hourOfDay > 22)) && (hourOfDay <= 23)) {
                return true;
            } else if ((hourOfDay < 0) || (hourOfDay > 23)) {
                return false;
            } else return false;
        } else return false;
    }

    public static boolean isLeapYear(int year) {
        if(year>= 1 && year<=9999){
            if(year%4==0){
                if(year%100==0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                else {return true;}
            }
            else {return false;}
        }
        else
        {return false;}
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        a=a*1000;
        b=b*1000;
        int a1=(int)a;
        int b1=(int)b;
        if(a1==b1){
            return true;
        }
        else
        {return false;}
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if((a+b)==c){
            return true;
        }
        else
        {return false;}
    }

    public static boolean hasTeen(int a, int b, int c){
        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19)){
            return true;
        }
        else
        {return false;}
    }

    public static boolean isTeen(int a){
        if(a>=13 && a<=19)
        {return true;}
        else
        {return false;}
    }
}