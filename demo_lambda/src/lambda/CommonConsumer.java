package demo_lambda.src.lambda;

public interface CommonConsumer<T> extends SuperConsumer<T, T, T> { // functional interface extends can narrow down
                                                                   // the types - T, U, V to T, T, T
  // void accept(T t1, T t2, T t3);
}
