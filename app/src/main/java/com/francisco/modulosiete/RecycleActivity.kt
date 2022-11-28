package com.francisco.modulosiete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.francisco.modulosiete.databinding.ActivityRecycleBinding

class RecycleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecycleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        initItem()
    }

    private fun initItem(){
        val recyclerView = binding.data
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterViewHolder(this,Source.dataList)
        recyclerView.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}