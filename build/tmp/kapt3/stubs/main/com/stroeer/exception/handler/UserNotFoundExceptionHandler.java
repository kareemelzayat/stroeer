package com.stroeer.exception.handler;

@jakarta.inject.Singleton()
@io.micronaut.context.annotation.Requires(classes = {com.stroeer.exception.UserNotFoundException.class, io.micronaut.http.server.exceptions.ExceptionHandler.class})
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/stroeer/exception/handler/UserNotFoundExceptionHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lcom/stroeer/exception/UserNotFoundException;", "Lio/micronaut/http/HttpResponse;", "<init>", "()V", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "stroeer-challenge"})
public final class UserNotFoundExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<com.stroeer.exception.UserNotFoundException, io.micronaut.http.HttpResponse<?>> {
    
    public UserNotFoundExceptionHandler() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.micronaut.http.HttpResponse<?> handle(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.NotNull()
    com.stroeer.exception.UserNotFoundException exception) {
        return null;
    }
}