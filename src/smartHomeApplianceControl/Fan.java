package smartHomeApplianceControl;

public class Fan implements Appliance {
	private int speed;
	
	public Fan() {
		this.speed = 0;
	}

	@Override
	public void turnOff() {
		this.speed = 0;
		System.out.println("Fan turned off.");
	}
	
	public void setSpeed(int speed) {
		if (speed == 0 || speed == 1 || speed == 2) {
			this.speed = speed;
			System.out.println("Speed of fan set to " + this.speed);
		} else {
			System.out.println("Not valid speed.");
		}
	}

	@Override
	public void displayStatus() {
		if (this.speed == 0) {
			System.out.println("Fan is off");
		} else {
			System.out.println("The speed of the fan is " + this.speed);
		}
	}

}
