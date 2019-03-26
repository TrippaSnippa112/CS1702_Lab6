import java.text.DecimalFormat;
import java.util.Random;
public class CS1702_Lab6 
{
	public static void main(String args[])
	{		
		double x = 123.456, y = 17.0/3.0, z = Math.sqrt(2);
		String a = "Hello", b = "World";
		
		//Question 6.3.1
		
		System.out.println("Q6.3.1");
		DecimalFormat y_format = new DecimalFormat("#.###");
		System.out.println(y);
		String formatted_string = y_format.format(y);
		System.out.println(formatted_string);
		
		//Question 6.3.2
		System.out.println("Q6.3.2");
		System.out.println(String.valueOf(x).split("\\.")[0].length()); //Checks Number before decimal
		System.out.println(String.valueOf(x).split("\\.")[1].length()); //Checks Number after decimal
		System.out.println(String.valueOf(y).split("\\.")[0].length());
		System.out.println(String.valueOf(y).split("\\.")[1].length());
		System.out.println(String.valueOf(z).split("\\.")[0].length());
		System.out.println(String.valueOf(z).split("\\.")[1].length());
		
		//Question 6.3.3
		System.out.println("Q6.3.3");
		String c = new StringBuffer(a).reverse().toString().concat(" " + b);
		System.out.println(c);
		
		//Question 6.3.4
		System.out.println("Q6.3.4");
		String d = c.replaceAll("ll","ppp");
		System.out.println(d);
		
		RoundingTest(10.2);
		CeilingTest(11);
		FloorTest(10);
		
		//Question 6.6.1
		System.out.println("Q6.6.1");
		Random rand = new Random();
		int min = -100;
		int max = 100;
		
		for(int i=0;i<3;++i);
		{
			System.out.println(rand.nextInt(max - min) + min);
		}
		
		//Question 6.6.3
		System.out.println("Q6.6.3");
		for(double i=0;i<3;++i) 
		{
			System.out.println(rand.nextDouble());
		}
	
		//Question 6.6.4
		System.out.println("Q6.6.4");
		double min1 = 0.0;
		double max1 = 1.0;
		
		for(double i=0;i<3;++i) 
		{
			System.out.println(rand.nextDouble() * (max1 - min1));
		}
		
		//Question 6.6.5
		System.out.println("Q6.6.5");
		double min2 = 5.3;
		double max2 = 7.5;
		
		for(double i=0;i<3;++i) 
		{
			System.out.println(min2 + (max2 - min2) * rand.nextDouble());
		}
		
	}

	public static void RoundingTest(double x) 
	{
	//RoundTest

		DecimalFormat dp6 = new DecimalFormat("#.######"); //set format to 6dp
		String formatted_string = dp6.format(x).toString(); //convert to string
		System.out.println(formatted_string); //output the string
		
		double z = Math.round(x); //rounds the value  
		System.out.format("%.6f",z); //value rounded to 6dp
		System.out.println(); //final value	
	}
	
	public static void CeilingTest(double x) 
	{
	//CeilTest
		
		DecimalFormat dp6 = new DecimalFormat("#.######");
		String formatted_string = dp6.format(x).toString(); 
		System.out.println(formatted_string);
		
		double z = Math.ceil(x);  
		System.out.format("%.6f",z);
		System.out.println(); 
	}
	public static void FloorTest(double x) 
	{
	//FloorTest
		
		DecimalFormat dp6 = new DecimalFormat("#.######");
		String formatted_string = dp6.format(x).toString();
		System.out.println(formatted_string);
		
		double z = Math.floor(x);  
		System.out.format("%.6f",z);
		System.out.println();
	}
		
	}


