package smartHomeApplianceControl;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class SmartHomeControl {
	private List<Appliance> appliances;
	
	public SmartHomeControl () {
		this.appliances = new ArrayList<>();
		
        //At creation, setting it up so that system will turn off all devices on January 1st 1:00am
        Timer timer = new Timer(false);
        
        LocalDateTime current = LocalDateTime.now();
        int targetYear = current.getYear();
        
        LocalDateTime targetDate = LocalDateTime.of(targetYear, 1, 1, 1, 0, 0, 0);

        // If the current date is after Jan 1st, 1:00 AM, need to use next year
        if (current.isAfter(targetDate)) {
        	targetYear++;
        }
        
        Duration duration = Duration.between(current, LocalDateTime.of(targetYear, 1, 1, 1, 0, 0, 0));
        
        //Delay is time between now and next Jan 1st, 1:00 AM
        long delay = duration.toMillis();
        //Repeats every year
        long period = 1000L * 60L * 60L * 24L * 365L;

        timer.scheduleAtFixedRate(new MyTimerTask(this), delay, period);
	}
	
	public void addAppliance(Appliance appliance) {
		this.appliances.add(appliance);
	}
	
	public void removeAppliance(Appliance removeAppliance) {
		boolean removed = this.appliances.remove(removeAppliance);
		if (removed) {
			System.out.println("Appliance removed");
		} else {
			System.out.println("Appliance not found in smart home system");
		}
	}
	
	public void displayStatusAllAppliances() {
		System.out.println("Status of all appliances in smart home:");
		for (Appliance appliance: this.appliances) {
			appliance.displayStatus();
		}
	}
	
	public void turnOffAllAppliances() {
		System.out.println("Time: "+LocalDateTime.now()+": Turning off all appliances in smart home");
		for (Appliance appliance: this.appliances) {
			appliance.turnOff();
		}
	}

}
