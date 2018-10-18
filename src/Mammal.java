public class Mammal {
//	default setting
	public int energyLevel = 100;
//	setter
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
//	getter
	public int getEnergy() {
		return energyLevel;
	}
//	display
	public void displayEvergy() {
		int level = this.energyLevel;
		System.out.println("The Energy Level is: " + level);
	}
}
