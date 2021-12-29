package br.com.bmbwebtest.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SelectEnvironment {

	private InputStream envFile;
	private String baseUrl;

	public SelectEnvironment() throws IOException {
		envFile = new FileInputStream(new File("env.properties"));
		Properties props = new Properties();
		props.load(envFile);
		baseUrl = props.getProperty("qa.baseurl_bmb");
	}

	public String GetBaseUrl() {
		return baseUrl;
	}

}
