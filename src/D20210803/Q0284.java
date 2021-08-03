package D20210803;

import java.util.Iterator;

/**
 * 284. Peeking Iterator
 */
public class Q0284 {
}

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextVal;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if(hasNext()) nextVal = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextVal;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer value = nextVal;
        if(iterator.hasNext()) nextVal = iterator.next();
        else nextVal = null;
        return value;
    }

    @Override
    public boolean hasNext() {
        return (nextVal != null || iterator.hasNext());
    }
}