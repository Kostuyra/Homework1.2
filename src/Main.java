public class Main {
	public static void main(String[] args) {
		taskOneToThree();
		taskFour();
		taskFive();
		taskSixAndSeven();
		taskEight();
	}

	static void taskOneToThree() {
		var dog = 8.0;
		var cat = 3.6;
		var paper = 763789;
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(paper);

		dog += 4;
		cat += 4;
		paper += 4;
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(paper);

		dog -= 3.5;
		cat -= 1.6;
		paper -= 7639;
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(paper);
	}

	static void taskFour() {
		var friend = 19;
		System.out.println(friend);
		friend *= 2;
		System.out.println(friend);
		friend /= 7;
		System.out.println(friend);
	}

	static void taskFive() {
		var frog = 3.5;
		System.out.println(frog);
		frog *= 10;
		System.out.println(frog);
		frog /= 3.5;
		System.out.println(frog);
		frog += 4;
		System.out.println(frog);
	}

	static void taskSixAndSeven() {
		var weightFirstBoxer = 78.2;
		var weightSecondBoxer = 87.2;
		var sumWeightBoxers = weightFirstBoxer + weightSecondBoxer;
		System.out.println(sumWeightBoxers);
		var differenceWeightBoxers = weightSecondBoxer - weightFirstBoxer;
		System.out.println(differenceWeightBoxers);
		differenceWeightBoxers = weightSecondBoxer % weightFirstBoxer;
		System.out.println(differenceWeightBoxers);
	}

	static void taskEight() {
		var allWorkHours = 640;
		var oneWorkerHours = 8;
		var amountWorkers = allWorkHours / oneWorkerHours;
		System.out.println("Всего работников в компании — " + amountWorkers + " человек");

		amountWorkers += 94;
		allWorkHours = oneWorkerHours * amountWorkers;
		System.out.println(" Если в компании работает " + amountWorkers + " человек, то всего " +
				 allWorkHours + " часов работы может быть поделено между сотрудниками");
	}

}