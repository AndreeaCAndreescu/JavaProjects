package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Account bobsAccount=new Account();
        Account bobsAccount=new Account("12345",0.00,"Bob Brown","myemail@bob.com","(087)123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(087)123-4567");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount=new Account("Tim","tm@email.com","12345");
        System.out.println(timsAccount.getNumber()+" name: "+timsAccount.getCustomerName());
        System.out.println("Current balance is "+timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

        VipPerson person1=new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2=new VipPerson("Bob",25000.00);
        System.out.println(person2.getName());

        VipPerson person3=new VipPerson("Tim",100.00,"tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

        Wall wall =new Wall(10.00,20.00);
        wall.getArea();

        System.out.println("******************************************************************");

        Carpet carpet=new Carpet(3.5);
        Floor floor=new Floor(2.75,4.0);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println("total= "+calculator.getTotalCost());
        carpet=new Carpet(1.5);
        floor=new Floor(5.4,4.5);
        calculator=new Calculator(floor,carpet);
        System.out.println("total= "+calculator.getTotalCost());
    }
}
