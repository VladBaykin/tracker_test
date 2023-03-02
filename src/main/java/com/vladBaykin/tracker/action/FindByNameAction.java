package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.Item;
import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.output.Output;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] names = tracker.findByName(name);
        if (names.length > 0) {
            for (Item items : names) {
                out.println(items);
            }
        } else {
            out.println("Name not found");
        }
        return true;
    }
}
