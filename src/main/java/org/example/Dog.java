package org.example;

/**
 * Hello world!
 *
 */
public class Dog
{
    String name;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

     void bark() {

         System.out.println(name + " says WOOF!");

     }

    public static void main( String[] args )
    {
        Dog num1 = new Dog();
        num1.name = "Fido";


        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = num1;

        myDogs[0].name = "Sharon";
        myDogs[0].setSize(60);
        int x = myDogs[0].getSize();

        System.out.println("my dogs name is " + myDogs[0].name);
        myDogs[0].bark();
        System.out.println(x);
    }
}
