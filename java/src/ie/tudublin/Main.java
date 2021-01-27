package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Dog("Misty");

        Animal topCat = new Cat("TopCat");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 


        // Lab 1 - 5
        Cat ginger = new Cat("Ginger");

        int numLives = ginger.getLives();

        for(int i = 0; i < numLives+1; i++)
        {
            ginger.kill();
        } // end for

    }
} 