package shape;

public class Square extends Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float calcAra(){
        System.out.println("计算正方形的面积：");
        return side*side; //方法体
    }
}
