package deqo.mtra;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class my_simpleStack implements SimpleStack   {


    private Stack<Object> stack=new Stack<>();


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
        return  (Item) stack.peek();

    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        return (Item) stack.pop();

    }


}
