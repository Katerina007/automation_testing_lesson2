package com.utils.bobko.HTTP.HTTP_client;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.apache.http.HttpHeaders.USER_AGENT;

public class ApacheClient implements MyHttpClient {

    @Override
    public String sendGet(String url) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);

        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());
        return getResponse(response);
    }

    @Override
    public String sendPost(String url, String body, String contentType) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        post.setHeader("Content-Type", contentType);

        StringEntity requestEntity = new StringEntity(
                body,
                ContentType.APPLICATION_JSON);
        post.setEntity(requestEntity);

        HttpResponse response = client.execute(post);
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());
        return getResponse(response);
    }

    @Override
    public String sendPut(String url, String body, String contentType) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPut put = new HttpPut(url);

        put.setHeader("Content-Type", contentType);

        StringEntity requestEntity = new StringEntity(
                body,
                ContentType.APPLICATION_JSON);
        put.setEntity(requestEntity);

        HttpResponse response = client.execute(put);
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());
        return getResponse(response);
    }

    private String getResponse(HttpResponse response) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String inputLine;
        StringBuilder result = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();

        return result.toString();
    }
}
