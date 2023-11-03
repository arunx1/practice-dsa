package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.DynamicArrayQueue;
import org.testng.annotations.Test;

public class DynamicArrayQueueTests {
    @Test(description = "Verify creating dynamic array queue")
    void verifyCreatingArrayQueue() {
        DynamicArrayQueue dynamicArrayQueue = new DynamicArrayQueue();
        dynamicArrayQueue.enQueue(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dynamicArrayQueue.enQueue(11);
        dynamicArrayQueue.enQueue(12);
        dynamicArrayQueue.enQueue(13);
        dynamicArrayQueue.enQueue(14);
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.enQueue(15);
        dynamicArrayQueue.enQueue(16);
        dynamicArrayQueue.enQueue(17);
        dynamicArrayQueue.enQueue(18);
        dynamicArrayQueue.enQueue(19);
        dynamicArrayQueue.enQueue(20);
        dynamicArrayQueue.enQueue(21);
        dynamicArrayQueue.enQueue(22);
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
        dynamicArrayQueue.deQueue();
    }
}
