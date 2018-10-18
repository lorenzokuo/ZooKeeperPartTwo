class Bat extends Mammal {
//	public int energyLevel = 300;
	
	public void createBat() {
		this.setEnergy(300);
	}
		
	public void fly() {
		this.setEnergy(this.getEnergy()-50);
		System.out.println("Bat taking off! energy level -50: " + this.energyLevel);
		if(this.getEnergy()==0) {
			System.out.println("Bat is dead");
		}
	}
	public void eatHuman() {
		this.setEnergy(this.getEnergy()+25);
		System.out.println("So well! energy level +25: " + this.energyLevel);
	}
	public void attack() {
		this.setEnergy(this.getEnergy()-100);
		System.out.println("Attack town! energy level -100: " + this.energyLevel);
	}
}
