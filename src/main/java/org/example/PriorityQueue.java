package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue<T extends Comparable<T>> implements QueueInterface<T> { // with Comparable implementation
    private Queue<T> queue = new LinkedList<>();

    @Override
    public void enqueue(T element) {
        queue.add(element);
        LinkedList<T> list = (LinkedList<T>) queue;
        list.sort(null); // Sorts the queue based on natural ordering of elements
    }

    @Override
    public T dequeue() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
