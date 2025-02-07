public non-sealed abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }


    public boolean equals(Aquatic a1) {
        if((a1.getName()==this.getName())&&(a1.getAge()==this.getAge())&&(a1.habitat==this.habitat)){
            return true;
        }else{
            return false;
        }
    }
}