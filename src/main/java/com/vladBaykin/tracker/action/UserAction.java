package com.vladBaykin.tracker.action;

import com.vladBaykin.tracker.input.Input;
import com.vladBaykin.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
