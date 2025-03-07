public class Sphere extends Shape implements Volume {
    private double radius;

	public Sphere(double radius) {
    this.radius = radius;  // No need for super()
}

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

