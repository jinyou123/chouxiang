package shape;

public abstract class Triange extends Shape {
    private float bottom;
    private  float height;
    public  Triange(float bottom,float height){
        this.bottom=bottom;
        this.height=height;
    }
    public float calArea(){
        System.out.println("计算三角形的面积：");
        return (bottom*height)/2;
    }
}
