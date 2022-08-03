import org.junit.jupiter.api.Test;

public class TestingClass {
@Test
void sum()
{
	
	int a=10;
	int b=20;
	System.out.println(a+b);
}
int square(int x)
{
	return x*x;
}
int CountA(String word)
{
	int Count=0;
	for(int i=0;i<=word.length();i++)
	{
		if(word.charAt(i)=='a' || word.charAt(i)=='A')
		{
			Count++;
		}
	}
	return Count;
}
}
