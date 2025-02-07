// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ZooFullException {
        Animal lion =new Animal("lion","leo",7,true);
        Zoo myZoo =new Zoo("zoo","tunis");
        myZoo.addAnimal(lion);
      //  System.out.printf(myZoo.displayZoo());
        System.out.printf("\n");
        System.out.println(myZoo.toString());
        System.out.printf("\n");
        //System.out.printf(lion.toString());
        System.out.printf(" "+myZoo.searchAnimal(new Animal("lion","leo",7,true)));

    }
}