package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.ArrayStack;
import org.testng.annotations.Test;

public class ArrayStackTests {
    @Test(description = "Verify creating array stack")
    void verifyCreatingArrayStack() {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        arrayStack.push(11);
        arrayStack.pop();
        arrayStack.push(11);
        arrayStack.pop();
        arrayStack.push(12);
        arrayStack.pop();
        arrayStack.push(13);
        arrayStack.pop();
        arrayStack.push(14);
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
    }
}
