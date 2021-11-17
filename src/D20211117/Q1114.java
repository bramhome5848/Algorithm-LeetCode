package D20211117;

/**
 * 1114. Print in Order
 */
public class Q1114 {
}

class Foo {

    public volatile boolean usedFirst;
    public volatile boolean usedSecond;

    public Foo() {
        this.usedFirst = false;
        this.usedSecond = false;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        usedFirst = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!usedFirst) Thread.onSpinWait();
        printSecond.run();
        usedSecond = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!usedSecond) Thread.onSpinWait();
        printThird.run();
    }
}
