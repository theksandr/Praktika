public abstract class Dog
{
    String name, colour;
    int height, hair, age;

    Dog()
    {
        name="n";
        age=0;
        height=0;
        colour="c";
        hair=0;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    protected void setHair(int hair) {
        this.hair = hair;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected String getColour() {
        return colour;
    }

    protected int getHeight() {
        return height;
    }

    protected int getHair() {
        return hair;
    }

    protected int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = '" + name + '\'' +
                ", colour = '" + colour + '\'' +
                ", height = " + height +
                ", hair = " + hair +
                ", age = " + age;
    }
}
