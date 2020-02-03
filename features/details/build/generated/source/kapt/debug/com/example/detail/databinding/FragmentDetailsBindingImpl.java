package com.example.detail.databinding;
import com.example.detail.R;
import com.example.detail.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding implements com.example.detail.generated.callback.OnRefreshListener.Listener, com.example.detail.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.imageView3, 6);
        sViewsWithIds.put(R.id.imageView4, 7);
        sViewsWithIds.put(R.id.imageView5, 8);
    }
    // views
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            );
        this.fragmentDetailAvatar.setTag(null);
        this.fragmentDetailBlog.setTag(null);
        this.fragmentDetailCompany.setTag(null);
        this.fragmentDetailName.setTag(null);
        this.fragmentDetailRootView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.detail.generated.callback.OnRefreshListener(this, 1);
        mCallback2 = new com.example.detail.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.detail.presentation.UserDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.detail.presentation.UserDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUser((androidx.lifecycle.LiveData<com.example.model.User>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.LiveData<com.example.model.User> ViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.model.User viewModelUserGetValue = null;
        java.lang.String viewModelUserBlog = null;
        java.lang.String viewModelUserAvatarUrl = null;
        com.example.repository.utils.Resource<com.example.model.User> viewModelIsLoadingGetValue = null;
        androidx.lifecycle.LiveData<com.example.model.User> viewModelUser = null;
        java.lang.String viewModelUserName = null;
        java.lang.String viewModelUserCompany = null;
        androidx.lifecycle.LiveData<com.example.repository.utils.Resource<com.example.model.User>> viewModelIsLoading = null;
        com.example.detail.presentation.UserDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.user
                        viewModelUser = viewModel.getUser();
                    }
                    updateLiveDataRegistration(0, viewModelUser);


                    if (viewModelUser != null) {
                        // read viewModel.user.getValue()
                        viewModelUserGetValue = viewModelUser.getValue();
                    }


                    if (viewModelUserGetValue != null) {
                        // read viewModel.user.getValue().blog
                        viewModelUserBlog = viewModelUserGetValue.getBlog();
                        // read viewModel.user.getValue().avatarUrl
                        viewModelUserAvatarUrl = viewModelUserGetValue.getAvatarUrl();
                        // read viewModel.user.getValue().name
                        viewModelUserName = viewModelUserGetValue.getName();
                        // read viewModel.user.getValue().company
                        viewModelUserCompany = viewModelUserGetValue.getCompany();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(1, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.detail.presentation.DetailBinding.loadImageRounded(this.fragmentDetailAvatar, viewModelUserAvatarUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailBlog, viewModelUserBlog);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailCompany, viewModelUserCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailName, viewModelUserName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fragmentDetailAvatar.setOnClickListener(mCallback2);
            this.fragmentDetailRootView.setOnRefreshListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.detail.presentation.DetailBinding.showWhenLoading(this.fragmentDetailRootView, viewModelIsLoadingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.example.detail.presentation.UserDetailsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.reloadDataWhenUserRefreshes();
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.user.getValue()
        com.example.model.User viewModelUserGetValue = null;
        // viewModel
        com.example.detail.presentation.UserDetailsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;
        // viewModel.user
        androidx.lifecycle.LiveData<com.example.model.User> viewModelUser = null;
        // viewModel.user != null
        boolean viewModelUserJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModelUser = viewModel.getUser();

            viewModelUserJavaLangObjectNull = (viewModelUser) != (null);
            if (viewModelUserJavaLangObjectNull) {


                viewModelUserGetValue = viewModelUser.getValue();

                viewModel.userClicksOnAvatarImage(viewModelUserGetValue);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.user
        flag 1 (0x2L): viewModel.isLoading
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}