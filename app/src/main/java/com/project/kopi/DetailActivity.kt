package com.project.kopi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.kopi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private val coffeeImage by lazy { intent.getIntExtra(EXTRA_IMAGE, 0) }
    private val coffeeTitle by lazy { intent.getStringExtra(EXTRA_TITLE) }
    private val coffeeDesc by lazy { intent.getStringExtra(EXTRA_DESC) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toolbar.setNavigationOnClickListener { finish() }

            ivBackdrop.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, coffeeImage))
            ivPoster.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, coffeeImage))
            tvTitle.text = coffeeTitle
            tvDesc.text = coffeeDesc
        }
    }

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DESC = "extra_desv"
    }
}