package methodoveriding;

public class RBI {
	public float getInterestRate()
	{
		return 7.4f;
		
	}
	
}	
	
class HDFC extends RBI
{
		
	public float getInterestRate()
		{
		
		System.out.println(super.getInterestRate());
		return 12.45f;
			
		}

}
