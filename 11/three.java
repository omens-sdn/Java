import java.util.ArrayList;
import java.util.Scanner;
public class three {
	public static void main(String[] args)
	{
		System.out.println("Enter five string:");
		Scanner input=new Scanner(System.in);
		Mystack stack=new Mystack();
		for(int i=0;i<5;i++)
		{
			String x=input.next();
			stack.push(x);
		}
		for(int i=4;i>=0;i++)
		{
			if(!stack.isEmpty())
			System.out.print(stack.pop().toString()+",");
		}
	}
}

class Mystack extends ArrayList<Object> {
	
	/*public boolean isEmpty() {
		return isEmpty();
	}*/
	public int getSize() {
		return size();
	}
	public Object peek() {
		return get(getSize() - 1);
	}
	public Object pop() {
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}
	public void push(Object o) {
		add(o);
	}
	@Override 
	/** Override the toString in the Object class */
	public String toString() {
		return "stack: " + toString();
	}
}