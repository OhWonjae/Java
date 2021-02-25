package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		try {
			String ano = null; 
			account.deposit(ano, 1000);
	
		}catch(NoAccountException e)
		{
			System.out.println(e.getMessage());
		}
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			System.out.println("출금 성공");
			account.withdraw(ano, 100000);
			System.out.println("출금 성공2");
		}catch (NoAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BalanceLackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
