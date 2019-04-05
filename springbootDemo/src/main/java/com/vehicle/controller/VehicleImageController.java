package com.vehicle.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.vehicle.pojo.VehicleImage;
import com.vehicle.pojo.VehicleInfoParmas;
import com.vehicle.service.impl.VehicleImageServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
  *车辆信息控制类
 * @author Kingde
 *
 */
@Api(description = "查询图片信息")
@RestController
@RequestMapping("/")
public class VehicleImageController {
	
	private final static Logger logger = Logger.getLogger(VehicleImageController.class);
	@Autowired
	private VehicleImageServiceImpl vehicleImageServiceImpl;
	
	@ApiOperation(value = "图片ID" ,  notes="通过图片ID获取图片信息")
	@RequestMapping(path = "/rest/fuxiaoyi/queryVehicleImage", method = RequestMethod.POST, produces = "application/json")
	public String queryVehicleImageById(@RequestBody VehicleInfoParmas vehicleInfoParams) {
		logger.error("uuid::" + vehicleInfoParams.getPlateNo());
		JSONObject jsonObject = new JSONObject();
//		VehicleImage vehicleImage = vehicleImageServiceImpl.queryVehicleImageByUUID(vehicleInfoParams.getPlateNo());
		VehicleImage vehicleImage = vehicleImageServiceImpl.queryVehicleImageByCondition(vehicleInfoParams);
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(JSONObject.parse(JSONObject.toJSONString(vehicleImage)));
		
		jsonObject.put("totalpages", 1);
		jsonObject.put("currpage", 1);
		jsonObject.put("totalrecords", 1);
		jsonObject.put("content", jsonArray);
		return jsonObject.toString();
	}
//	@ApiOperation(value = "图片ID" ,  notes="通过图片ID获取图片信息")
//	@RequestMapping(path = "/rest/fuxiaoyi/queryVehicleImage", method = RequestMethod.GET, produces = "application/json")
//	public String queryVehicleImageById(@RequestParam(value="uuid", required=false) String uuid) {
//		logger.error("uuid::" + uuid);
//		JSONObject jsonObject = new JSONObject();
//		VehicleImage vehicleImage = vehicleImageServiceImpl.queryVehicleImageByUUID(uuid);
//		JSONArray jsonArray = new JSONArray();
//		jsonArray.add(JSONObject.parse(JSONObject.toJSONString(vehicleImage)));
//		
//		jsonObject.put("totalpages", 1);
//		jsonObject.put("currpage", 1);
//		jsonObject.put("totalrecords", 1);
//		jsonObject.put("content", jsonArray);
//		return jsonObject.toString();
//	}
}
