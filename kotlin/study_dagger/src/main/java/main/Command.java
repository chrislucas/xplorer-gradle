package main;

import dagger.Component;

@Component
public interface Command {
    public void execute();
}
