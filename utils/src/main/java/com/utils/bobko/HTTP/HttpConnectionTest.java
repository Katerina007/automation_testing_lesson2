package com.utils.bobko.HTTP;

import com.utils.bobko.HTTP.HTTP_client.ApacheClient;
import com.utils.bobko.HTTP.HTTP_client.MyHttpClient;
import com.utils.bobko.HTTP.HTTP_client.HttpUrlConnectionClient;

import java.io.IOException;

public class HttpConnectionTest {


    public static void main(final String[] args) throws IOException {
        //HttpUrlConnection
        MyHttpClient httpClient = new HttpUrlConnectionClient();

        String getUrl = "http://httpbin.org/get";

        String getResponse = httpClient.sendGet(getUrl);
        System.out.println(getResponse);


        String postUrl = "http://httpbin.org/post";
        String body = "{\"data\": \"hi there\"}";
        String contentType = "application/json";

        String postResponse = httpClient.sendPost(postUrl, body, contentType);
        System.out.println(postResponse);


        String putUrl = "http://httpbin.org/put";

        String putResponse = httpClient.sendPut(putUrl, body, contentType);
        System.out.println(putResponse);

        //ApacheClient
        MyHttpClient apacheClient = new ApacheClient();

        getResponse = apacheClient.sendGet(getUrl);
        System.out.println(getResponse);

        postResponse = apacheClient.sendPost(postUrl, body, contentType);
        System.out.println(postResponse);

        putResponse = apacheClient.sendPut(putUrl, body, contentType);
        System.out.println(putResponse);
        }
}
