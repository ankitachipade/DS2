import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import SimpleString.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.DataInputStream;
public class StringOperationImpl extends _StringOperationImplBase
{
public String get_String(float symbol)
{
	String res ;
	
	if(symbol%2==0){
		res="even";
		return res; }
	else
	{
		res="odd";
		return res;
	}
	
}
public StringOperationImpl()
{
super();
}
}


