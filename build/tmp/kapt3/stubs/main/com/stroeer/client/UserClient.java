package com.stroeer.client;

@io.micronaut.http.client.annotation.Client(value = "http://jsonplaceholder.typicode.com")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/stroeer/client/UserClient;", "", "getUser", "Lcom/stroeer/model/UserResponse;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostsByUser", "", "Lcom/stroeer/model/PostResponse;", "userId", "stroeer-challenge"})
public abstract interface UserClient {
    
    @io.micronaut.http.annotation.Get(value = "/users/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUser(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stroeer.model.UserResponse> $completion);
    
    @io.micronaut.http.annotation.Get(value = "/posts?userId={userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPostsByUser(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stroeer.model.PostResponse>> $completion);
}