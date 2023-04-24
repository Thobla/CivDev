package Humans;

/**
 * This class keeps track of the humans states. It is used to change it from one state
 * to another and keeps references to all the different states.
 * @author thorg
 *
 */
public class HumanStateInator {
	public GatherState gatherState = new GatherState();
	public FornicationState fornState = new FornicationState();
	public SleepState sleepState = new SleepState();
	public BuildState buildState = new BuildState();
	public PregnantState pregState = new PregnantState();
	public HumanBaseState currentState;
	private Human human;
	
	HumanStateInator(Human human){
		this.human = human;
	}
	
	/**
	 * method to be run when first initialised
	 * @param human
	 */
	public void onStart(Human human) {
		currentState = sleepState;
		this.human = human;
	}
	
	/**
	 * Method used so that we can change the state to the given state
	 * @param state
	 */
	public void changeState(HumanBaseState state) {
		currentState.exitState(this);
		currentState = state;
		currentState.enterState(this);
	}
	
	/**
	 * method to run each update
	 */
	public void updateState() {
		currentState.updateState(this);
	}
	
	
	public Human getHuman() {
		return human;
	}
	
	
	
	
	
}
