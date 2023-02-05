package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String res = "";
        Customer happyCustomer = null;
        for (int i = 0; i < count; i++) {
            happyCustomer = queue.poll();
        }
        if (happyCustomer != null) {
            res = happyCustomer.name();
        }
        return res;
    }

    public String getFirstUpsetCustomer() {
        String res = "";
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        Customer customer = queue.peek();
        if (customer != null) {
            res = customer.name();
        }
        return res;
    }
}
