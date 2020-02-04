package connectr;



class Node {

	public double g_scores;
	public Node parent;
	public String name;
	public String actionName;
	public State state;

	public Node(String nameA, State newState, Node parentNode, int cost, String actName) {

		name = nameA;
		actionName = actName;
		state = newState;
		parent = parentNode;
		g_scores = cost;
	}

	public String getNodeName() {
		return name;
	}

}
