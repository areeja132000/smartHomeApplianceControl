package smartHomeApplianceControl;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
	private SmartHomeControl control;
	
	public MyTimerTask(SmartHomeControl control) {
		this.control = control;
	}

	@Override
	public void run() {
		this.control.turnOffAllAppliances();
	}

}
