package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE="Invalid value"; //variabila constanta => nu isi poate schimba valoarea dupa declarare

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    private static String getDurationString(long minutes, long seconds){
        if((minutes<0)||(seconds<0)||(seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes/60;
        long remainingMinutes=minutes%60;

        String hoursString=hours+"h";
        if(hours<10){
            hoursString="0"+hoursString;
        }

        String minutesString=remainingMinutes+"m";
        if(remainingMinutes<10){
           minutesString="0"+minutesString;
        }

        String secondsString=seconds+"s";
        if(seconds<10){
            secondsString="0"+secondsString;
        }

        return hoursString+" "+minutesString+" "+secondsString+" ";
    }

    private static String getDurationString(long seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        long minuts=seconds/60;
        long remainingSeconds=seconds%60;
        return getDurationString(minuts,remainingSeconds);
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        else{
            return radius*radius*Math.PI;
        }
    }

    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1;
        }
        else{
            return x*y;
        }
    }

    public static void printYearsAndDays(long minutes){
        // 1 hour = 60 min 	1 day = 24 hours	    // 1 year = 365 days
        // convert years to minutes -> 1 day = 24 * 60 min . 1 year = 365 * 24 * 60 min -> 1 min = 1 year / 365 * 24 * 60
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes/525600; // NOTE DONT WRITE 1/525600 * minutes. ask someone.
            long days = minutes % 525600; // the remaining remainder needs to be divided by 24 * 60 = 1440.
            days = days / 1440;
            System.out.println (minutes + " min" + " = " + years + " y" + " and " + days + " d");
        }

    }

    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }
        else{
            if(a==b && b==c){
                System.out.println("All numbers are equal");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("All numbers are different");
            }
            else{
                System.out.println("Neither all are equal or different");
            }
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature>=25 && temperature<=35){
            return true;
        }
        else
            if(summer==true && temperature>=25 && temperature <=45){
                return true;
            }
            else return false;
    }
}
