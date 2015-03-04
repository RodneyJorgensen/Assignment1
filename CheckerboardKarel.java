/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run () {
		checker();
	}
	
	private void checker() {
		while (frontIsClear()) {
		oddChecker();
		evenChecker();
		}
	}
	private void oddChecker() {
		while (frontIsClear()) {
		putBeeper();
		move();
		if (frontIsClear()){
		move();
		putBeeper();
		}
		}
		if (frontIsBlocked()) {
			turnLeft();
			if (frontIsClear()) {
			move();
			turnLeft();
		}
		}
	}
	private void evenChecker() {
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsClear()){
			move();
			putBeeper();
			}
			}
			if (frontIsBlocked()) {
				turnRight();
				if (frontIsClear()){
				move();
				turnRight();
				}
			}
		}	
}
