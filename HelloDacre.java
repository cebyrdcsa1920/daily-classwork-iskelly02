public class HelloDacre
{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.out.println("Please enter your first and lastname");
        }
        else
        {
            String first = args[0];
            String lastname = args[1];
            System.out.println("Hellos, " + first + " " + lastname);
        }
        double money = 5.5;
        System.out.println("How much money do you have in the bank?" + money + "dollars");


    }