package com.stroeer.controller;

@io.micronaut.http.annotation.Controller(value = "/comments")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0087@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stroeer/controller/CommentsController;", "", "commentsService", "Lcom/stroeer/service/CommentsService;", "<init>", "(Lcom/stroeer/service/CommentsService;)V", "getComments", "Lio/micronaut/http/HttpResponse;", "Lcom/stroeer/model/CommentsResponse;", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stroeer-challenge"})
public final class CommentsController {
    @org.jetbrains.annotations.NotNull()
    private final com.stroeer.service.CommentsService commentsService = null;
    
    public CommentsController(@org.jetbrains.annotations.NotNull()
    com.stroeer.service.CommentsService commentsService) {
        super();
    }
    
    @io.micronaut.http.annotation.Get(value = "/{userId}")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getComments(@io.micronaut.http.annotation.PathVariable()
    long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<com.stroeer.model.CommentsResponse>> $completion) {
        return null;
    }
}