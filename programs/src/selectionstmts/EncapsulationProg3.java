package selectionstmts;

public class EncapsulationProg3 {
	private String  pwsd; 
	public void setPassword(String pwd)
	{
		if(pwd.length()>=8)
		{
			this.pwsd=pwsd;
			System.out.println("password is set sucrtssfully");
		}
		else
		{
			System.out.println(" password  should atleast 8 characters");
		}
	}

}
