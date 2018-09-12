package concurrent.chaptertwelve;

import java.util.concurrent.Semaphore;

public class BoundedBuffer<E> {
    private final Semaphore semaphoreItem, semaphoreSpace;
    private final E[] items;
    private int putPosition = 0, takePosition = 0;

    public BoundedBuffer(int capacity) {
        semaphoreItem = new Semaphore(0);
        semaphoreSpace = new Semaphore(capacity);
        items = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return semaphoreItem.availablePermits() == 0;
    }

    public boolean isFull() {
        return semaphoreSpace.availablePermits() == 0;
    }

    public void put(E x) throws InterruptedException {
        semaphoreSpace.acquire();
        doInsert(x);
        semaphoreItem.release();
    }

    public E take() throws InterruptedException {
        semaphoreItem.acquire();
        E e = doExtract();
        semaphoreSpace.release();
        return e;
    }

    private synchronized void doInsert(E x) {
        int i = putPosition;
        items[i] = x;
        putPosition = (++i == items.length) ? 0 : i;
    }

    private synchronized E doExtract() {
        int i = takePosition;
        E x = items[i];
        items[i] = null;
        takePosition = (++i == items.length) ? 0 : i;
        return x;
    }
}
