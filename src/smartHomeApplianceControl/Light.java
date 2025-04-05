package smartHomeApplianceControl;

public class Light implements Appliance {
	private boolean turnedOn;
	
	public Light() {
		this.turnedOn = false;
	}
	
	@Override
	public void turnOff() {
		this.turnedOn = false;
		System.out.println("Light turned off.");
	}

	public void turnOn() {
		this.turnedOn = true;
		System.out.println("Light turned on.");
	}
	
	@Override
	public void displayStatus() {
		if (this.turnedOn) {
			System.out.println("Light is on");
		} else {
			System.out.println("Light is off");
		}
	}
	
}
