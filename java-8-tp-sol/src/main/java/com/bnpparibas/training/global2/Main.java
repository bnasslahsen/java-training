
package com.bnpparibas.training.global2;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Runner> runners = RunData.getRunnersList();

		Solutions.setSpeedToMeterPerSecond(runners);
	}
}
