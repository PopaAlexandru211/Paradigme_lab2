public class Triangle extends Form{
    private float height;
    private float base;
    Triangle() {
        height=0;
        base=0;
    }
    public Triangle(float base, float height, String color) {
        this.base=base;
        this.height=height;
        this.color=color;
    }
    public float getArea(){
        return (height*base)/2;
    }
    public String toString(){
        return super.toString();
    }
}
