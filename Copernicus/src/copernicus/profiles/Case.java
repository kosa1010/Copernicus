package copernicus.profiles;

//package profiles;

import java.util.*;


public class Case 
{
	protected ResourceBundle ui;
	
	public static final int PATTERN=0;
	public static final int CASE=1;
	
	public static final int M=0;
	public static final int F=1;
	
	protected String name;
	protected String description;
	protected int gender;
	
	protected int id;
	protected int kind;
	protected boolean selected;
	protected ArrayList<Double> features;
			
	public Case(int id, int kind, ResourceBundle ui)
	{
		this.ui=ui;
		
		this.description="";
		
		this.id=id;
		this.kind=kind;
		
		this.selected=true;
		this.features=new ArrayList<Double>();
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public ArrayList<String> getFeatureNames()
	{
		ArrayList<String> array=new ArrayList<String>();
		
		for(int a=0; a<this.features.size(); a++)
		{
			array.add(Scales.getDescr3(a));
		}
		
		return array;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setSelected(boolean b)
	{
		this.selected=b;
	}
	
	public boolean isSelected()
	{
		return this.selected;
	}
	
	public ArrayList<Double> getFeatures()
	{
		return this.features;
	}
	
	public double getFeature(int i)
	{
		return this.features.get(i).doubleValue();
	}
	

	public void read(String line, char separator)
	{
		String[] values=line.split(new Character(separator).toString());
		
		for(int i=0; i<values.length; i++)
		{
			if(values[i].startsWith("#"))
			{
				if(line.length()>1)
				{
					this.id=Integer.parseInt(values[i].substring(1, values[i].length()));
				}
			}
			if(Case.isNum(values[i]))
			{
				this.features.add(Double.parseDouble(values[i]));
			}
			if(values[i].startsWith("+"))
			{
				if(line.length()>1)
				{
					this.name=values[i].substring(1, values[i].length());
				}
			}
			if(values[i].startsWith("%"))
			{
				if(line.length()>1)
				{
					if(values[i].charAt(1)=='M' || values[i].charAt(1)=='m')
					{
						this.gender=Case.M;
					}
					if(values[i].charAt(1)=='F' || values[i].charAt(1)=='f')
					{
						this.gender=Case.F;
					}
				}
			}
		}
	}
		
	protected static boolean isNum(String s) 
	{
		try 
		{
			Double.parseDouble(s);
		}
		catch (NumberFormatException e) 
		{
			return false;
		}
		return true;
	}
	
}
