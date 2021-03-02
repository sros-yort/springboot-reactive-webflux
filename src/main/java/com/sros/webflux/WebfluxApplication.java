package com.sros.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebfluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxApplication.class, args);
        System.out.println(getResult());
    }



    /*Reactive WebClient Test*/
    private static WebClient client = WebClient.create("http://localhost:8080/books");
    private static Mono<ClientResponse> result = client.get()
            .uri("")
            .accept(MediaType.APPLICATION_JSON)
            .exchange();
    public static String getResult() {
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }

}
