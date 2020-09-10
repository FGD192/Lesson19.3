package es.fgd192.lesson193

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomView()
    }

    private fun setupBottomView() {
        val navView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val navIds = listOf(
            R.navigation.cities,
            R.navigation.color,
            R.navigation.account
        )

        navView.setupWithNavController(
            navGraphIds = navIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navView,
            intent = intent
        )
    }
}