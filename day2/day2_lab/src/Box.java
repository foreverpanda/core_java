
class Box{

	private double width;
	private double height;
	private double depth;

	Box(double height,double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	 String showDimensions(){
	 	return ("Dimension is :"+ height + " "+ width + " " + depth );
	 }

	String getVolume(){
		return "Volume is " +(height*width*depth); 

	}
	boolean isEqual(Box x){

		
		if(width==x.width && height ==x.height && depth==x.depth){
		return true;
		}
		 return false;
	}
}