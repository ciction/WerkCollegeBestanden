package werkCollege4;

public class Som extends Exception {
	double left;
	double right;
	double result = 0;
	
	public Som(double left, double right) {
		super();
		this.left = left;
		this.right = right;
		
		calculate(left, right);
		
	}
	
	
	
	public double getResult() {
		return result;
	}



	public void setResult(double result) {
		this.result = result;
	}



	private void calculate(double left, double right){
		this.result = left + right;
		
		if(right > 0) { if(result < left) throw new RuntimeException ("double overflow");}
		else if(right < 0){if(result > left) throw new RuntimeException ("double underflow");}

		if(left > Double.MAX_VALUE || right > Double.MAX_VALUE) throw new RuntimeException ("double too big");
		if(left < Double.MIN_VALUE || right < Double.MIN_VALUE) throw new RuntimeException ("double too small");
	}
	
}
