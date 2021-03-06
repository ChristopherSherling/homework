/* The Robotic Overlords -- Lisa Shi, Christopher Sherling
   APCS1 pd5
   HW11 -- Hey... I Got Your Money
   2015-10-03 */

public class Teller {
    public static void main ( String [] args)
    {
        String newAccount;
	String s;
	int i;
	double d;
	boolean b;
        BankAccount emily = new BankAccount();
	emily.setFullName("Emily Li");
	emily.setPassword("password");
	emily.setPinNumber(1202);
	emily.setAccountNumber(123456789);
	emily.setBalance(10.00);
        System.out.println (emily);

	System.out.println("------TEST OF VERIFICATION------");
	b = emily.authenticate(111222333, "anincorrectpassword");
	System.out.println(b);
	b = emily.authenticate(111222333, "password");
	System.out.println(b);
	b = emily.authenticate(123456789, "password");
	System.out.println(b);

	System.out.println("------TEST OF INVALID PIN AND ACCOUNT------");
	emily.setPinNumber(6);
	emily.setAccountNumber(6);

	System.out.println("------TEST OF VALID DEPOSIT/WIDTHDRAWL------");
	b = emily.deposit(10.00);
	System.out.println(b);
	b = emily.withdraw(10.00);
	System.out.println(b);

	System.out.println("------TEST OF INVALID DEPOSIT/WIDTHDRAWL------");
	b = emily.deposit(-10.00);
	System.out.println(b);
	b = emily.withdraw(1000.00);
	System.out.println(b);
	b = emily.withdraw(-10.00);
	System.out.println(b);

	System.out.println("------TEST OF ACCESSORS------");
	s = emily.getFullName();
	System.out.println(s);
	s = emily.getPassword();
	System.out.println(s);
	i = emily.getPinNumber();
	System.out.println(i);
	i = emily.getAccountNumber();
	System.out.println(i);
	d = emily.getBalance();
	System.out.println(d);

    }
}
