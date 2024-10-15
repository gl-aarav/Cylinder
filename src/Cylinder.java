import java.util.Scanner;
public class Cylinder {
	
	private final double π;
	private double radius;
	private double height;
	private double volume;
	private double surfacearea;
	
	public Cylinder()
	{
		radius = 0.0;
		height =0.0;
		π = Math.PI;
		volume = 0.0;
		surfacearea = 0.0;
	}

	public void getDimension() 
	{
		Scanner in = new Scanner (System.in);

		System.out.print("Enter the radius (double): ");
		radius = in.nextDouble();
		System.out.print("\nEnter the height (double): ");
		height = in.nextDouble();
	}
	public void findSAandV()
	{
		volume = π*radius*radius*height;
		surfacearea = 2*π*radius*height + 2*π*radius*radius;
	}
	public void printToScreen()
	{
		System.out.printf("Radius %10.6s %12.4f", "=", radius);
		System.out.printf("\nHeight %10.6s %12.4f", "=", height);
		System.out.printf("\nVolume %10.6s %12.4f", "=", volume);
		System.out.printf("\nSurface Area %4.6s %12.4f", "=", surfacearea);	
	}
}
