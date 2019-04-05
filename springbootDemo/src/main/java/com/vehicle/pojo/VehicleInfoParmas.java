package com.vehicle.pojo;

public class VehicleInfoParmas {
	private String plateNo;
	private String startTime;
	private String endTime;
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "VehicleInfoParmas [plateNo=" + plateNo + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
