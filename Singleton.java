
public class Singleton 
{
	  private static final Singleton instance = new Singleton(); 
	  
	  private Singleton() 
	  {  
		  System.out.println("Hello Epam");
	  } 
	  
	  public static Singleton getInstance()
	  { 
	        return instance; 
	    } 
	  
	public static void main(String args[])
	{
		getInstance();
	}
	  
}
