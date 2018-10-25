package deqo.mtra;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ItemTest {
   private String no,nom2;
   private  int size;

    private Item item=new Item("traore");
    private Item item2=new Item("traore");
    private SimpleStack st=new my_simpleStack(item);


    @Before
    public void setUp(){
        no="traore";
        nom2="Moussa";
        size=1;
        item2.setNom("Moussa");

    }
    @Test
    public void testGetNom(){
        assertEquals("ne renvoi-pas"+no+"different de"+item.getNom(),no,item.getNom());
    }
    @Test
    public void testGetsize(){
        assertEquals("ne renvoi-pas",size,st.getSize());
    }


    @Test
    public void testSetNom(){
        assertEquals("ne renvoi-pas"+nom2+"different de"+item.getNom(),nom2,getItem().getNom());
    }

    public Item getItem() {
        return item2;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}