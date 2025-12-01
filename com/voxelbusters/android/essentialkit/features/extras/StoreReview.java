package com.voxelbusters.android.essentialkit.features.extras;

import android.app.Activity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.Task;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFeature;

public class StoreReview implements IFeature {
    private Activity context;
    private ReviewManager manager;

    public StoreReview(Activity activity0) {
        this.context = activity0;
        this.manager = ReviewManagerFactory.create(activity0);
    }

    public static boolean canRequestStoreReview() {
        return true;
    }

    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFeature
    public String getFeatureName() {
        return "Store Review";
    }

    static void lambda$launchReviewFlow$2(ILaunchReviewFlowListener iStoreReview$ILaunchReviewFlowListener0, Void void0) {
        iStoreReview$ILaunchReviewFlowListener0.onSuccess();
    }

    static void lambda$launchReviewFlow$3(ILaunchReviewFlowListener iStoreReview$ILaunchReviewFlowListener0, Exception exception0) {
        iStoreReview$ILaunchReviewFlowListener0.onFailure(exception0.getMessage());
    }

    static void lambda$requestReviewFlow$0(IRequestReviewInfoListener iStoreReview$IRequestReviewInfoListener0, ReviewInfo reviewInfo0) {
        iStoreReview$IRequestReviewInfoListener0.onSuccess(reviewInfo0);
    }

    static void lambda$requestReviewFlow$1(IRequestReviewInfoListener iStoreReview$IRequestReviewInfoListener0, Exception exception0) {
        iStoreReview$IRequestReviewInfoListener0.onFailure(exception0.getMessage());
    }

    private void launchReviewFlow(ReviewInfo reviewInfo0, ILaunchReviewFlowListener iStoreReview$ILaunchReviewFlowListener0) {
        Task task0 = this.manager.launchReviewFlow(this.context, reviewInfo0);
        task0.addOnSuccessListener(new StoreReview..ExternalSyntheticLambda2(iStoreReview$ILaunchReviewFlowListener0));
        task0.addOnFailureListener(new StoreReview..ExternalSyntheticLambda3(iStoreReview$ILaunchReviewFlowListener0));
    }

    private void requestReviewFlow(IRequestReviewInfoListener iStoreReview$IRequestReviewInfoListener0) {
        Task task0 = this.manager.requestReviewFlow();
        task0.addOnSuccessListener(new StoreReview..ExternalSyntheticLambda0(iStoreReview$IRequestReviewInfoListener0));
        task0.addOnFailureListener(new StoreReview..ExternalSyntheticLambda1(iStoreReview$IRequestReviewInfoListener0));
    }

    @RunOnUiThread
    public void requestStoreReview(IRequestStoreReviewListener iStoreReview$IRequestStoreReviewListener0) {
        this.requestReviewFlow(new IRequestReviewInfoListener() {
            @Override  // com.voxelbusters.android.essentialkit.features.extras.IStoreReview$IRequestReviewInfoListener
            public void onFailure(String s) {
                IRequestStoreReviewListener iStoreReview$IRequestStoreReviewListener0 = iStoreReview$IRequestStoreReviewListener0;
                if(iStoreReview$IRequestStoreReviewListener0 != null) {
                    iStoreReview$IRequestStoreReviewListener0.onFailure(s);
                }
            }

            @Override  // com.voxelbusters.android.essentialkit.features.extras.IStoreReview$IRequestReviewInfoListener
            public void onSuccess(ReviewInfo reviewInfo0) {
                com.voxelbusters.android.essentialkit.features.extras.StoreReview.1.1 storeReview$1$10 = new ILaunchReviewFlowListener() {
                    @Override  // com.voxelbusters.android.essentialkit.features.extras.IStoreReview$ILaunchReviewFlowListener
                    public void onFailure(String s) {
                        if(com.voxelbusters.android.essentialkit.features.extras.StoreReview.1.this.val$listener != null) {
                            com.voxelbusters.android.essentialkit.features.extras.StoreReview.1.this.val$listener.onFailure(s);
                        }
                    }

                    @Override  // com.voxelbusters.android.essentialkit.features.extras.IStoreReview$ILaunchReviewFlowListener
                    public void onSuccess() {
                        if(com.voxelbusters.android.essentialkit.features.extras.StoreReview.1.this.val$listener != null) {
                            com.voxelbusters.android.essentialkit.features.extras.StoreReview.1.this.val$listener.onSuccess();
                        }
                    }
                };
                StoreReview.this.launchReviewFlow(reviewInfo0, storeReview$1$10);
            }
        });
    }
}

