package br.imd.library;

import java.util.HashMap;
import java.util.Map;

import br.imd.library.exceptions.RestRequestException;

public class Client {

	public Client() {}
	
	public void search(String tittle) throws RestRequestException {
		
		String uri = "http://localhost:8080/Library-Rest-Server/restapi/library/search/"+tittle;
		Map<String, String> headerParams = new HashMap<String, String>();

		headerParams.put("accept", "application/json");
		
		
		String response = HttpUtils.httpGetRequest(uri, headerParams);
		
		System.out.println("\n"+response);
	}
	
	
	public static void main(String[] args) throws RestRequestException {
		
		Client restClient = new Client();
		
		restClient.search("A-Dance-with-Dragons");
		restClient.search("A-Clash-of-Kings");

	}
}
