package com.vehicle.service;

import com.vehicle.pojo.VehicleImage;
import com.vehicle.pojo.VehicleInfoParmas;

public interface VehicleImageService {
	
	VehicleImage queryVehicleImageByUUID(String uuid);
	VehicleImage queryVehicleImageByCondition(VehicleInfoParmas vehicleInfoParams);
//	List<VehicleImage> queryVehicleImageByUUID(String uuid);
}
