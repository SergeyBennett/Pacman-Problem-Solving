
public interface Solver {
	
	public State getCurrentState();
	public State getStartState();
	public void move(State state);
	public boolean isGoal();
	public double getPathCost();
	
}
