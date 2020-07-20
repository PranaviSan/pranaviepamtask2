package epam.task2_oop;
public class candy extends NYG
{
    public candy(String name, int quantity) 
    {
        super(name, quantity);
    }

    void pack()
    {
        System.out.println(this.getName() + " is packing ......");
    }

}
