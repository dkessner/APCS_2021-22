//
// PiggyBankTest.java
//


public class PiggyBankTest
{
    public static void main(String[] args)
    {
        PiggyBank piggyBank = new PiggyBank();

        piggyBank.addNickel();
        piggyBank.addNickel();
        piggyBank.addNickel();
        piggyBank.addDime();
        piggyBank.addDime();
        piggyBank.addQuarter();
        piggyBank.addQuarter();

        System.out.println("total: " + piggyBank.total());

        System.out.println("value of dime: " + 
                PiggyBank.valueOfDime());

        System.out.println("pi: " + Math.PI);
        System.out.println("piggybank pi: " + PiggyBank.PI);
    }


}


