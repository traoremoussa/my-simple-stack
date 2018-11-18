package deqo.mtra;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
   private String no,nom2; // peut etre local
   private  int size;

    private Item item=new Item("traore");
    private Item item2=new Item("traore");



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
    public void testSetNom(){
        assertEquals("ne renvoi-pas"+nom2+"different de"+item.getNom(),nom2,item2.getNom());
    }



}