package view.commands;

import view.ConsoleUI;

public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI,"������������� �������� ������ �� ��������");
    }

    public void execute(){
        consoleUI.sortByAge();
    }
}
