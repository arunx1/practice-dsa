package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.ArrayStack;
import com.github.arungahlawat.learning.dataStructures.DynamicArrayStack;
import org.testng.annotations.Test;

public class DynamicArrayStackTests {
    @Test(description = "Verify creating array stack")
    void verifyCreatingArrayStack() {
        DynamicArrayStack dynamicArrayStack = new DynamicArrayStack();
        dynamicArrayStack.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dynamicArrayStack.push(11);
        dynamicArrayStack.pop();
        dynamicArrayStack.push(11);
        dynamicArrayStack.pop();
        dynamicArrayStack.push(12);
        dynamicArrayStack.pop();
        dynamicArrayStack.push(13);
        dynamicArrayStack.pop();
        dynamicArrayStack.push(14);
        dynamicArrayStack.push(15);
        dynamicArrayStack.push(16);
        dynamicArrayStack.push(17);
        dynamicArrayStack.push(18);
        dynamicArrayStack.push(19);
        dynamicArrayStack.push(20);
        dynamicArrayStack.push(21);
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
        dynamicArrayStack.pop();
    }
}
