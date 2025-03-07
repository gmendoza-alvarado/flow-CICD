package com.microservice.appflow.services;

import com.microservice.appflow.dto.EvaluateFlowRecord;
import com.microservice.appflow.dto.EvaluateFlowResult;

public interface RetrieveFlowService {

    EvaluateFlowResult process(EvaluateFlowRecord evaluateRFCRecord);

}
