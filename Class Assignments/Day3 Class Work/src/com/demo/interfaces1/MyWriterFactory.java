package com.demo.interfaces1;
import com.demo.interfaces11.PlainTextWriter;
import com.demo.interfaces11.DecoratedWriter;
import com.demo.interfaces11.HTMLWriter;
public class MyWriterFactory 
{
	public static Writer getMyWriter(String msg)
	{
		if(msg.equals("plain"))
		{
			return (new PlainTextWriter());}
		else if(msg.equals("decorated writer")) 
		{
			return (new DecoratedWriter());}
		else if(msg.equals("HTMLWriter"))
		{
			return (new HTMLWriter());}
		
		else
				return null;
	}
}
