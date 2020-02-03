package com.example.detail.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/detail/presentation/UserDetailsViewModel;", "Lcom/example/common/base/BaseViewModel;", "useCase", "Lcom/example/detail/domain/UserDetailsUseCase;", "(Lcom/example/detail/domain/UserDetailsUseCase;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/repository/utils/Resource;", "Lcom/example/model/User;", "_user", "Landroidx/lifecycle/MediatorLiveData;", "argsLogin", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "user", "getUser", "getUserDetail", "", "loadDataWhenActivityStarts", "login", "reloadDataWhenUserRefreshes", "userClicksOnAvatarImage", "details_debug"})
public final class UserDetailsViewModel extends com.example.common.base.BaseViewModel {
    private java.lang.String argsLogin;
    private final androidx.lifecycle.MediatorLiveData<com.example.model.User> _user = null;
    private final androidx.lifecycle.MutableLiveData<com.example.repository.utils.Resource<com.example.model.User>> _isLoading = null;
    private final com.example.detail.domain.UserDetailsUseCase useCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.model.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>> isLoading() {
        return null;
    }
    
    public final void loadDataWhenActivityStarts(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
    }
    
    public final void reloadDataWhenUserRefreshes() {
    }
    
    public final void userClicksOnAvatarImage(@org.jetbrains.annotations.NotNull()
    com.example.model.User user) {
    }
    
    private final void getUserDetail() {
    }
    
    public UserDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.detail.domain.UserDetailsUseCase useCase) {
        super();
    }
}