package com.woocer.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woocer.test.databinding.ActivityLoginBindingImpl;
import com.woocer.test.databinding.ActivityMainBindingImpl;
import com.woocer.test.databinding.FragmentBasketBindingImpl;
import com.woocer.test.databinding.FragmentLoginBindingImpl;
import com.woocer.test.databinding.FragmentProductBindingImpl;
import com.woocer.test.databinding.FragmentSplashBindingImpl;
import com.woocer.test.databinding.ItemProductBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTBASKET = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTPRODUCT = 5;

  private static final int LAYOUT_FRAGMENTSPLASH = 6;

  private static final int LAYOUT_ITEMPRODUCT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.fragment_basket, LAYOUT_FRAGMENTBASKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.fragment_product, LAYOUT_FRAGMENTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.woocer.test.R.layout.item_product, LAYOUT_ITEMPRODUCT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASKET: {
          if ("layout/fragment_basket_0".equals(tag)) {
            return new FragmentBasketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_basket is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCT: {
          if ("layout/fragment_product_0".equals(tag)) {
            return new FragmentProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCT: {
          if ("layout/item_product_0".equals(tag)) {
            return new ItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_product is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_login_0", com.woocer.test.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.woocer.test.R.layout.activity_main);
      sKeys.put("layout/fragment_basket_0", com.woocer.test.R.layout.fragment_basket);
      sKeys.put("layout/fragment_login_0", com.woocer.test.R.layout.fragment_login);
      sKeys.put("layout/fragment_product_0", com.woocer.test.R.layout.fragment_product);
      sKeys.put("layout/fragment_splash_0", com.woocer.test.R.layout.fragment_splash);
      sKeys.put("layout/item_product_0", com.woocer.test.R.layout.item_product);
    }
  }
}
