package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.Item;
import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.output.Output;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== All items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Tracker is empty!");
        }
        return true;
    }
}
