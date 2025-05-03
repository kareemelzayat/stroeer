package com.stroeer.service;

@jakarta.inject.Singleton()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stroeer/service/CommentsService;", "", "userClient", "Lcom/stroeer/client/UserClient;", "<init>", "(Lcom/stroeer/client/UserClient;)V", "getUserComments", "Lcom/stroeer/model/CommentsResponse;", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "stroeer-challenge"})
public final class CommentsService {
    @org.jetbrains.annotations.NotNull()
    private final com.stroeer.client.UserClient userClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stroeer.service.CommentsService.Companion Companion = null;
    
    public CommentsService(@org.jetbrains.annotations.NotNull()
    com.stroeer.client.UserClient userClient) {
        super();
    }
    
    /**
     * Retrieves a combined response of user details and their associated comments.
     * This method fetches user information and a list of comments asynchronously
     * and returns them as a combined `CommentsResponse`. If the user is not found,
     * a `UserNotFoundException` is thrown.
     *
     * @param userId the unique identifier of the user whose details and comments are to be retrieved
     * @return a `CommentsResponse` containing the user's details and their associated comments;
     *        returns null if no data is available for the user
     * @throws UserNotFoundException if the user is not found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserComments(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stroeer.model.CommentsResponse> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stroeer/service/CommentsService$Companion;", "", "<init>", "()V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "stroeer-challenge"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLog() {
            return null;
        }
    }
}