package copernicus.profiles;

import templates.BasicDataTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DataTable extends BasicDataTable
{
	public static int ALL=0;
	public static int ONLY_PARAMETERS=1;
	
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
	public static final int PSYCHOPATHOLOGY_INDEXES=14;
	
	public static final int PANCHERI=30;
	public static final int APAP=31;
	
	public static final int ALL_INDEXES_1=20;
	public static final int ALL_INDEXES_2=21;
	
	//private String name;
	
	private ArrayList<ClassifiedCase> objects; 
	
	
	private BitSet selectedAttributes;
	
	//private AttributeStatistics attributesStatistics;
	
	public DataTable(ResourceBundle ui)
	{
		super(ui);
		
		//this.name="";
		this.objects=new ArrayList<ClassifiedCase>();
		
	}
	
	public int getNumberOfSelectObjects()
	{
		int n=0;
		
		for(int o=0; o<this.objects.size(); o++)
		{
			if(this.objects.get(o).isSelected())
			{
				n++;
			}
		}
		
		return n;
	}
	
	public ArrayList<Category> getCategories()
	{
		return this.categories;
	}
	
	public int getCategoryID(String label)
	{
		int id=-1;
		for(Category c: this.categories)
		{
			if(label.equals(c.getLabel()))
			{
				id=c.getID();
				break;
			}
		}
		return id;
	}
	
	public void read(File file, char separator, int kind) throws FileNotFoundException
	{
		this.inputFile=file;
		
		boolean withDescription=false;
		
		Scanner fileScanner=new Scanner(file);
		
		//Wczytanie nazw atrybut�w:
		if(fileScanner.hasNextLine())
		{
			String line=fileScanner.nextLine();
			
			if(line.startsWith("TABLE"))
			{
				if(line.length()>6)
				{
					//this.name=new String(line.substring(6, line.length()));
				}
				if(fileScanner.hasNextLine())
				{
					line=fileScanner.nextLine();
				}
				else
				{
					return;
				}
			}
			
			String[] names=line.split(new Character(separator).toString());
			for(int i=0; i<names.length; i++)
			{		
				if(names[i].equals("id"))
				{
					
				}
				else
				{
					if(names[i].equals("name"))
					{
						
					}
					else
					{
						if(names[i].equals("gender"))
						{
							
						}
						else
						{
							if(names[i].toLowerCase().startsWith("class") || names[i].toLowerCase().startsWith("klasa"))
							{
								this.attributes.add(names[i]);
								this.attrTypes.add(Attribute.STRING);
							}
							else
							{
								if(names[i].toLowerCase().startsWith("exam") || names[i].toLowerCase().startsWith("badany"))
								{
									this.attributes.add(names[i]);
									this.attrTypes.add(Attribute.STRING);
									
									withDescription=true;
								}
								else
								{
									this.attributes.add(names[i]);
									this.attrTypes.add(Attribute.DOUBLE_T);
								}
							}
						}
					}
				}
			}
		}
		
		//Wczytanie przypadk�w:
		int c=1;
		while(fileScanner.hasNextLine())
		{
			String line=fileScanner.nextLine();
			
			if(line.isEmpty())
			{
				break;
			}
			
			ClassifiedCase newCase=new ClassifiedCase(c, kind, this.ui);
			newCase.read(line, separator, withDescription);
			
			String categoryLabel=newCase.getCategory();
			if(!categoryLabel.isEmpty())
			{
				boolean exists=false;
				for(Category cat: this.categories)
				{
					if(categoryLabel.equals(cat.getLabel()))
					{
						exists=true;
						break;
					}
				}
				if(exists==false)
				{
					this.categories.add(new Category(Categories.getCategoryFromString(categoryLabel), categoryLabel));
				}
			}
			
			this.objects.add(newCase);
			c++;
		}
		
		fileScanner.close();
	}
	
	public void setSingleCase(ArrayList<Double> features, int gender, String category)
	{
		for(int f=0; f<features.size(); f++)
		{
			this.attributes.add(Scales.getDescr3(f));
			this.attrTypes.add(Attribute.DOUBLE_T);
		}
		
		this.attributes.add(this.ui.getString("label_class_2"));
		this.attrTypes.add(Attribute.STRING);
		
		this.categories.add(new Category(0, category));
		this.objects.add(new ClassifiedCase(features, gender, category, this.ui));
	}
	
	public ClassifiedCase getSingleCase()
	{
		return this.objects.get(0);
	}
	
	public ArrayList<String> getAttributeNames()
	{
		return this.attributes;
	}
	
	
	public String getAttribute(int a)
	{
		return this.attributes.get(a);
	}
	
	public int getAttributeNumber()
	{
		return this.attributes.size();
	}
	
	public String getCaseCategory(int c)
	{
		return this.objects.get(c).getCategory();
	}
	
	public ArrayList<ClassifiedCase> getObjects()
	{
		return objects;
	}
	
	
	public int getObjectNumber()
	{
		return this.objects.size();
	}
	
	public ClassifiedCase getObject(int c)
	{
		return this.objects.get(c);
	}
	
	public ClassifiedCase getObjectByDecision(String d)
	{
		ClassifiedCase obj=null;
		
		for(ClassifiedCase c: this.objects)
		{
			if(d.equals(c.getCategory()))
			{
				obj=c;
				break;
			}
		}
		
		return obj;
	}
	
	public String getAbsoluteInputFilePath()
	{
		return inputFile.getAbsolutePath();
	}
	
}
