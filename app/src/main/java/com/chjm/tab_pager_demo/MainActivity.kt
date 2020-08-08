package com.chjm.tab_pager_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
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



    }
}