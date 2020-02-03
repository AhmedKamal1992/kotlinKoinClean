package com.example.detail.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/detail/domain/UserDetailsUseCaseImpl;", "Lcom/example/detail/domain/UserDetailsUseCase;", "repository", "Lcom/example/repository/UserRepository;", "(Lcom/example/repository/UserRepository;)V", "invoke", "Landroidx/lifecycle/LiveData;", "Lcom/example/repository/utils/Resource;", "Lcom/example/model/User;", "forceRefresh", "", "login", "", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "details_debug"})
public final class UserDetailsUseCaseImpl implements com.example.detail.domain.UserDetailsUseCase {
    private final com.example.repository.UserRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object invoke(boolean forceRefresh, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>>> p2) {
        return null;
    }
    
    public UserDetailsUseCaseImpl(@org.jetbrains.annotations.NotNull()
    com.example.repository.UserRepository repository) {
        super();
    }
}