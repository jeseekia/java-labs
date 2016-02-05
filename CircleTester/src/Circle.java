import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author Jeseekia
 *
 */
public class Circle {
	private double Radius;
	public static int Counter;
	
	
	public Circle(double mRadius) {
		Counter++;
		Radius = mRadius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*Radius;
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public double getArea() {
		return Radius*Radius*Math.PI;
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	private String formatNumber(double x) {
		DecimalFormat formatter = new DecimalFormat("######0.00");
		String formattedNumber = formatter.format(x);
		return formattedNumber;
	}
	
	
}
