package com.stroeer.service;

@jakarta.inject.Singleton()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stroeer/service/CommentsService;", "", "userClient", "Lcom/stroeer/client/UserClient;", "<init>", "(Lcom/stroeer/client/UserClient;)V", "getUserComments", "Lcom/stroeer/model/CommentsResponse;", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stroeer-challenge"})
public final class CommentsService {
    @org.jetbrains.annotations.NotNull()
    private final com.stroeer.client.UserClient userClient = null;
    
    public CommentsService(@org.jetbrains.annotations.NotNull()
    com.stroeer.client.UserClient userClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserComments(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stroeer.model.CommentsResponse> $completion) {
        return null;
    }
}