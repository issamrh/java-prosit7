public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    private Animal[] aquaticAnimals=new Animal[10];
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[3];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        if (searchAnimal(animal) != -1)
            throw new ZooFullException("This element exist");
        if (isZooFull())
            throw new ZooFullException("The Table is full");
        if(animal.getAge()<0)
            throw new InvalidAgeException();
        animals[nbrAnimals] = animal;
        nbrAnimals++;


    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }
    public void addAquaticAnimal(Aquatic aquatic){
        for (int x=0; x < this.aquaticAnimals.length; x++)
            if (x != this.aquaticAnimals.length - 1){
                this.aquaticAnimals[x]=aquatic;
            }
    }
    public void displayAquaticAnimals() {
        System.out.println("List of Aquatic animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }
    public float maxPenguinSwimmingDepth(){
        float d=0;
        for(int x=0; x < this.aquaticAnimals.length; x++){
            if(this.aquaticAnimals[x] instanceof Penguin){
                Penguin p=(Penguin) this.aquaticAnimals[x];
                if(p.getSwimmingDepth()>d){
                    d=p.getSwimmingDepth();
                }
            }
        }
        return d;
    }
    public void displayNumberOfAquaticsByType(){
        int nbdolphines=0;
        int nbpenguins=0;
        for (int x=0; x < this.aquaticAnimals.length; x++){
            if(this.aquaticAnimals[x] instanceof Penguin){
                nbpenguins+=1;
            }else{
                nbdolphines+=1;
            }
        }
        System.out.printf("le nombre des dophins est "+nbdolphines);
        System.out.printf("le nombre des penguins est "+nbpenguins);

    }
}