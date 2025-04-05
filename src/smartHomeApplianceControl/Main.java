package smartHomeApplianceControl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light firstLight = new Light();
		firstLight.displayStatus();
		firstLight.turnOn();
		firstLight.displayStatus();
		Fan firstFan = new Fan();
		firstFan.displayStatus();
		firstFan.setSpeed(2);
		firstFan.setSpeed(13);
		firstFan.displayStatus();
		AirConditioner firstAirCon = new AirConditioner();
		firstAirCon.displayStatus();
		firstAirCon.setMode("heat");
		firstAirCon.setMode("ldkf");
		firstAirCon.displayStatus();
		SmartHomeControl firstControl = new SmartHomeControl();
		firstControl.addAppliance(firstAirCon);
		firstControl.addAppliance(firstFan);
		firstControl.addAppliance(firstLight);
		firstControl.displayStatusAllAppliances();
		firstControl.turnOffAllAppliances();
		firstControl.displayStatusAllAppliances();
		firstControl.removeAppliance(firstAirCon);
		firstControl.displayStatusAllAppliances();
	}

}
