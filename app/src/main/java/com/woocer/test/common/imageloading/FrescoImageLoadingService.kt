package com.woocer.test.common.imageloading

import android.widget.ImageView
import com.facebook.drawee.view.SimpleDraweeView
import javax.inject.Inject

class FrescoImageLoadingService @Inject constructor() : ImageLoadingService {

    override fun loadImage(imageView: ImageView, url: String?) {
        require(imageView is SimpleDraweeView){
            "com.woocer.test.data.remote.dto.response.Image view should be an instance of SimpleDraweeView"
        }
        imageView.setImageURI(url)
    }
}