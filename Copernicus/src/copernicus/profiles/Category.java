package copernicus.profiles;

//package profiles;

public class Category 
{
	private int id;
	private String label;
	
	public Category(int id, String label)
	{
		this.id=id;
		this.label=label;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public String getLabel()
	{
		return this.label;
	}
	
	public String toString()
	{
		return this.label;
	}
}
