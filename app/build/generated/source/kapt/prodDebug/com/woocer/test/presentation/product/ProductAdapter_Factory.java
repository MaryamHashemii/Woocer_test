// Generated by Dagger (https://dagger.dev).
package com.woocer.test.presentation.product;

import com.woocer.test.common.imageloading.ImageLoadingService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductAdapter_Factory implements Factory<ProductAdapter> {
  private final Provider<ImageLoadingService> imageLoadingServiceProvider;

  public ProductAdapter_Factory(Provider<ImageLoadingService> imageLoadingServiceProvider) {
    this.imageLoadingServiceProvider = imageLoadingServiceProvider;
  }

  @Override
  public ProductAdapter get() {
    return newInstance(imageLoadingServiceProvider.get());
  }

  public static ProductAdapter_Factory create(
      Provider<ImageLoadingService> imageLoadingServiceProvider) {
    return new ProductAdapter_Factory(imageLoadingServiceProvider);
  }

  public static ProductAdapter newInstance(ImageLoadingService imageLoadingService) {
    return new ProductAdapter(imageLoadingService);
  }
}