package problems;

public class rotation {
public static void main(String[] args) {
	String xString="ABACD";
	String yString="CDABA";
	String conString=xString+yString;
	if(conString.indexOf(yString)!=-1)
		System.out.println("True");
}
}
