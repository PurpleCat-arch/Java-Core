# 06 - Exceptions
Contains Java Exception handling programs covering try-catch, throw/throws, custom exceptions, checked vs unchecked exceptions, and advanced patterns like chaining and suppressed exceptions.

## 📝 Programs List

1. **[TryCatchBasic.java](./TryCatchBasic.java)** - Demonstrates a basic try-catch block handling ArithmeticException.
2. **[MultipleCatchBlocks.java](./MultipleCatchBlocks.java)** - Shows multiple catch blocks handling different exception types in order.
3. **[TryCatchFinally.java](./TryCatchFinally.java)** - Demonstrates try-catch-finally behavior with and without exceptions.
4. **[FinallyBlockDemo.java](./FinallyBlockDemo.java)** - Shows that finally block executes even when try has a return statement.
5. **[ArithmeticExceptionDemo.java](./ArithmeticExceptionDemo.java)** - Demonstrates ArithmeticException with division by zero in a loop.
6. **[ArrayIndexOutOfBoundsDemo.java](./ArrayIndexOutOfBoundsDemo.java)** - Shows ArrayIndexOutOfBoundsException with invalid array indices.
7. **[NullPointerExceptionDemo.java](./NullPointerExceptionDemo.java)** - Demonstrates NullPointerException when calling methods on null references.
8. **[NumberFormatExceptionDemo.java](./NumberFormatExceptionDemo.java)** - Shows NumberFormatException when parsing invalid strings to integers.
9. **[StringIndexOutOfBoundsDemo.java](./StringIndexOutOfBoundsDemo.java)** - Demonstrates StringIndexOutOfBoundsException with charAt and substring.
10. **[ClassCastExceptionDemo.java](./ClassCastExceptionDemo.java)** - Shows ClassCastException with invalid casting and instanceof safety check.
11. **[NegativeArraySizeDemo.java](./NegativeArraySizeDemo.java)** - Demonstrates NegativeArraySizeException when creating arrays with negative sizes.
12. **[StackOverflowErrorDemo.java](./StackOverflowErrorDemo.java)** - Shows StackOverflowError from infinite recursion without a base case.
13. **[ThrowKeywordDemo.java](./ThrowKeywordDemo.java)** - Demonstrates using the throw keyword to explicitly throw exceptions.
14. **[ThrowsKeywordDemo.java](./ThrowsKeywordDemo.java)** - Shows using the throws keyword to declare exceptions in method signatures.
15. **[CustomExceptionBasic.java](./CustomExceptionBasic.java)** - Demonstrates creating a custom exception class for a banking scenario.
16. **[CustomCheckedException.java](./CustomCheckedException.java)** - Shows creating a custom checked exception for email validation.
17. **[CustomUncheckedException.java](./CustomUncheckedException.java)** - Demonstrates a custom unchecked exception extending RuntimeException.
18. **[CheckedVsUnchecked.java](./CheckedVsUnchecked.java)** - Illustrates the difference between checked and unchecked exceptions with hierarchy.
19. **[NestedTryCatch.java](./NestedTryCatch.java)** - Shows nested try-catch blocks with independent inner exception handlers.
20. **[TryWithResources.java](./TryWithResources.java)** - Demonstrates try-with-resources for auto-closing resources (AutoCloseable).
21. **[MultiCatchBlock.java](./MultiCatchBlock.java)** - Shows multi-catch using the pipe operator to handle multiple exception types (Java 7+).
22. **[ExceptionPropagation.java](./ExceptionPropagation.java)** - Demonstrates exception propagation through the method call stack.
23. **[RethrowException.java](./RethrowException.java)** - Shows catching, logging, and rethrowing exceptions with additional context.
24. **[ChainedException.java](./ChainedException.java)** - Demonstrates exception chaining using getCause() to trace root cause.
25. **[FileNotFoundExceptionDemo.java](./FileNotFoundExceptionDemo.java)** - Shows FileNotFoundException when reading non-existent files.
26. **[IOExceptionDemo.java](./IOExceptionDemo.java)** - Demonstrates IOException handling for file read/write operations.
27. **[ExceptionInMethodOverriding.java](./ExceptionInMethodOverriding.java)** - Shows exception rules in method overriding (same, narrower, broader constraints).
28. **[FinallyVsReturn.java](./FinallyVsReturn.java)** - Demonstrates how finally block interacts with return statements.
29. **[ExceptionWithInheritance.java](./ExceptionWithInheritance.java)** - Shows exception hierarchy and inheritance with custom exception classes.
30. **[AssertionDemo.java](./AssertionDemo.java)** - Demonstrates using the assert keyword for debugging and validation.
31. **[IllegalArgumentExceptionDemo.java](./IllegalArgumentExceptionDemo.java)** - Shows IllegalArgumentException for invalid method parameter validation.
32. **[IllegalStateExceptionDemo.java](./IllegalStateExceptionDemo.java)** - Demonstrates IllegalStateException for operations called in wrong lifecycle state.
33. **[UnsupportedOperationDemo.java](./UnsupportedOperationDemo.java)** - Shows UnsupportedOperationException with fixed-size and unmodifiable collections.
34. **[ConcurrentModificationDemo.java](./ConcurrentModificationDemo.java)** - Demonstrates ConcurrentModificationException and safe removal using Iterator.
35. **[SuppressedExceptionDemo.java](./SuppressedExceptionDemo.java)** - Shows suppressed exceptions in try-with-resources when both work and close fail.
