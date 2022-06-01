package br.imd.library;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import br.imd.library.exceptions.RestRequestException;

public class HttpUtils {

	public HttpUtils() {}
	
	public static String httpGetRequest(String uri, Map<String, String> headerParams) throws RestRequestException {

		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(uri);

			if (headerParams != null) {

				for (String header : headerParams.keySet()) {
					request.addHeader(header, headerParams.get(header));
				}
			}

			HttpResponse response = httpClient.execute(request);
			
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RestRequestException(response.getStatusLine().getReasonPhrase());
			}

			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");

			return responseString;

		} 
		catch (IOException e) {
			throw new RestRequestException(e.getMessage());
		}
	}

}
