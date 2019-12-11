class StackImplementation
{
	static final int MAX=5;
	int top;
	int[] a=new int[MAX];
	StackImplementation()
	{
	    top=-1;
	}
	boolean isEmpty()
	{
		return(top<0);
	}
	boolean push(int x)	
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack OverFlow");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+" is pushed into Stack");
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is underFlow");
			return 0;
		}
		else
		{
			int x=a[top--];
			
			return x;
		}
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack is UnderFlow");
			return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	public static void main(String[] args)
	{
		StackImplementation si=new StackImplementation();


		si.isEmpty();
		si.push(10);
		si.push(20);
		si.push(30);
		System.out.println(si.pop()+" is Poped From The Stack");

	}
}