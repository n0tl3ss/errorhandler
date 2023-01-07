package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Singleton
public class ErrorExceptionHandler implements ExceptionHandler<Exception, HttpResponse<?>> {


    @Override
    public HttpResponse<?> handle(HttpRequest request, Exception exception) {
        return HttpResponse.badRequest("RETURNED FROM ErrorExceptionHandler");
    }
}
