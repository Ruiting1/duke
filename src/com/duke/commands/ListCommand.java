package com.duke.commands;

public class ListCommand extends Command {

    public static final String COMMAND_WORD="list";

    @Override
    public void execute(){
        for (int i = 1; i <= taskList.getSize(); i++) {
            System.out.println(i + ". " + taskList.getTaskByIdx(i).toString());
        }
    }
}
