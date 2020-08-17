package com.wesley.URLParser.model;

public class URLParsedResponseMapperModel {
	
	private String urlParsed;
	private String queryArguments;
	
	public URLParsedResponseMapperModel(String urlParsed, String queryArguments) {
		this.setUrlParsed(urlParsed);
		this.setQueryArguments(queryArguments);
	}

	public String getUrlParsed() {
		return urlParsed;
	}

	public void setUrlParsed(String urlParsed) {
		this.urlParsed = urlParsed;
	}

	public String getQueryArguments() {
		return queryArguments;
	}

	public void setQueryArguments(String queryArguments) {
		this.queryArguments = queryArguments;
	}
}
