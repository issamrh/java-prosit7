import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

   public ZooManagement(int nbrCages,String zooName){
        this.nbrCages=nbrCages;
        this.zooName=zooName;
    }

    public String toString() {
        return this.zooName + " comporte " +this.nbrCages+ " cages ";
    }

    public static void main(String[] args) throws ZooFullException {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "benarous");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


       /* System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));*/

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Aquatic dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        myZoo.addAquaticAnimal(dolphin);
    myZoo.displayAquaticAnimals();
    }
}
