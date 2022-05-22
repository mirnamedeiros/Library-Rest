package br.imd.library;

import java.util.HashMap;
import java.util.Map;

import br.imd.library.exceptions.RestRequestException;

public class Client {

	public Client() {
		
	}

	public void search() throws RestRequestException {
		
		String tittle = "A";
		String uri = "http://localhost:8080/RestServer/restapi/library/search/"+"&tittle="+tittle;
		Map<String, String> headerParams = new HashMap<String, String>();

		headerParams.put("accept", "application/json");

		String response = HttpUtils.httpGetRequest(uri, headerParams);

		System.out.println(response);
	}
	
	
	public static void main(String[] args) throws RestRequestException {
		
		Client restClient = new Client();
		
		restClient.search();

	}
}
