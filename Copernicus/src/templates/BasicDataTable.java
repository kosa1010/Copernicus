package templates;

//package templates;

import copernicus.profiles.Category;
import java.io.File;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BasicDataTable 
{
	protected ResourceBundle ui;
	
	protected File inputFile;
	
	protected ArrayList<String> attributes;
	protected ArrayList<Integer> attrTypes;
	
	protected ArrayList<Category> categories;
	
	public BasicDataTable(ResourceBundle ui)
	{
		this.ui=ui;
		
		this.attributes=new ArrayList<String>();
		this.attrTypes=new ArrayList<Integer>();
		
		this.categories=new ArrayList<Category>();
		
	}
}
