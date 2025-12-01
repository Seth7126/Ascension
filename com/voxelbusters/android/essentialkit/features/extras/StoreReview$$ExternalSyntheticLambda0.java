package com.voxelbusters.android.essentialkit.features.extras;

import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.tasks.OnSuccessListener;

public final class StoreReview..ExternalSyntheticLambda0 implements OnSuccessListener {
    public final IRequestReviewInfoListener f$0;

    public StoreReview..ExternalSyntheticLambda0(IRequestReviewInfoListener iStoreReview$IRequestReviewInfoListener0) {
        this.f$0 = iStoreReview$IRequestReviewInfoListener0;
    }

    public final void onSuccess(Object object0) {
        StoreReview.lambda$requestReviewFlow$0(this.f$0, ((ReviewInfo)object0));
    }
}

