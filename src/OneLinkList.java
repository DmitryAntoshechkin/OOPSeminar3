
import java.util.Iterator;

public class OneLinkList <E> implements Iterable {

    private int counter = 0;
    public OneLinkList() {
        listCell = new ListCell<>();
    }
    public int size(){
        return counter;
    }
    private ListCell<E> listCell = null;

    public void add (E element){
        if (counter == 0){
            listCell.set(element);
        }
        else{
            listCell.add(element);
        }
        counter++;
    }

    public boolean inList (E element){
          for (Object item: this) {
              if (item == element) {
                  return true;
              }
          }
          return false;
        }

     @Override
    public Iterator<E> iterator() {
        return new ListIterator(listCell);
    }

    private class ListCell<E>{
        private E element;
        private ListCell<E> next = null;
        ListCell(){}

        ListCell (E element) {set(element);}

        void set (E element) {this.element = element;}

        void add (E element){
            if (isNext()){
                next.add(element);
            }else {
                next = new ListCell<>(element);
            }
        }


        E get() {return element;}

        boolean isNext() {return next != null;}

    }

    private class ListIterator implements Iterator<E>{

        private ListCell<E> current;

        private  boolean isFirst = true;

        public ListIterator(ListCell<E> listCell) {
            current = listCell;
        }

        @Override
        public boolean hasNext() {
            if (counter == 1 && isFirst) return true;
            return current.isNext();
                   }

        @Override
        public E next() {
            if (isFirst)isFirst = false;
            else current = current.next;
            return current.get();
        }
    }



}
