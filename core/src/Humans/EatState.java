package Humans;

public class EatState extends HumanBaseState{

	@Override
	public void enterState(HumanStateInator inator) {
		
	}

	@Override
	public void updateState(HumanStateInator inator) {
		if (inator.getHuman().eat()) {
			//inator.changeState(inator.statePriority);
		}
		
	}

	@Override
	public void exitState(HumanStateInator inator) {
		
	}

}
