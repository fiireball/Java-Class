package a6.OOP;

public class Wall {
	public double height;
	public double width;
	
	// Constructors
	public Wall() {
		// 0 Args
	}
	public Wall(double width, double height) {
		width = width < 0 ? 0 : width;
		height = height < 0 ? 0 : height;
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return this.height*this.width;
	}
	public double getHeight() {
		return height;
	}
	// Getters & Setters
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

}
