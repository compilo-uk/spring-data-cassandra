package org.springframework.cassandra.test.integration.config.java;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyspaceCreatingConfig extends AbstractKeyspaceCreatingConfiguration {

	public static final String KEYSPACE = "kcc";

	@Override
	protected String getKeyspaceName() {
		return KEYSPACE;
	}
}