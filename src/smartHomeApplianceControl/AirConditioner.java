package smartHomeApplianceControl;

public class AirConditioner implements Appliance {
	private String mode;
	
	public AirConditioner () {
		this.mode = "off";
	}

	@Override
	public void turnOff() {
		this.mode = "off";
		System.out.println("Air conditioner turned off.");
	}
	
	public void setMode(String mode) {
		if (mode.equals("off") || mode.equals("heat") || mode.equals("cool")) {
			this.mode = mode;
			System.out.println("Air conditioner set to mode: \""+ this.mode + "\"");
		} else {
			System.out.println("Not valid arconditioner mode.");
		}
	}

	@Override
	public void displayStatus() {
		System.out.println("The mode of the airconditioner is \""+ this.mode + "\"");
	}

}
