package ie.tudublin;

public class Cat extends Animal
{
    // Lab 1 - 1
    private int numLives;

    public Cat(String name)
    {
        super(name);
        // Lab 1 - 3
        this.numLives = 9;

    }

    // Lab 2 - 2 
    public int getLives()
    {
        return numLives;
    }
    // Lab 2 - 2 
    public void setLives(int numLives)
    {
        this.numLives = numLives;
    }

    // Lab 1 - 4
    public void kill()
    {
        if(this.numLives > 0)
        {
            this.numLives--;
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("Dead");
        }
    }
}