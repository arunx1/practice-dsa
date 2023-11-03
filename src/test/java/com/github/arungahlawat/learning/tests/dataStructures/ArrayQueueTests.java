package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.ArrayQueue;
import org.testng.annotations.Test;

public class ArrayQueueTests {
    @Test(description = "Verify creating array queue")
    void verifyCreatingArrayQueue() {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.enQueue(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        arrayQueue.enQueue(11);
        arrayQueue.deQueue();
        arrayQueue.enQueue(11);
        arrayQueue.deQueue();
        arrayQueue.enQueue(12);
        arrayQueue.deQueue();
        arrayQueue.enQueue(13);
        arrayQueue.deQueue();
        arrayQueue.enQueue(14);
    }
}
