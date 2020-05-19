public class three {
	public static void main(String[] args)
	{
		Queue q=new Queue();
		for(int i=1;i<21;i++)
		{
			q.enqueue(i);
		}
		for (int i=1;i<21;i++)
		{
			while(!q.empty())
			{
				System.out.print(q.dequeue()+" ");
			}
		}
	}
}

class Queue {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	public Queue() {
		elements = new int[DEFAULT_CAPACITY];
	}
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}
	public int dequeue() {
		return elements[--size];
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}