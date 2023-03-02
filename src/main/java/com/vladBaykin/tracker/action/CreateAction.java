package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.Item;
import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.output.Output;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create new Item ===");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.add(item);
        out.println("Item is: " + item);
        return true;
    }
}
