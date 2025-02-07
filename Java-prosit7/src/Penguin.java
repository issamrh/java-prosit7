public class Penguin extends Aquatic {

        private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public void swim(){
        System.out.printf("the penguin swims");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
    public float getSwimmingDepth(){
        return this.swimmingDepth;
    }
}