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
	private double Circumference;
	private String FormattedCircumference;
	private double Area;
	private String FormattedArea;
	
	
	public Circle(double mRadius) {
		Radius = mRadius;
	}
	
	public double getCircumference() {
		Circumference = 2*Math.PI*Radius;
		return Circumference;
	}
	
	public String getFormattedCircumference() {
		FormattedCircumference = formatNumber(Circumference);
		return FormattedCircumference;
	}
	
	public double getArea() {
		Area = Radius*Radius*Math.PI;
		return Area;
	}
	
	public String getFormattedArea() {
		FormattedArea = formatNumber(Area);
		return FormattedArea;
	}
	
	private String formatNumber(double x) {
		DecimalFormat formatter = new DecimalFormat("######0.00");
		String formattedNumber = formatter.format(x);
		return formattedNumber;
	}
	
}
