package deqo.mtra;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class my_simpleStack implements SimpleStack   {


    public List<Item> stack=new ArrayList<>();

    my_simpleStack(Item item ){
        stack.add(item);
    }

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
        return  this.stack.isEmpty();

    }


    /**
     * Returns the number of items in this stack.
     */
    public int  getSize(){
     return this.stack.size();
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        this.stack.add(item);

    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException{
        return this.stack.get(this.getSize()-1);

    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        return this.stack.remove(this.getSize()-1);

    }


}
