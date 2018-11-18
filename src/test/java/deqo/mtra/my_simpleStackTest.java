package deqo.mtra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class my_simpleStackTest  {
    private String no,nom2;
    private  int size;

    private Item item=new Item("traore");
    private Item item2=new Item("traore");
    private SimpleStack st=new my_simpleStack(item);



    @Before
    public void setUp() throws Exception {
        no="traore";
        nom2="Moussa";
        size=1;
        item2.setNom("Moussa");

    }






    @Test
    public void isEmpty() {
    assertTrue(true);
    }

    @Test
    public void getSize() {
    }

    @Test
    public void push() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void pop() {
    }
}