package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.visitor.IDriverCommandsVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexCommand implements ICompoundCommand {

	private final List<DriverCommand> commands;

	public ComplexCommand() {
		this.commands = new ArrayList<>();
	}

	public ComplexCommand(List<DriverCommand> commandList) {
		this.commands = commandList;
	}

	public void appendCommand(DriverCommand command) {
		this.commands.add(command);
	}

	@Override
	public void execute(Job2dDriver job2dDriver) {
		for (DriverCommand command : commands) {
			command.execute(job2dDriver);
		}
	}

	@Override
	public void accept(IDriverCommandsVisitor visitor) {
		visitor.doForCompoundCommand(this);
	}

	@Override
	public Iterator<DriverCommand> iterator() {
		return commands.iterator();
	}
}
