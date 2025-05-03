package com.stroeer.model;

/**
 * Represents the response containing a user's details along with their associated comments.
 *
 * @property id The unique identifier of the user.
 * @property name The full name of the user.
 * @property username The user's chosen username.
 * @property email The email address of the user.
 * @property address The address information of the user, including street, city, zipcode, and geographical details.
 * @property phone The contact phone number of the user.
 * @property website The personal or professional website of the user.
 * @property company The company details of the user, including name, catchphrase, and business focus.
 * @property comments The list of comments associated with the user.
 *
 * @constructor Creates a new instance of `CommentsResponse` by combining user details from a `UserResponse` object
 * and a list of associated comments (`PostResponse` objects).
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012B\u001f\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u0080\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lcom/stroeer/model/CommentsResponse;", "", "id", "", "name", "", "username", "email", "address", "Lcom/stroeer/model/Address;", "phone", "website", "company", "Lcom/stroeer/model/Company;", "comments", "", "Lcom/stroeer/model/PostResponse;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stroeer/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stroeer/model/Company;Ljava/util/List;)V", "userResponse", "Lcom/stroeer/model/UserResponse;", "(Lcom/stroeer/model/UserResponse;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getUsername", "getEmail", "getAddress", "()Lcom/stroeer/model/Address;", "getPhone", "getWebsite", "getCompany", "()Lcom/stroeer/model/Company;", "getComments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stroeer/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stroeer/model/Company;Ljava/util/List;)Lcom/stroeer/model/CommentsResponse;", "equals", "", "other", "hashCode", "", "toString", "stroeer-challenge"})
public final class CommentsResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stroeer.model.Address address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String website = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stroeer.model.Company company = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.stroeer.model.PostResponse> comments = null;
    
    public CommentsResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    com.stroeer.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.String website, @org.jetbrains.annotations.Nullable()
    com.stroeer.model.Company company, @org.jetbrains.annotations.Nullable()
    java.util.List<com.stroeer.model.PostResponse> comments) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stroeer.model.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stroeer.model.Company getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stroeer.model.PostResponse> getComments() {
        return null;
    }
    
    public CommentsResponse(@org.jetbrains.annotations.NotNull()
    com.stroeer.model.UserResponse userResponse, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stroeer.model.PostResponse> comments) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stroeer.model.Address component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stroeer.model.Company component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stroeer.model.PostResponse> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stroeer.model.CommentsResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    com.stroeer.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.String website, @org.jetbrains.annotations.Nullable()
    com.stroeer.model.Company company, @org.jetbrains.annotations.Nullable()
    java.util.List<com.stroeer.model.PostResponse> comments) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}