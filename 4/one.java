public class one {
	 public static void main(String[] args) {   
		    double a1=Math.toRadians(Math.random()*180);
		    double a2=Math.toRadians(Math.random()*180);
		    double a3=Math.toRadians(Math.random()*180);
		    double x1=40*Math.cos(a1);
		    double y1=40*Math.sin(a1);
		    double x2=40*Math.cos(a2);
		    double y2=40*Math.sin(a2);
		    double x3=40*Math.cos(a3);
		    double y3=40*Math.sin(a3);
		    double a=Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
		    double b=Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3),0.5);
		    double c=Math.pow((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2),0.5);
		    double anglea=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		    double angleb=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		    double anglec=Math.toDegrees(Math.acos((c*c-a*a-b*b)/(-2*a*b)));
		    System.out.print("The three angles are: "+Math.round(anglea*100)/100.0+","+Math.round(angleb*100)/100.0+","+Math.round(anglec*100)/100.0);
	 }
}