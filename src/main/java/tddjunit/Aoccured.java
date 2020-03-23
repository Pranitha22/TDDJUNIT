package tddjunit;

public class Aoccured {
public String getStr(String string) {
	String str="";
	
	if(string.charAt(0)=='A'&& string.charAt(1)=='A')
		str=string.substring(2,string.length());
	else if(string.charAt(0)=='A')
		str=string.substring(1,string.length());
	else if(string.charAt(1)=='A')
		str=string.charAt(0)+string.substring(2,string.length());
	else
		str=string;
	return str;
}
}
