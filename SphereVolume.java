import java.util.Scanner; //Import Scanner

public class SphereVolume {

	public static void main(String[] args) 
	{
	
	Scanner keyboard = new Scanner(System.in); 	
	double diam;
	double volume;
	
	System.out.println("This program's purpose is to determine the volume of a sphere given the diameter.");
	System.out.print("Enter the diameter of a sphere: ");
	
	diam = keyboard.nextDouble();
	double radius = (diam) / (2.0);
	volume = (4.0/3.0) * (Math.PI * Math.pow(radius,3));
	System.out.printf("The volume of the sphere is: %.2f ", volume);

	}

}
