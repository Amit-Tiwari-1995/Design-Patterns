package SINGELTON;

public class Singelton {
	
	private Singelton singleton=null;
	
	private Singelton()
	{
		if(singleton==null)
		{
			singleton=new Singelton();
		}
		
	}
	
	public static void main(String[] args) {
		

		
	}

}
