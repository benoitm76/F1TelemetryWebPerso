package fr.frizby.f1telemetrywebstat;

import java.util.ArrayList;

import fr.frizby.f1telemetrywebstat.Utils.F1Data;

public class Lap {
	private ArrayList<F1Data> lapInfo;
	
	public ArrayList<F1Data> getLapInfo() {
		return lapInfo;
	}

	public void setLapInfo(ArrayList<F1Data> lapInfo) {
		this.lapInfo = lapInfo;
	}

	public Lap() {
		lapInfo = new ArrayList<F1Data>();
	}
	
	public void addLapInfo(F1Data d)
	{
		lapInfo.add(d);
	}

}
