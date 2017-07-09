import java.util.StringTokenizer;
class MytringTokenizer
{
public static void main(String[] args)
{
//create a string and string tokenizer
String s = "I am* going to *learning Java.";
StringTokenizer st = new StringTokenizer(s, "*");
//retrieve and display tokens
while (st.hasMoreTokens())
System.out.print(st.nextToken()+" ");
}
}