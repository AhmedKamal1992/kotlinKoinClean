package com.example.detail.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/detail/presentation/DetailBinding;", "", "()V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "loadImageRounded", "showWhenLoading", "T", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "status", "Lcom/example/repository/utils/Resource;", "details_debug"})
public final class DetailBinding {
    public static final com.example.detail.presentation.DetailBinding INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"app:imageUrlRounded"})
    public static final void loadImageRounded(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:showWhenLoading"})
    public static final <T extends java.lang.Object>void showWhenLoading(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout view, @org.jetbrains.annotations.NotNull()
    com.example.repository.utils.Resource<T> status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private DetailBinding() {
        super();
    }
}