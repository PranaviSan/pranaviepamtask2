package epam.task2_oop;

public abstract class NYG
{
    private String name;
    private int quantity;

    public NYG(String name, int quantity) 
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    abstract void pack();
    //For the sweet class
}