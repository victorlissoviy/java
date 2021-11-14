package org.example;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HttpExapmle {
    public static void main(String[] args) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://127.0.0.1:1880/nodeget?asd=vdf");

        HttpResponse httpResponse = httpClient.execute(httpGet);

        String body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);

        HttpPost httpPost = new HttpPost("http://127.0.0.1:1880/nodepost");
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Hello", "World"));
        params.add(new BasicNameValuePair("mynum", "123"));
        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        httpResponse = httpClient.execute(httpPost);

        body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);
    }
}