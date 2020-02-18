
public class Application {

	public static void main(String[] args) {

		SmartPhone smartphone = new SmartPhone.Builder("OnePlus", 2018, "6T", 6.3f)
				.setBattery(3000)
				.setCores(8)
				.setMemory(128)
				.build();
		
		System.out.println(smartphone);

	}

}
