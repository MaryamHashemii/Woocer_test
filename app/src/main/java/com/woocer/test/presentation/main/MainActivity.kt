package com.woocer.test.presentation.main

import androidx.activity.viewModels
import androidx.core.view.*
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import dagger.hilt.android.AndroidEntryPoint
import com.woocer.test.R
import com.woocer.test.base.ObserverDataBindingActivity
import com.woocer.test.databinding.ActivityMainBinding
import com.woocer.test.util.extensions.setupWithNavController


const val REQUEST_CODE_ENABLE_GPS = 1001

@AndroidEntryPoint
class MainActivity : ObserverDataBindingActivity<ActivityMainBinding>(R.layout.activity_main) {


    private var currentNavController: LiveData<NavController>? = null
    private val onDestinationChangedListener =
        NavController.OnDestinationChangedListener { controller, destination, arguments ->
        }



    override fun setupViews() {
        setUpBottomNavigationBar()

    }


    override fun observe() {

    }

    private fun setUpBottomNavigationBar() {
        // TODO: 04.10.21 update navigation to 2.4.0 and remove this code
        val navGraphIds = listOf(
            R.navigation.product_nav_graph,
            R.navigation.basket_nav_graph
        )


        val controller = binding.bottomNavigation.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = binding.navHostFragment.id,
            intent = intent
        )

        controller.observe(this) { navController ->

            // unregister old onDestinationChangedListener, if it exists
            currentNavController?.value?.removeOnDestinationChangedListener(
                onDestinationChangedListener
            )

            // add onDestinationChangedListener to the new NavController
            navController.addOnDestinationChangedListener(onDestinationChangedListener)
        }

        currentNavController = controller
    }


    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }


}