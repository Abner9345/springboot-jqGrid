package com.vehicle.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.vehicle.pojo.VehicleImage;
import com.vehicle.pojo.VehicleInfoParmas;
@Mapper
public interface VehicleImageMapper {
//	List<VehicleImage> selectVehicleImage(String uuid);
	VehicleImage selectVehicleImage(String uuid);
	VehicleImage queryVehcileConditon(VehicleInfoParmas vehicleInfoParams);
}
