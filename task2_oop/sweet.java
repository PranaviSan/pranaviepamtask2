package epam.task2_oop;

import java.util.*;

public class sweet extends NYG
{
    public sweet(String name, int quantity) {
        super(name, quantity);
    }

    void pack()
    {
        System.out.println(this.getName()+" are packing......");
    }

}