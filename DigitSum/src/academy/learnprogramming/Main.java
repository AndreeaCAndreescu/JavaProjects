package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println("The sum of the digits in number 125 is "+sumDigits(125));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(hasSameLastDigit(11,25,30));
        numberToWords(10);
        System.out.println("**********************");
//        reverse(125);
        System.out.println("The reverse number is: "+ reverse(-125));
        System.out.println("The number of digits is: "+getDigitCount(0));
    }

    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>0){
            //extract the last-significant digit
            int digit=number%10;
            sum+=digit;
            //drop the last-significant digit
            number/=10; // same as number=number/10
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;
        while(palindrome!=0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome/=10;
        }
        if(number==reverse){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int lastDigit=number%10;
        int firstDigit=number;
        while(firstDigit>=10){
            firstDigit/=10;
        }
        return firstDigit+lastDigit;
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                sum+=digit;
            }
            number/=10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int a, int b){
        if(a<10 || a>99 || b<10 || b>99){
            return false;
        } else {
            int lefta=a/10;
            int righta=a%10;
            int leftb=b/10;
            int rightb=b%10;
            if(lefta==leftb||lefta==rightb||righta==leftb||righta==rightb){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a)&& isValid(b)&& isValid(c)){
            int lastDigita=a%10;
            int lastDigitb=b%10;
            int lastDigitc=c%10;
            if((lastDigita==lastDigitb)||(lastDigita==lastDigitc)||(lastDigitb==lastDigitc)){
                return true;
            }
            else{return false;}
        }
        else{
           return false;
        }
    }

    public static boolean isValid(int number){
        if(number>=10 && number<=1000){
            return true;
        }
        else{
            return false;
        }
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1 ;
        }
        while (first!=second){
            if(first>second)
                first=first-second;
            else
                second=second-first;
        }
        return second;
    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0)
                sum+=i;
    }
        if(sum==number){
            return true;
        }
        else
            return false;
    }

    public static void numberToWords(int number){
        int num=  reverse(number);;
        if(num<0){
            System.out.println("Invalid Value");
        }
        else if(num==0){
            System.out.println("Zero");
        }
        while(num!=0) {
            int digit = num% 10;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                    default:
                    System.out.println("Invalid Value");
                    break;
            }
            num /= 10;

        }
    }

    public static int reverse(int number){
        int num=number;
        int reverseNum=0;
        while(num!=0){
            int digit=num%10;
            reverseNum=reverseNum*10+digit;
            num/=10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number){
        int count=0;
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 1;
        }
        while(number!=0)
        {
            number/=10;
            ++count;
        }
        return count;
    }
}
