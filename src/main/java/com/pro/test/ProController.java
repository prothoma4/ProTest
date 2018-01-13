package com.pro.test;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "ProController", description = "ProController description", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProController {

	private Logger logger = Logger.getLogger(ProController.class);
	
		
	@ApiOperation(value = "calculate", nickname = "calculate")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved allocation details", response = Integer.class),
			@ApiResponse(code = 401, message = "Unauthorized access.session expired"),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 500, message = "Allocation details are not retrieved succesfully") })
	@RequestMapping(method = RequestMethod.GET, path = "/allocations", produces = "application/json")
	public int calculate(
			@ApiParam(value = "num1") @RequestParam(value = "num1") int num1,
			@RequestParam(value = "num2") int num2) {
		logger.info("Inside controller method: {}");
		
		return num1+num2;
	}

}
