package com.example.detail.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/detail/presentation/UserDetailsViewModel;", "Lcom/example/common/base/BaseViewModel;", "useCase", "Lcom/example/detail/domain/UserDetailsUseCase;", "dispatchers", "Lcom/example/repository/AppDispatchers;", "(Lcom/example/detail/domain/UserDetailsUseCase;Lcom/example/repository/AppDispatchers;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/repository/utils/Resource$Status;", "_user", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/model/User;", "argsLogin", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "user", "getUser", "userSource", "Lcom/example/repository/utils/Resource;", "getUserDetail", "Lkotlinx/coroutines/Job;", "forceRefresh", "", "loadDataWhenActivityStarts", "", "login", "reloadDataWhenUserRefreshes", "userClicksOnAvatarImage", "details_debug"})
public final class UserDetailsViewModel extends com.example.common.base.BaseViewModel {
    private java.lang.String argsLogin;
    private androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>> userSource;
    private final androidx.lifecycle.MediatorLiveData<com.example.model.User> _user = null;
    private final androidx.lifecycle.MutableLiveData<com.example.repository.utils.Resource.Status> _isLoading = null;
    private final com.example.detail.domain.UserDetailsUseCase useCase = null;
    private final com.example.repository.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.model.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.repository.utils.Resource.Status> isLoading() {
        return null;
    }
    
    public final void loadDataWhenActivityStarts(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job reloadDataWhenUserRefreshes() {
        return null;
    }
    
    public final void userClicksOnAvatarImage(@org.jetbrains.annotations.NotNull()
    com.example.model.User user) {
    }
    
    private final kotlinx.coroutines.Job getUserDetail(boolean forceRefresh) {
        return null;
    }
    
    public UserDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.detail.domain.UserDetailsUseCase useCase, @org.jetbrains.annotations.NotNull()
    com.example.repository.AppDispatchers dispatchers) {
        super();
    }
}