package ex2_QA_2024.ex2_QA_2024;

public class ex1 {
	public static String calc_roots(int a,int b,int c) {
	String output=" ";	
	
	if ((a<5) || (a>200)) {
		output="a not in range";
		return output;
	}
	if ((b<5) || (b>200)) {
		output="b not in range";
		return output;
	}
	if ((c<5) || (c>200)) {
		output="c not in range";
		return output;
	}
	if (a==0) {
		output="not quadratic eqation";
		return output;
	}
	
	double determinant=b*b-4*a*c;
	if (determinant<0) {
		output="no roots";
		return output;
	}
	else if(determinant>0){
		output="two roots";
		return output;
	}
	else {
		output="one root";
		return output;
	}
	
	

}
}
