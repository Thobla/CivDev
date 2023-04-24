package Humans;

public abstract class HumanBaseState {
	
	/**
	 * code to run when we enter this state
	 * @param inator
	 */
	abstract public void enterState(HumanStateInator inator);

	/**
	 * Method to be run each time we update the game-loop
	 * @param inator
	 */
    abstract public void updateState(HumanStateInator inator);

    /**
     * method to be run when we are about to exit this state
     * @param inator
     */
    abstract public void exitState(HumanStateInator inator);
}
