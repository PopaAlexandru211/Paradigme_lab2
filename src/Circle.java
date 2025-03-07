public class Circle extends Form{
private float radius;
    public Circle() {
    radius=0;
}
    public Circle(float radius,String color) {
    this.radius=radius;
    this.color=color;
}
    public float getArea() {
        return radius * radius * (float) Math.PI;
    }
    public String toString(){
        return super.toString();
    }
}
