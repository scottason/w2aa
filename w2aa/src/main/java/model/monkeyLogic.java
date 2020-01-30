package model;

import w2aa.Monkey;
public class monkeyLogic {
	
	public String calculateMonkeySize(Monkey monkey) {
		String size = "average";
		double avgWeight = 17.00;
		if(monkey.getWeight() > avgWeight) {
			size = "Above Average";
			
		}else if (monkey.getWeight() < avgWeight) {
			size = "Below Average";
		}
		return size;
	}
	 
	public boolean monkeyIsBaby(Monkey monkey) {
		boolean isBaby = true;
		int age = 2;
		if(monkey.getAge() >= age) {
			isBaby = false;
		}
		return isBaby;
	}

}
