package com.microservice.appflow.business;

import org.springframework.stereotype.Service;

import com.microservice.appflow.dto.EvaluateFlowRecord;
import com.microservice.appflow.dto.EvaluateFlowResult;
import com.microservice.appflow.dto.Flow;
import com.microservice.appflow.repository.YugabyteFlowRepository;
import com.microservice.appflow.services.RetrieveFlowService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RetrieveFlowReference implements RetrieveFlowService {

	YugabyteFlowRepository repository;

	@Override
	public EvaluateFlowResult process(EvaluateFlowRecord evaluateRFCRecord) {

		return new EvaluateFlowResult(evaluateRFCRecord.code(),
				repository.retrieveFlow(evaluateRFCRecord.code()).map(Flow::getFlow).orElse("no encontrado") 
		);
	}

}
