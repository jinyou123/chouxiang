public class Dog extends Animal{
    public  Dog(String name){
        super(name);
    }

    @Override
    public void bank() {
        System.out.println(getName()+"在汪汪.....");
    }
}
