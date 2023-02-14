package Task3;

public class GeometricShape {
     int length;
    int width;
    int area;

    public GeometricShape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public GeometricShape() {
    }

    public void area(){
        area = length*width;
        System.out.println(area);



    }

}

