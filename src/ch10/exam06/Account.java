package ch10.exam06;

public class Account {
	public void deposit(String account, int money) {
		if(account==null)
		{
			//���� �߻� �ڵ�
			throw new NoAccountException("�Աݰ��°� �����ϴ�.");
		}
		System.out.println("�Ա� ����");
	}
	public void withdraw(String account, int money)throws NoAccountException
	,BalanceLackException{
		int balance = 10000;
		if(account==null)
		{
			//���� �߻� �ڵ�
			throw new NoAccountException("��ݰ��°� �����ϴ�.");
		}else if(money>balance)
		{
			throw new BalanceLackException("�ܰ� ����");
		}
		else {
			System.out.println("��� ����");
		}
	}

}