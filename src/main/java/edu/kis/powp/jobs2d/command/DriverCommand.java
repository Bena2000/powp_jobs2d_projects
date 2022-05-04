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
	void execute(Job2dDriver job2dDriver);

	default DriverCommand driverCommandClone() throws CloneNotSupportedException {
		return this.driverCommandClone();
	}
}
