package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public Validator() {
		// TODO Auto-generated constructor stub
	}

		
	public static void main (String args[])
	{
		String path = "abc/?q=1";
		
		if ( !(path.startsWith("/") ))
		{
			path = "/" + path;
		}
		System.out.println(path);
		
		if ( path.contains(".html"))
		{
			System.out.println("contains");
			path = path.replace(".html", "/");
		}
		System.out.println(path);
		
		
		if ( (path.endsWith("//")))
		{
			
			path = path.replaceAll("//+$", "/");
			System.out.println(path);
		}
		
		if (!path.endsWith("/"))
			path = path+"/";
		System.out.println(path);
		
			
		
	}
	
}
