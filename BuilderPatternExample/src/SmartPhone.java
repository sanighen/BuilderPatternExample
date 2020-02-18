
public class SmartPhone {
	// required properties
	private String brand;
	private int year;
	private String model;
	private float diagonal;
	// optinal properties
	private int memory;
	private int cores;
	private int battery;

	public SmartPhone(Builder builder) {
		this.brand = builder.brand;
		this.year = builder.year;
		this.model = builder.model;
		this.diagonal = builder.diagonal;
		this.memory = builder.memory;
		this.cores = builder.cores;
		this.battery = builder.battery;
	}

	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", year=" + year + ", model=" + model + ", diagonal=" + diagonal
				+ ", memory=" + memory + ", cores=" + cores + ", battery=" + battery + "]";
	}

	public static class Builder {
		// required properties
		private String brand;
		private int year;
		private String model;
		private float diagonal;
		// optinal properties
		private int memory;
		private int cores;
		private int battery;

		public Builder(String brand, int year, String model, float diagonal) {
			this.brand = brand;
			this.year = year;
			this.model = model;
			this.diagonal = diagonal;
		}

		public Builder setMemory(int memory) {
			this.memory = memory;
			return this;
		}

		public Builder setCores(int cores) {
			this.cores = cores;
			return this;
		}

		public Builder setBattery(int battery) {
			this.battery = battery;
			return this;
		}

		public SmartPhone build() {
			return new SmartPhone(this);
		}

	}

}
