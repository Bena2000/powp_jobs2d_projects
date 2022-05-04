package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * DriverCommand interface.
 */
public interface DriverCommand extends Cloneable {

	/**
	 * Execute command on driver.
	 * 
	 * @param driver driver.
	 */
	public void execute(Job2dDriver job2dDriver);

	public default Object clone() throws CloneNotSupportedException {
		return this.clone();
	}
}
