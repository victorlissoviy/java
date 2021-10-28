package org.example;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpExapmle {
    public static void main(String[] args) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://google.com");
        HttpResponse httpResponse = httpClient.execute(httpGet);

        String body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);

        HttpPost httpPost = new HttpPost("http://google.com");
        httpPost.setHeader("qwe", "qwe");
        httpResponse = httpClient.execute(httpPost);

        body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);
    }
}