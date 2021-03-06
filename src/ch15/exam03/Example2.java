package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<User> set = new HashSet<>();
		
		User user1 = new User("winter","한겨울");
		User user2 = new User("winter","한겨울");
		set.add(user1);
		set.add(user2);


		System.out.println(user1.equals(user2));
		System.out.println(set.size());
		String st1 = new String("asd");
		String st2 = new String("asd");
		Integer i1 = 3;
		Integer i2 = 3;
		System.out.println(i1.hashCode() + " " + i2.hashCode());
	}

}
