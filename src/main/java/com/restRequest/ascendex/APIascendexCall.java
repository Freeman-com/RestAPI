package com.restRequest.ascendex;

import com.google.gson.Gson;
import com.model.User;
import com.repository.AscendexRepository;
import com.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;
import java.time.Duration;

public class APIascendexCall {

    final static String secret = "XehrRcD5WbaAcz2QHSC8v4vfvaLJLVkwyGLRiHMArXpWwQo9FjXKg3A5fzhgyHGK";
    final static String apiKey = "yHcVzT7GWPmPGrrHzAN74MDReYquiTe5";
    private UserService userService;

    /* Prehash String: <timestamp>+balance */
    long timesamp = System.currentTimeMillis();
    String path = "balance";
    String msg = timesamp + "+" + path;

    public APIascendexCall(UserService userService) {
        this.userService = userService;
    }


    /*static <T> void fromArrayToCollection(T[] a, Collection<T> c)*/
    public static <T> T doGet(String path, Class class1) throws IOException, InterruptedException {

        long timesamp = System.currentTimeMillis();
        String msg = timesamp + path;

        String result = EncoderAscendex.encode(msg, secret);

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://ascendex.com/0/api/pro/v1/cash/" + path))

                .timeout(Duration.ofMinutes(1))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("x-auth-key", apiKey)
                .header("x-auth-signature", String.valueOf(result))
                .header("x-auth-timestamp", String.valueOf(timesamp))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());


        Gson gson = new Gson();
        T container = gson.fromJson(response.body(), (Type) class1);
        return (T) container;
    }
}
