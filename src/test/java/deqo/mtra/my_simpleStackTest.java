package deqo.mtra;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class my_simpleStackTest  {
    private SimpleStack simpleStack;




    @Before
    public void setUp() throws Exception {
        simpleStack =new my_simpleStack();

        System.out.println("je suis execute avant le test");

    }






    @Test
    public void testIsEmpty() {

        Assert.assertEquals(true,simpleStack.isEmpty());

        String element ="toto";
        simpleStack.push(new Item(element));
        Assert.assertEquals(false,simpleStack.isEmpty());


    }

    @Test
    public void testGetSize() {
        Assert.assertEquals(0,simpleStack.getSize());
        String element ="toto";
        simpleStack.push(new Item(element));
        simpleStack.push(new Item(element+"2"));
        Assert.assertEquals(2,simpleStack.getSize());

    }

    @Test
    public void testPush() {
        //When
        Item item=new Item("Moussa");

    }

    @Test
    public void testPeek() {
    }

    @Test
    public void testPop() {
    }
}