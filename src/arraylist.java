/*
Implement an Array-based List that stores Book instances
You will implement an AList class from scratch. Your AList class must implement the following
operations:
• An empty constructor: Should create an empty AList. This implies having an array initialized to an
initial maxSize and setting size to 0.
• void listAdd(Book p): Should add a new node with the given book to the AList and resize when
appropriate.
• void listRemove(int pos): Should remove the item at position pos from the AList. This implies
shuffling items if necessary and updating the size.
• String toString(): This method should return a string containing all the elements in the AList. Each
element should be in a new line when the resulting String is printed
 */
import java.util.Arrays;

public class arraylist <B>{

    Object[] array;
    int max;
    int size;


    public arraylist() {
        max = 400;
        array = new Object[max];
        size = 0;
    }


    public void listAdd(B p){
        if (size < max){
            array[size] = p;
            size++;
        }
        else {
            max = max * 2;
            Object[] newarray = new Object[max];

            for(int i =0; i < size; i++){
                newarray[i] = array[i];
            }

            newarray[size] = p;
            size = size +1;
            array = newarray;
        }
    }

    public void listRemove(int pos) {

        if (pos < 0|| pos >= size){
            throw new IndexOutOfBoundsException("Invalid Position");
        }
        //fill
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
        }
        //null out the last item
        array[size-1] = null;
        size--;
        }


    // convert the list to a string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            result.append(array[i].toString()).append("\n");
        }

        return result.toString();
    }

}
