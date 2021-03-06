package ch10.exam06;

public class Account {
	public void deposit(String account, int money) {
		if(account==null)
		{
			//예외 발생 코드
			throw new NoAccountException("입금계좌가 없습니다.");
		}
		System.out.println("입금 성공");
	}
	public void withdraw(String account, int money)throws NoAccountException
	,BalanceLackException{
		int balance = 10000;
		if(account==null)
		{
			//예외 발생 코드
			throw new NoAccountException("출금계좌가 없습니다.");
		}else if(money>balance)
		{
			throw new BalanceLackException("잔고 부족");
		}
		else {
			System.out.println("출금 성공");
		}
	}

}
