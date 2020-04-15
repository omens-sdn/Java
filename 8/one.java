import java.util.Scanner;
public class one {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of points: ");
    int number = input.nextInt();
    double[][] points = new double[number][2];
    System.out.print("Enter " + number + " points: ");
    int length=points.length;
    for (int i = 0; i <length; i++) {
      points[i][0] = input.nextDouble();
      points[i][1] = input.nextDouble();
    }
    int[] p1=new int[length];
    int[] p2=new int[length]; 
    p1[0]=0;p2[0]=1;
    int n=0,m=0;
    double shortest = distance(points[p1[0]][0], points[p1[0]][1], points[p2[0]][0], points[p2[0]][1]); 
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = distance(points[i][0], points[i][1],points[j][0], points[j][1]); 
        if (shortest >= distance) {
          p1[n++] = i; 
          p2[m++] = j; 
          shortest = distance; 
        }
      }
    }
    for(int i=0;i<length;i++)
    {
    	if(points[p1[i]][0]!=points[p2[i]][0]&&points[p1[i]][1]!=points[p2[i]][1])
    	{
    		System.out.println("The closest two points are " + "(" + points[p1[i]][0] + ", " + points[p1[i]][1] + ") and (" + points[p2[i]][0] + ", " + points[p2[i]][1] + ")");
    	}
    }
    System.out.println("Their distance is "+shortest);
  }
  public static double distance( double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}