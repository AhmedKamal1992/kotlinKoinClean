package com.example.detail.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/detail/domain/UserDetailsUseCase;", "", "getUser", "Lio/reactivex/Observable;", "Lcom/example/repository/utils/Resource;", "Lcom/example/model/User;", "login", "", "details_debug"})
public abstract interface UserDetailsUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.example.repository.utils.Resource<com.example.model.User>> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String login);
}