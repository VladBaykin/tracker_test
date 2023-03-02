package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.output.Output;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item was deleted");
        } else {
            out.println("id not found");
        }
        return true;
    }
}
