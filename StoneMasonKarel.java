/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here repairs each column.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		repairColumn();
	}
	
	private void repairColumn() {
		turnLeft();
		ascendColumn();
		turnAround();
		descendColumn();
		turnLeft();
		if (frontIsClear()) {
			moveToNextColumn();
			repairColumn();
		}
	}
	private void ascendColumn() {
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}	
			if (noBeepersPresent()) {
				putBeeper();
			}
	}
	private void descendColumn() {
		while (frontIsClear()) {
			move();
		}
	}
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
	
	
}
	


