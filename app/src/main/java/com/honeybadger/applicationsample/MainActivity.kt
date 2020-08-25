package com.honeybadger.applicationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.honeybadger.applicationsample.fragment.AccountFragment
import com.honeybadger.applicationsample.fragment.HomeFragment
import com.honeybadger.applicationsample.fragment.NotificationFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val ID_HOME =1
        private const val ID_NOTIFICATION=2
        private const val ID_ACCOUNT=3
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.add(MeowBottomNavigation.Model(1, R.drawable.check))
        bottom_navigation.add(MeowBottomNavigation.Model(2, R.drawable.mobile))
        bottom_navigation.add(MeowBottomNavigation.Model(3, R.drawable.bank))

        val home = HomeFragment.newInstance()
        openFragment(home)

        bottom_navigation.setOnShowListener {
            val name = when (it.id) {
                ID_HOME -> "HOME"
                ID_NOTIFICATION -> "NOTIFICATION"
                ID_ACCOUNT -> "ACCOUNT"
                else -> "ACCOUNT"
            }
        }

        bottom_navigation.setOnClickMenuListener {
            val name = when(it.id){
                ID_HOME -> {
                    val home = HomeFragment.newInstance()
                    openFragment(home)
                }
                ID_NOTIFICATION ->{
                    val notification = NotificationFragment.newInstance()
                    openFragment(notification)
                }
                ID_ACCOUNT -> {
                    val account = AccountFragment.newInstance()
                    openFragment(account)
                }
                else ->{
                    val account = AccountFragment.newInstance()
                    openFragment(account)
                }
            }
        }
    }

    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container_main_layout,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
