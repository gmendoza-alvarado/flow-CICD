package com.microservice.appflow.repository;

public class RetrieveFlowQuery {

	
	public static final String QUERY_FLOW = """
			select flow from example where code = ?
			""";
}
