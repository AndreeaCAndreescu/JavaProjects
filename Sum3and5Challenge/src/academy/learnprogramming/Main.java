package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count=0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            if((i%3==0) && (i%5==0)){
                count++;
                sum+=i;
                System.out.println("Found number = "+i);
            }
            if(count==5){
                break;
            }
        }
        System.out.println("Sum = "+sum);
        sumOdd(1,7);
    }

    public static boolean isOdd(int number){
        if(number>0){
            if(number%2==1){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if(start<=end && start>0 && end>0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)==true) {
                    sum += i;
                }
            }

            System.out.println("Sum = "+sum);
        }
        else {
            return -1;
        }
        return sum;
    }
}
