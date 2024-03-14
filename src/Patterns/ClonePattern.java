package Patterns;

public class ClonePattern {//Prototype(пораждающий шаблон)
    public static void main(String[] args) {
        Girl mariam=new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam=mariam.clone();
        noMariam.setName("Clone Mariam");
        noMariam.setLazy(false);
        noMariam.setLazy(false);
        noMariam.setSilly(false);
        System.out.println(noMariam.toString());

    }
}
class Girl implements Cloneable{
    private String name;
    private boolean silly=true;
    private boolean lazy=true;
    private boolean little=true;

    public Girl(String name) {
        this.name = name;

    }
    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Patterns.Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", lazy=" + lazy +
                ", little=" + little +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }
}