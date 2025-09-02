class Point2D{
	private int x;
	private int y;
	Point2D(int x, int  y){
		this.x = x;
		this.y = y;
	}
	String show(){
		return " Coordinates are : " + x + "," +y ;
	}
	boolean isEqual(Point2D obj){
		if(x==obj.x && y==obj.y){
			return true;
		}return false;
	}

	double calculateDistance(Point2D obj){
		int xCord = obj.x - x;
		int yCord = obj.y - y;
		xCord = xCord*xCord;
		yCord = yCord*yCord;
		return Math.sqrt(xCord+yCord);
	}

}