package connectr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

	static int count;
	static int count2;

	private static String[] strut1Location = { "out", "Insert 0c 5c 3c 0ang 7 6", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Rad2 4c 5c 8c 5c 8c 0ang 90ang" };
	private static String[] strut2Location = { "out", "Insert 0c 5c 3c 0ang 6 5", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 6c 9c 0ang 90ang", "Walk_backwards 8c 6c 8c 5c 5c 90ang",
			"Swing 8c 5c 8c 4c 1c 90ang 270ang" };
	private static String[] strut3Location = { "out", "Insert 0c 5c 3c 0ang 5 4", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 6c 9c 0ang 90ang", "Walk_backwards 8c 6c 8c 5c 5c 90ang",
			"Rad2 8c 5c 8c 9c 5c 90ang 180ang" };
	private static String[] strut4Location = { "out", "Insert 0c 5c 3c 0ang 4 3", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 4c 1c 0ang 270ang", "Rad2 8c 4c 8c 0c 11c 270ang 0ang" };
	private static String[] strut5Location = { "out", "Insert 0c 5c 3c 0ang 3 2", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 4c 1c 0ang 270ang", "Radx 8c 4c 9c 0c 12c 270ang 0ang", "Walk_backwards 9c 0c 8c 0c 8c 0ang",
			"Rad2 8c 0c 12c 0c 3c 0ang 90ang" };
	private static String[] strut6Location = { "out", "Insert 0c 5c 3c 0ang 2 1", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 6c 9c 0ang 90ang", "Walk_backwards 8c 6c 8c 5c 5c 90ang", "Radx 8c 5c 7c 9c 4c 90ang 180ang",
			"Walk_backwards 7c 9c 8c 9c 8c 180ang", "Rad2 8c 9c 4c 9c 6c 180ang 270ang" };
	private static String[] strut7Location = { "out", "Insert 0c 5c 3c 0ang 1 0", "Walk_forward 0c 5c 4c 5c 4c 7c 0ang",
			"Radx 4c 5c 8c 4c 1c 0ang 270ang", "Radx 8c 4c 9c 0c 12c 270ang 0ang", "Walk_backwards 9c 0c 8c 0c 8c 0ang",
			"Radx 8c 0c 12c 1c 4c 0ang 90ang", "Walk_backwards 12c 1c 12c 0c 0c 90ang",
			"Rad2 12c 0c 12c 4c 9c 90ang 180ang" };

	// actions with effects
	static Action insertStrut1 = new Action("Insert Strut1", strut1Location[1], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkFStrut1 = new Action("Walk_forward Strut1", strut1Location[2], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action rad2Strut1 = new Action("Rad2 Strut1", strut1Location[3], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action insertStrut2 = new Action("Insert Strut2", strut1Location[0], strut2Location[1], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkFStrut2 = new Action("Walk_forward Strut2", strut1Location[0], strut2Location[2],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action radxStrut2 = new Action("Radx Strut2", strut1Location[0], strut2Location[3], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action insertStrut3 = new Action("Insert Strut3", strut1Location[0], strut2Location[0], strut3Location[1],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkFStrut3 = new Action("Walk_forward Strut3", strut1Location[0], strut2Location[0],
			strut3Location[2], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkBStrut2 = new Action("Walk_backwards Strut2", strut1Location[0], strut2Location[4],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action swingStrut2 = new Action("Swing Strut2", strut1Location[0], strut2Location[5], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action radxStrut3 = new Action("RadxStrut3", strut1Location[0], strut2Location[0], strut3Location[3],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action insertStrut4 = new Action("Insert Strut4", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[1], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkFStrut4 = new Action("Walk_forwards Strut4", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[2], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action radxStrut4 = new Action("Radx Strut4", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[3], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action insertStrut5 = new Action("Insert Strut5", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[1], strut6Location[0], strut7Location[0],1, 0);

	static Action walkFStrut5 = new Action("Walk_forwards Strut5", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[2], strut6Location[0], strut7Location[0], 1, 0);

	static Action rad2Strut4 = new Action("Rad2 Strut4", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[4], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action radxStrut5 = new Action("Radx Strut5", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[3], strut6Location[0], strut7Location[0], 1, 0);

	static Action insertStrut6 = new Action("Insert Strut6", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[1], strut7Location[0],1, 0);

	static Action walkFStrut6 = new Action("Walk_forwards Strut6", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[2], strut7Location[0], 1, 0);

	static Action radx2Strut5 = new Action("Radx(2) Strut5", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[4], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkBStrut5 = new Action("Walk_backwards Strut5", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[5], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkBStrut3 = new Action("Walk_backwards Strut3", strut1Location[0], strut2Location[0],
			strut3Location[4], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action rad2Strut3 = new Action("Rad2 Strut3", strut1Location[0], strut2Location[0], strut3Location[5],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[0], 1, 0);

	static Action radxStrut6 = new Action("Radx Strut6", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[3], strut7Location[0], 1, 0);

	static Action walkBStrut6 = new Action("Walk_backwards Strut6", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[4], strut7Location[0],1, 0);

	static Action radx2Strut6 = new Action("Radx (2) Strut6", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[5], strut7Location[0],1, 0);

	static Action rad2Strut5 = new Action("Rad2 Strut5", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[6], strut6Location[0], strut7Location[0], 1, 0);

	static Action walkB2Strut6 = new Action("Walk_backwards (2) Strut6", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[6], strut7Location[0], 1, 0);

	static Action rad2Strut6 = new Action("Rad2 Strut6", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[7], strut7Location[0], 1, 0);

	static Action insertStrut7 = new Action("Insert Strut7", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[1], 1, 0);

	static Action walkFStrut7 = new Action("Walk_forwards Strut7", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[2], 1, 0);

	static Action radxStrut7 = new Action("Radx Strut7", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[3], 1, 0);

	static Action radx2Strut7 = new Action("Radx (2) Strut7", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[4], 1, 0);

	static Action walkBStrut7 = new Action("Walk_backwards Strut7", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[5], 1, 0);

	static Action radx3Strut7 = new Action("Radx (3) Strut7", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[6], 1, 0);

	static Action walkB2Strut7 = new Action("Walk_backwards (2) Strut7", strut1Location[0], strut2Location[0],
			strut3Location[0], strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[7], 1, 0);

	static Action rad2Strut7 = new Action("Rad2 Strut7", strut1Location[0], strut2Location[0], strut3Location[0],
			strut4Location[0], strut5Location[0], strut6Location[0], strut7Location[8], 1, 0);

	static Action[] acts = { insertStrut1, walkFStrut1, rad2Strut1, insertStrut2, walkFStrut2, radxStrut2, insertStrut3,
			walkFStrut3, walkBStrut2, swingStrut2, radxStrut3, insertStrut4, walkFStrut4, radxStrut4, insertStrut5,
			walkFStrut5, rad2Strut4, radxStrut5, insertStrut6, walkFStrut6, radx2Strut5, walkBStrut5, walkBStrut3,
			rad2Strut3, radxStrut6, walkBStrut6, radx2Strut6, rad2Strut5, walkB2Strut6, rad2Strut6, insertStrut7,
			walkFStrut7, radxStrut7, radx2Strut7, walkBStrut7, radx3Strut7, walkB2Strut7, rad2Strut7 };

	public static State state = new State(0, strut1Location[0], strut2Location[0], strut3Location[0], strut4Location[0],
			strut5Location[0], strut6Location[0], strut7Location[0]);


	public static State goal = new State(0, strut1Location[3], strut2Location[5], strut3Location[5], strut4Location[4],
			strut5Location[6], strut6Location[7], strut7Location[8]);

	private static Node node;
	private static Node startNode = new Node("StartNode", state, node, 0, "");
	private static Node nodeStatus;

	static int n;
	static int h;
	static int totalCost;

	public static void main(String args[]) throws InterruptedException {

		long start = System.currentTimeMillis();

		State newState = new State(0, strut1Location[0], strut2Location[0], strut3Location[0], strut4Location[0],
				strut5Location[0], strut6Location[0], strut7Location[0]);

		nodeStatus = startNode;

		int[] hValue = { insertStrut1.getHCost(), walkFStrut1.getHCost(), rad2Strut1.getHCost(),
				insertStrut2.getHCost(), walkFStrut2.getHCost(), radxStrut2.getHCost(), insertStrut3.getHCost(),
				walkFStrut3.getHCost(), walkBStrut2.getHCost(), swingStrut2.getHCost(), radxStrut3.getHCost(),
				insertStrut4.getHCost(), walkFStrut4.getHCost(), radxStrut4.getHCost(), insertStrut5.getHCost(),
				walkFStrut5.getHCost(), rad2Strut4.getHCost(), radxStrut5.getHCost(), insertStrut6.getHCost(),
				walkFStrut6.getHCost(), radx2Strut5.getHCost(), walkBStrut5.getHCost(), walkBStrut3.getHCost(),
				rad2Strut3.getHCost(), radxStrut6.getHCost(), walkBStrut6.getHCost(), radx2Strut6.getHCost(),
				rad2Strut5.getHCost(), walkB2Strut6.getHCost(), rad2Strut6.getHCost(), insertStrut7.getHCost(),
				walkFStrut7.getHCost(), radxStrut7.getHCost(), radx2Strut7.getHCost(), walkBStrut7.getHCost(),
				radx3Strut7.getHCost(), walkB2Strut7.getHCost(), rad2Strut7.getHCost() };

		if (nodeStatus == startNode) {

			/*System.out.println("Old state parameters are " + "strut1Location: " + state.getStateParameter1()
					+ " strut2Location: " + state.getStateParameter2() + " strut3Location: "
					+ state.getStateParameter3() + " strut4Location: " + state.getStateParameter4()
					+ " strut5Location: " + state.getStateParameter5() + " strut6Location: "
					+ state.getStateParameter6() + " strut7Location: " + state.getStateParameter7() + "\n");*/

			ArrayList<Action> queue = new ArrayList<Action>();

			do {
				
				TimeUnit.SECONDS.sleep(0);
				//System.out.println("loop: " + count);
				

				for (int i = 0; i < acts.length; i++) {

					

					h = Math.abs((state.getStateParameter1Position() - goal.getGoalParameter1Position())
							+ state.getStateParameter2Position() - goal.getGoalParameter2Position()
							+ state.getStateParameter3Position() - goal.getGoalParameter3Position()
							+ state.getStateParameter4Position() - goal.getGoalParameter4Position()
							+ state.getStateParameter5Position() - goal.getGoalParameter5Position()
							+ state.getStateParameter6Position() - goal.getGoalParameter6Position()
							+ state.getStateParameter7Position() - goal.getGoalParameter7Position());

					acts[i].setHCost(h);

					if (acts[i].insertStrut1Precondition() == true) {

						//System.out.println("Precondition insertStrut1 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut1Precondition() == true) {

						//System.out.println("Precondition satysfied walkFStrut1" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].rad2Strut1Precondition() == true) {

						//System.out.println("Precondition rad2Strut1 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut2Precondition() == true) {

						//System.out.println("Precondition insertStrut2 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut2Precondition() == true) {

						//System.out.println("Precondition walkFStrut2 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut2Precondition() == true) {

						//System.out.println("Precondition radxStrut2 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut3Precondition() == true) {

						//System.out.println("Precondition insertStrut3 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut3Precondition() == true) {

						//System.out.println("Precondition walkFStrut3 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkBStrut2Precondition() == true) {
						//System.out.println("Precondition walkBStrut2 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].swingStrut2Precondition() == true) {

						//System.out.println("Precondition swingStrut2 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut3Precondition() == true) {

						//System.out.println("Precondition radxStrut3 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut4Precondition() == true) {

						//System.out.println("Precondition insertStrut4 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut4Precondition() == true) {

						//System.out.println("Precondition walkFStrut4 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut4Precondition() == true) {

						//System.out.println("Precondition radxStrut4 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut5Precondition() == true) {

						//System.out.println("Precondition insertStrut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut5Precondition() == true) {

						//System.out.println("Precondition walkFStrut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);
					}

					if (acts[i].rad2Strut4Precondition() == true) {

						//System.out.println("Precondition rad2Strut4 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut5Precondition() == true) {

						//System.out.println("Precondition radxStrut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut6Precondition() == true) {

						//System.out.println("Precondition insertStrut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut6Precondition() == true) {

						//System.out.println("Precondition walkFStrut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radx2Strut5Precondition() == true) {

						//System.out.println("Precondition radx2Strut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkBStrut5Precondition() == true) {

						//System.out.println("Precondition walkBStrut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkBStrut3Precondition() == true) {

						//System.out.println("Precondition walkBStrut3 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].rad2Strut3Precondition() == true) {

						//System.out.println("Precondition rad2Strut3 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut6Precondition() == true) {

						//System.out.println("Precondition radxStrut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkBStrut6Precondition() == true) {

						//System.out.println("Precondition walkBStrut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radx2Strut6Precondition() == true) {

						//System.out.println("Precondition radx2Strut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].rad2Strut5Precondition() == true) {

						//System.out.println("Precondition rad2Strut5 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkB2Strut6Precondition() == true) {

						//System.out.println("Precondition walkB2Strut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].rad2Strut6Precondition() == true) {

						//System.out.println("Precondition rad2Strut6 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].insertStrut7Precondition() == true) {

						//System.out.println("Precondition insertStrut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkFStrut7Precondition() == true) {

						//System.out.println("Precondition walkFStrut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radxStrut7Precondition() == true) {

						//System.out.println("Precondition radxStrut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radx2Strut7Precondition() == true) {

						//System.out.println("Precondition radx2Strut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkBStrut7Precondition() == true) {

						//System.out.println("Precondition walkBStrut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].radx3Strut7Precondition() == true) {

						//System.out.println("Precondition radx3Strut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].walkB2Strut7Precondition() == true) {

						//System.out.println("Precondition walkB2Strut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

					if (acts[i].rad2Strut7Precondition() == true) {

						//System.out.println("Precondition rad2Strut7 satysfied" + " with action name: " + acts[i].name);

						queue.add(acts[i]);

					}

				}

			//	System.out.println("QUEUE " + queue.toString());

				Action[] acts2 = queue.toArray(new Action[queue.size()]);

				//System.out.println("ACTS2 " + Arrays.toString(acts2));

				queue.clear();

				ArrayList<Integer> f = new ArrayList<Integer>();

				for (int i = 0; i < acts2.length; i++) {

				

					f.add(totalCost + acts2[i].getActionCost() + acts2[i].getHCost());

				} 

				

				int minValue = Collections.min(f);
				

				for (int i = 0; i < acts2.length; i++) {

					

					if ((acts2[i].getActionCost() + acts2[i].getHCost() + totalCost) == minValue) {

						//System.out.println("COST CHECK PASSED");

						//System.out.println(" F: " + (acts[i].getActionCost() + acts[i].getHCost() + totalCost) + "MIN: "+ minValue);

						if (acts2[i].getActParameter1Position() > state.getStateParameter1Position()) {
							newState.setStateParameter1(acts2[i].getActParameter1());
						}

						if (acts2[i].getActParameter2Position() > state.getStateParameter2Position()) {
							newState.setStateParameter2(acts2[i].getActParameter2());
						}

						if (acts2[i].getActParameter3Position() > state.getStateParameter3Position()) {
							newState.setStateParameter3(acts2[i].getActParameter3());
						}

						if (acts2[i].getActParameter4Position() > state.getStateParameter4Position()) {
							newState.setStateParameter4(acts2[i].getActParameter4());
						}

						if (acts2[i].getActParameter5Position() > state.getStateParameter5Position()) {
							newState.setStateParameter5(acts2[i].getActParameter5());
						}

						if (acts2[i].getActParameter6Position() > state.getStateParameter6Position()) {
							newState.setStateParameter6(acts2[i].getActParameter6());
						}

						if (acts2[i].getActParameter7Position() > state.getStateParameter7Position()) {
							newState.setStateParameter7(acts2[i].getActParameter7());
						}

						n = n + 1;
						Node child = new Node("Node " + n, newState, startNode, acts2[i].getActionCost(),
								acts2[i].name);

						nodeStatus = child;
						state = newState;
						totalCost = totalCost + acts2[i].getActionCost();

						hValue[i] = hValue[i] - 100;
						// costs2.set(i, 1000);

						System.out.println("The node number: " + (n) + " is created with the action: " + acts2[i].name);
						//System.out.println("The cost is " + acts2[i].actionCost + ", The euristic value is "
								//+ acts2[i].getHCost()+ ". The f total value is: " + (acts2[i].actionCost+ acts2[i].getHCost()));
						System.out.println("State parameters updated are " + "strut1Location: "
								+ state.getStateParameter1() + " strut2Location: " + state.getStateParameter2()
								+ " strut3Location: " + state.getStateParameter3() + " strut4Location: "
								+ state.getStateParameter4() + " strut5Location: " + state.getStateParameter5()
								+ " strut6Location: " + state.getStateParameter6() + " strut7Location: "
								+ state.getStateParameter7() + "\n");

						System.out.println("Total cost: " + totalCost);
						//System.out.println("f = g(cumulated)+h = " + (totalCost + acts2[i].getActionCost() + acts2[i].getHCost()));
						System.out.println("\n");
						acts2[i].setActCost(100);

						int j = (acts2.length - 1);
						

						if (i == j) {
							acts2 = new Action[acts2.length];
						}

						//System.out.println("ACTS " + Arrays.deepToString(acts));
						//System.out.println("Acts2 " + Arrays.asList(acts2));
						//System.out.println("Queue " + queue.toString() + "\n");

					}

				}
				//System.out.println("ARRIVA QUI222?");

				
				/*
				 * for (int i = 0; i < acts.length; i++) {
				 * 
				 * if ((acts[i].getActionCost() + acts[i].getHCost()+ totalCost) ==
				 * (minValue+120)) {
				 * 
				 * 
				 * ArrayList<Action> del = new ArrayList<Action>(Arrays.asList(acts));
				 * del.remove(acts[i]); acts = del.toArray(new Action[del.size()]);
				 * System.out.println("RIMUOVE");
				 * 
				 * 
				 * }
				 * 
				 * }
				 */

			} while (!state.equals(goal));

		}

		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F;
		System.out.println(sec + " seconds");

	}

}
