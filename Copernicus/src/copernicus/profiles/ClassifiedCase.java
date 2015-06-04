package copernicus.profiles;

//package profiles;

import copernicus.profiles.Case;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Locale;
import java.util.ResourceBundle;

public class ClassifiedCase extends Case 
{
	protected String category;
	
	public static final int STANDARD=0;
	public static final int CLASS_FUNC=1;
	public static final int DIAMOND=2;
	public static final int LEARY=3;
	public static final int GOLDBERG=4;
	public static final int EICHMANN=5;
	public static final int OTHERS=6;
	public static final int CODES=7;
	public static final int TAULBEE_SISSON=8;
	public static final int PETERSEN=9;
	public static final int PANCHERI_APAP=10;
	public static final int GOUGH_PLUZEK=11;
	public static final int ADAPTATIVE_POTENTIAL=12;
	public static final int CLASSIFICATION_RESULTS=13;
	
	public static final int ALL_INDEXES_1=20;
	
	public ClassifiedCase(int id, int kind, ResourceBundle ui)
	{
		super(id, kind, ui);
		this.category="";
	}
	
	public ClassifiedCase(ArrayList<Double> features, int gender, String category, ResourceBundle ui)
	{
		super(1, Case.CASE, ui);
		this.features=features;
		this.name="p1";
		this.gender=gender;
		this.category=category;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	
	public void read(String line, char separator, boolean withDescription)
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
			else
			{
				if(Case.isNum(values[i]))
				{
					this.features.add(Double.parseDouble(values[i]));
				}
				else
				{
					if(values[i].startsWith("+"))
					{
						if(line.length()>1)
						{
							this.name=values[i].substring(1, values[i].length());
						}
					}
					else
					{
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
						else
						{
							if(withDescription==true)
							{
								this.description=values[i];
							}
							else
							{
								this.category=values[i];
							}
						}
					}
				}
			}
		}
	}
	
	public String toString()
	{
		switch(this.kind)
		{
			case Case.PATTERN:
			{
				return this.category;
			}
			case Case.CASE:
			{
				return "#"+id+":";
			}
			default:
			{
				return String.valueOf(id);
			}
		}
		
	}

}
