package com.stroeer.domain;

@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tB\t\b\u0016\u00a2\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/stroeer/domain/StroeerUser;", "", "id", "", "version", "", "role", "Lcom/stroeer/domain/StroeerUser$Role;", "<init>", "(Ljava/lang/Long;ILcom/stroeer/domain/StroeerUser$Role;)V", "()V", "(Lcom/stroeer/domain/StroeerUser$Role;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVersion", "()I", "setVersion", "(I)V", "getRole", "()Lcom/stroeer/domain/StroeerUser$Role;", "Role", "stroeer-challenge"})
public final class StroeerUser {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @jakarta.persistence.Version()
    private int version;
    @jakarta.persistence.Enumerated(value = jakarta.persistence.EnumType.STRING)
    @org.jetbrains.annotations.NotNull()
    private final com.stroeer.domain.StroeerUser.Role role = null;
    
    public StroeerUser(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, int version, @org.jetbrains.annotations.NotNull()
    com.stroeer.domain.StroeerUser.Role role) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final int getVersion() {
        return 0;
    }
    
    public final void setVersion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stroeer.domain.StroeerUser.Role getRole() {
        return null;
    }
    
    public StroeerUser() {
        super();
    }
    
    public StroeerUser(@org.jetbrains.annotations.NotNull()
    com.stroeer.domain.StroeerUser.Role role) {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stroeer/domain/StroeerUser$Role;", "", "<init>", "(Ljava/lang/String;I)V", "ADMIN", "USER", "stroeer-challenge"})
    public static enum Role {
        /*public static final*/ ADMIN /* = new ADMIN() */,
        /*public static final*/ USER /* = new USER() */;
        
        Role() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.stroeer.domain.StroeerUser.Role> getEntries() {
            return null;
        }
    }
}