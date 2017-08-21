//this method is used to get the data from xml/json file (key value pair).you have to specify the key and the name of the file as the parameters
public static String Getdatafrompropfile(String ev,String name)
{
	 String data=null;
	 Properties prop = new Properties();
	 InputStream input = null;
	 {
	 try
	 {
	 input = new FileInputStream(name);
	 }  
		 catch (FileNotFoundException e)
		 {
		 e.printStackTrace();
		 }
		 try 
		 {              
		 prop.load(input);
		 data =prop.getProperty(ev);
		 }			
			 catch (IOException e)
			 {
			 e.printStackTrace();					
			 }
	 	}
	 return data;
 }
