package diledsys.homework.biard;

public class Biard implements Cloneable {
    private String name;
    private String color;
    private int size;

    public Biard(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Biard{name=" + name + " color=" + color + " size=" + size + "}";
    }

    /**
     * deep cloning
     *
     * @return new Biard
     */
    @Override
    protected Biard clone() {
        return new Biard(this.name, this.color, this.size);
    }

    /**
     * surface cloning
     *
     * @return this
     */
//    @Override
//    protected Biard clone() throws CloneNotSupportedException {
//        return this;
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
