package connectr;

public class Action {

	int actionCost;
	int hCost;
	String actParameter1;
	String actParameter2;
	String actParameter3;
	String actParameter4;
	String actParameter5;
	String actParameter6;
	String actParameter7;
	String name;

	static int arrayPosition;

	public Action(String name1, String strut1Loc, String strut2Loc, String strut3Loc, String strut4Loc,
			String strut5Loc, String strut6Loc, String strut7Loc, int cost, int h) {

		actParameter1 = strut1Loc;
		actParameter2 = strut2Loc;
		actParameter3 = strut3Loc;
		actParameter4 = strut4Loc;
		actParameter5 = strut5Loc;
		actParameter6 = strut6Loc;
		actParameter7 = strut7Loc;

		actionCost = cost;
		hCost = h;
		name = name1;

	}

	public boolean insertStrut1Precondition() {

		if (Main.state.getStateParameter1() == State.strut1Location[0]) {

			if (actParameter1 == State.strut1Location[1]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	public boolean walkFStrut1Precondition() {

		if (Main.state.getStateParameter1() == State.strut1Location[1]) {

			if (actParameter1 == State.strut1Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	public boolean rad2Strut1Precondition() {

		if (Main.state.getStateParameter1() == State.strut1Location[2]) {

			if (actParameter1 == State.strut1Location[3]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	public boolean insertStrut2Precondition() {

		if (Main.state.getStateParameter1() == State.strut1Location[3]
				|| Main.state.getStateParameter1() == State.strut1Location[2]) {
			if (Main.state.getStateParameter2() == State.strut2Location[0]) {

				if (actParameter2 == State.strut2Location[1]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean walkFStrut2Precondition() {

		if (Main.state.getStateParameter2() == State.strut2Location[1]) {

			if (actParameter2 == State.strut2Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radxStrut2Precondition() {

		if (Main.state.getStateParameter2() == State.strut2Location[2]) {

			if (actParameter2 == State.strut2Location[3]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean insertStrut3Precondition() {

		if (Main.state.getStateParameter2() == State.strut2Location[3]
				|| Main.state.getStateParameter2() == State.strut2Location[5]
				|| Main.state.getStateParameter2() == State.strut2Location[4]) {
			if (Main.state.getStateParameter3() == State.strut3Location[0]) {

				if (actParameter3 == State.strut3Location[1]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean walkFStrut3Precondition() {

		if (Main.state.getStateParameter3() == State.strut3Location[1]) {

			if (actParameter3 == State.strut3Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkBStrut2Precondition() {

		if (Main.state.getStateParameter2() == State.strut2Location[3]) {

			if (actParameter2 == State.strut2Location[4]) {
				return true;

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean swingStrut2Precondition() {

		if (Main.state.getStateParameter2() == State.strut2Location[4]) {

			if (actParameter2 == State.strut2Location[5]) {

				return true;

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radxStrut3Precondition() {

		if (Main.state.getStateParameter3() == State.strut3Location[2]) {

			if (actParameter3 == State.strut3Location[3]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean insertStrut4Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[0]) {
			if (Main.state.getStateParameter2() == State.strut2Location[5]) {

				if (actParameter4 == State.strut4Location[1]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean walkFStrut4Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[1]) {

			if (actParameter4 == State.strut4Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radxStrut4Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[2]) {
			if (Main.state.getStateParameter2() == State.strut2Location[5]) {

				if (actParameter4 == State.strut4Location[3]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean insertStrut5Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[3]
				|| Main.state.getStateParameter4() == State.strut4Location[2]) {

			if (Main.state.getStateParameter5() == State.strut5Location[0]) {

				if (actParameter5 == State.strut5Location[1]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkFStrut5Precondition() {

		if (Main.state.getStateParameter5() == State.strut5Location[1]) {

			if (actParameter5 == State.strut5Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean rad2Strut4Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[3]) {
			if (Main.state.getStateParameter2() == State.strut2Location[5]) {

				if (actParameter4 == State.strut4Location[4]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean radxStrut5Precondition() {

		if (Main.state.getStateParameter5() == State.strut5Location[2]) {
			if (Main.state.getStateParameter4() == State.strut4Location[4]) {

				if (actParameter5 == State.strut5Location[3]) {
					return true;
				} else {
					return false;
				}

			} else {

				return false;
			}

		} else {
			return false;
		}

	}

	public boolean insertStrut6Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[4]) {

			if (actParameter6 == State.strut6Location[1]) {
				return true;
			} else {
				return false;
			}

		} else {

			return false;
		}

	}

	public boolean walkFStrut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[1]) {

			if (actParameter6 == State.strut6Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radx2Strut5Precondition() {

		if (Main.state.getStateParameter4() == State.strut4Location[4]) {
			if (Main.state.getStateParameter5() == State.strut5Location[3]) {

				if (actParameter5 == State.strut5Location[4]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkBStrut5Precondition() {

		if (Main.state.getStateParameter5() == State.strut5Location[4]) {

			if (actParameter5 == State.strut5Location[5]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkBStrut3Precondition() {

		if (Main.state.getStateParameter3() == State.strut3Location[3]) {

			if (actParameter3 == State.strut3Location[4]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean rad2Strut3Precondition() {

		if (Main.state.getStateParameter3() == State.strut3Location[4]) {

			if (actParameter3 == State.strut3Location[5]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radxStrut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[2]) {

			if (actParameter6 == State.strut6Location[3]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkBStrut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[3]) {

			if (actParameter6 == State.strut6Location[4]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radx2Strut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[4]) {

			if (actParameter6 == State.strut6Location[5]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean rad2Strut5Precondition() {

		if (Main.state.getStateParameter5() == State.strut5Location[5]) {

			if (actParameter5 == State.strut5Location[6]) {

				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkB2Strut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[5]) {

			if (actParameter6 == State.strut6Location[6]) {

				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean rad2Strut6Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[6]) {

			if (actParameter6 == State.strut6Location[7]) {

				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean insertStrut7Precondition() {

		if (Main.state.getStateParameter6() == State.strut6Location[5]
				|| Main.state.getStateParameter6() == State.strut6Location[6]
				|| Main.state.getStateParameter6() == State.strut6Location[7]) {
			if (Main.state.getStateParameter7() == State.strut7Location[0]) {

				if (actParameter7 == State.strut7Location[1]) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkFStrut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[1]) {

			if (actParameter7 == State.strut7Location[2]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radxStrut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[2]) {

			if (actParameter7 == State.strut7Location[3]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radx2Strut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[3]) {

			if (actParameter7 == State.strut7Location[4]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkBStrut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[4]) {

			if (actParameter7 == State.strut7Location[5]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean radx3Strut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[5]) {

			if (actParameter7 == State.strut7Location[6]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean walkB2Strut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[6]) {

			if (actParameter7 == State.strut7Location[7]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean rad2Strut7Precondition() {

		if (Main.state.getStateParameter7() == State.strut7Location[7]) {

			if (actParameter7 == State.strut7Location[8]) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public String getActParameter1() {
		return actParameter1;
	}

	public String getActParameter2() {
		return actParameter2;
	}

	public String getActParameter3() {
		return actParameter3;
	}

	public String getActParameter4() {
		return actParameter4;
	}

	public String getActParameter5() {
		return actParameter5;
	}

	public String getActParameter6() {
		return actParameter6;
	}

	public String getActParameter7() {
		return actParameter7;
	}

	public int getActionCost() {
		return actionCost;
	}

	public int getHCost() {
		return hCost;
	}

	public void setActCost(int newCost) {
		actionCost = actionCost + newCost;
	}

	public void setHCost(int newCost) {
		hCost = newCost;
	}
	
	public void removeElement(Action[] arr, int removedIdx) {
	    System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
	}

	public int getActParameter1Position() {

		if (actParameter1 == "out") {

			arrayPosition = 0;

		}

		if (actParameter1 == "Insert 0c 5c 3c 0ang 7 6") {

			arrayPosition = 1;

		}

		if (actParameter1 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter1 == "Rad2 4c 5c 8c 5c 8c 0ang 90ang") {

			arrayPosition = 3;

		}

		return arrayPosition;
	}

	public int getActParameter2Position() {

		if (actParameter2 == "out") {

			arrayPosition = 0;

		}

		if (actParameter2 == "Insert 0c 5c 3c 0ang 6 5") {

			arrayPosition = 1;

		}

		if (actParameter2 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter2 == "Radx 4c 5c 8c 6c 9c 0ang 90ang") {

			arrayPosition = 3;

		}

		if (actParameter2 == "Walk_backwards 8c 6c 8c 5c 5c 90ang") {

			arrayPosition = 4;

		}

		if (actParameter2 == "Swing 8c 5c 8c 4c 1c 90ang 270ang") {

			arrayPosition = 5;

		}

		return arrayPosition;
	}

	public int getActParameter3Position() {

		if (actParameter3 == "out") {

			arrayPosition = 0;

		}

		if (actParameter3 == "Insert 0c 5c 3c 0ang 5 4") {

			arrayPosition = 1;

		}

		if (actParameter3 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter3 == "Radx 4c 5c 8c 6c 9c 0ang 90ang") {

			arrayPosition = 3;

		}

		if (actParameter3 == "Walk_backwards 8c 6c 8c 5c 5c 90ang") {

			arrayPosition = 4;
		}

		if (actParameter3 == "Rad2 8c 5c 8c 9c 5c 90ang 180ang") {

			arrayPosition = 5;
		}

		return arrayPosition;
	}

	public int getActParameter4Position() {

		if (actParameter4 == "out") {

			arrayPosition = 0;

		}

		if (actParameter4 == "Insert 0c 5c 3c 0ang 4 3") {

			arrayPosition = 1;

		}

		if (actParameter4 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter4 == "Radx 4c 5c 8c 4c 1c 0ang 270ang") {

			arrayPosition = 3;

		}

		if (actParameter4 == "Rad2 8c 4c 8c 0c 11c 270ang 0ang") {

			arrayPosition = 4;

		}

		return arrayPosition;
	}

	public int getActParameter5Position() {

		if (actParameter5 == "out") {

			arrayPosition = 0;

		}

		if (actParameter5 == "Insert 0c 5c 3c 0ang 3 2") {

			arrayPosition = 1;

		}

		if (actParameter5 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter5 == "Radx 4c 5c 8c 4c 1c 0ang 270ang") {

			arrayPosition = 3;

		}

		if (actParameter5 == "Radx 8c 4c 9c 0c 12c 270ang 0ang") {

			arrayPosition = 4;

		}

		if (actParameter5 == "Walk_backwards 9c 0c 8c 0c 8c 0ang") {

			arrayPosition = 5;

		}

		if (actParameter5 == "Rad2 8c 0c 12c 0c 3c 0ang 90ang") {

			arrayPosition = 6;

		}

		return arrayPosition;
	}

	public int getActParameter6Position() {

		if (actParameter6 == "out") {

			arrayPosition = 0;

		}

		if (actParameter6 == "Insert 0c 5c 3c 0ang 2 1") {

			arrayPosition = 1;

		}

		if (actParameter6 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter6 == "Radx 4c 5c 8c 6c 9c 0ang 90ang") {

			arrayPosition = 3;

		}

		if (actParameter6 == "Walk_backwards 8c 6c 8c 5c 5c 90ang") {

			arrayPosition = 4;

		}

		if (actParameter6 == "Radx 8c 5c 7c 9c 4c 90ang 180ang") {

			arrayPosition = 5;

		}

		if (actParameter6 == "Walk_backwards 7c 9c 8c 9c 8c 180ang") {

			arrayPosition = 6;

		}

		if (actParameter6 == "Rad2 8c 9c 4c 9c 6c 180ang 270ang") {

			arrayPosition = 7;

		}

		return arrayPosition;
	}

	public int getActParameter7Position() {

		if (actParameter7 == "out") {

			arrayPosition = 0;

		}

		if (actParameter7 == "Insert 0c 5c 3c 0ang 1 0") {

			arrayPosition = 1;

		}

		if (actParameter7 == "Walk_forward 0c 5c 4c 5c 4c 7c 0ang") {

			arrayPosition = 2;

		}

		if (actParameter7 == "Radx 4c 5c 8c 4c 1c 0ang 270ang") {

			arrayPosition = 3;

		}

		if (actParameter7 == "Radx 8c 4c 9c 0c 12c 270ang 0ang") {

			arrayPosition = 4;

		}

		if (actParameter7 == "Walk_backwards 9c 0c 8c 0c 8c 0ang") {

			arrayPosition = 5;

		}

		if (actParameter7 == "Radx 8c 0c 12c 1c 4c 0ang 90ang") {

			arrayPosition = 6;

		}

		if (actParameter7 == "Walk_backwards 12c 1c 12c 0c 0c 90ang") {

			arrayPosition = 7;

		}

		if (actParameter7 == "Rad2 12c 0c 12c 4c 9c 90ang 180ang") {

			arrayPosition = 8;

		}

		return arrayPosition;
	}

}
