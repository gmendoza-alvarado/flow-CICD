package com.microservice.appflow.repository;

import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.microservice.appflow.dto.Flow;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class YugabyteFlowRepository implements FlowRepository {
	
    private final JdbcTemplate jdbc;

	
	@Override
	public Optional<Flow> retrieveFlow(String code) {

		 try {
	            return Optional.ofNullable(jdbc.query(
	                RetrieveFlowQuery.QUERY_FLOW,
	                preparedStatement -> preparedStatement.setString(1, code),
	                (ResultSetExtractor<Flow>) rs -> {
	                    if (rs.next()) {
	                        Flow flow = new Flow();
	                        flow.setFlow(rs.getString("flow"));
	                        return flow;
	                    }
	                    return null;
	                }
	            ));
	        } catch (DataAccessException e) {
	            return Optional.empty(); 
	        }
	    }

	}

	
