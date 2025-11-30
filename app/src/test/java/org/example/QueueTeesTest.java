package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTeesTest {
    QueueTees queueTees;
    @BeforeEach
    public void setUp() {
        queueTees = new QueueTees();
    }
    @Test
    public void enqueueTest() {
        Puppy puppy = new Puppy();
        assertEquals(queueTees.enqueue(puppy), true);
    }
    @Test
    public void dequeueTest() {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();
        queueTees.enqueue(puppy);
        queueTees.enqueue(kitty);
        queueTees.enqueue(marmoset);

        assertEquals(queueTees.dequeue(), puppy);
        assertEquals(queueTees.dequeue(), kitty);
    }
    @Test
    public void isEmptyTest() {
        assertEquals(queueTees.isEmpty(), true);
        assertEquals(queueTees.dequeue(), null);
    }
    @Test
    public void isFullTest() {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        queueTees.enqueue(puppy);
        queueTees.enqueue(kitty);
        queueTees.enqueue(marmoset);
        queueTees.enqueue(kitty);
        assertEquals(queueTees.enqueue(puppy), false);
        assertEquals(queueTees.isFull(), true);
    }
    @Test
    public void testSize() {
        assertEquals(queueTees.isFull(), false);
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        queueTees.enqueue(puppy);
        queueTees.enqueue(kitty);
        queueTees.enqueue(marmoset);
        queueTees.enqueue(kitty);
        assertEquals(queueTees.size(), 4);
        assertEquals(queueTees.isFull(), true);
    }
    @Test
    public void clearTest() {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        queueTees.enqueue(puppy);
        queueTees.enqueue(kitty);
        queueTees.enqueue(marmoset);
        queueTees.enqueue(kitty);

        queueTees.clear();
        assertEquals(queueTees.size(), 0);
    }
}
