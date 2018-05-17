package error;

public class ErrorCode {

	public static void recursion(int num)
	{
		System.out.print("Number: " +num);
		if(num == 0)
			return;
		else
			recursion(++num);
	}
	public static void main(String args [])
	{
		ErrorCode.recursion(1);
	}
}
