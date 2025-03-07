package com.microservice.appflow.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.microservice.appflow.constant.*;
import com.microservice.appflow.dto.EvaluateFlowRecord;
import com.microservice.appflow.dto.EvaluateFlowResult;
import com.microservice.appflow.services.RetrieveFlowService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping(Constants.BASE_PATH)
@AllArgsConstructor
public class FlowController {

	private RetrieveFlowService service;

	/**
	 * End point que se encarga de regresar el flow de un codigo.
	 * 
	 * @param bodyRequest
	 * @return
	 */
	@GetMapping(value = ConstantsApi.GET_FLOW_RETRIEVE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EvaluateFlowResult> flowRetrieve(@RequestBody EvaluateFlowRecord bodyRequest) {
		System.out.print(bodyRequest.code());

		return ResponseEntity.status(HttpStatus.OK).body(this.service.process(bodyRequest));
	}
}
