package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.Tracker;
import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.output.Output;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
