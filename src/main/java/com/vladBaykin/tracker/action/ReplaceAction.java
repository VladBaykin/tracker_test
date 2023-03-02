package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.Item;
import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.output.Output;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item was replaced");
        } else {
            out.println("Id not found");
        }
        return true;
    }
}
