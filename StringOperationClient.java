import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import SimpleString.*;
import java.io.DataInputStream;
public class StringOperationClient
{
public static void main(String args[])
{
try
{

DataInputStream din=new DataInputStream(System.in);
ORB orb=ORB.init(args,null);
NamingContext ncRef=NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
NameComponent path[]={new NameComponent("NASDAQ","")};
StringOperation market=StringOperationHelper.narrow(ncRef.resolve(path));
System.out.println("\nEnter the number to check odd/even: ");
float num =din.readLine();
System.out.println("\nResult /Number is: " + market.get_String(num));
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
