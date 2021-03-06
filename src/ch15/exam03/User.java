package ch15.exam03;

public class User {
	private String uid;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public User(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return uid.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof User)
	{
		User temp = (User)obj;
		if(uid.equals(temp.uid))
		{
			return true;
		}else {
			return false;
		}
	}else
	{
		return false;
	}
}
}
