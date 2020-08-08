package com.chjm.tab_pager_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.cigar,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()



        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Reselected ${tab?.text}", Toast.LENGTH_SHORT).show()


            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Unselected ${tab?.text}", Toast.LENGTH_SHORT).show()

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
        })



    }
}