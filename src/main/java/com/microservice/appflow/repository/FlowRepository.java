package com.microservice.appflow.repository;

import java.util.Optional;

import com.microservice.appflow.dto.Flow;

public interface FlowRepository {

	Optional<Flow> retrieveFlow(String code);
}
