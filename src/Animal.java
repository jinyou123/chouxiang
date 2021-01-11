public abstract class Animal {
    private  String name;
    public abstract void bank();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Animal(String name){
        this.name=name;    //一定要写
    }

}
