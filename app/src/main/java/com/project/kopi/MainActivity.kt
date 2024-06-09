package com.project.kopi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.kopi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContent()
    }

    private fun setContent() {
        binding.apply {
            ivArabica.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, coffeeImageList[0]))
            tvArabicaTitle.text = coffeeNameList[0]
            tvArabicaDesc.text = coffeeDescList[0]

            layoutItemArabica.setOnClickListener {
                val iDetail = Intent(this@MainActivity, DetailActivity::class.java)
                iDetail.putExtra(DetailActivity.EXTRA_IMAGE, coffeeImageList[0])
                iDetail.putExtra(DetailActivity.EXTRA_TITLE, coffeeNameList[0])
                iDetail.putExtra(DetailActivity.EXTRA_DESC, coffeeDescList[0])
                startActivity(iDetail)
            }

            ivRobusta.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, coffeeImageList[1]))
            tvRobustaTitle.text = coffeeNameList[1]
            tvRobustaDesc.text = coffeeDescList[1]

            layoutItemRobusta.setOnClickListener {
                val iDetail = Intent(this@MainActivity, DetailActivity::class.java)
                iDetail.putExtra(DetailActivity.EXTRA_IMAGE, coffeeImageList[1])
                iDetail.putExtra(DetailActivity.EXTRA_TITLE, coffeeNameList[1])
                iDetail.putExtra(DetailActivity.EXTRA_DESC, coffeeDescList[1])
                startActivity(iDetail)
            }
        }
    }

    companion object {
        private val coffeeImageList = listOf(
            R.drawable.arabica,
            R.drawable.robusta
        )

        private val coffeeNameList = listOf(
            "Arabica", "Robusta"
        )

        private val coffeeDescList = listOf(
            "Kopi Arabika adalah salah satu varietas kopi yang paling populer dan banyak dikonsumsi di seluruh dunia. Kopi Arabika berasal dari spesies kopi Coffea arabica. Jenis kopi ini dikenal memiliki rasa yang lebih lembut, sedikit asam, dan aroma yang kompleks dibandingkan dengan jenis kopi lainnya, seperti kopi Robusta. Tanaman kopi Arabika tumbuh terutama di ketinggian yang tinggi dan membutuhkan iklim subtropis atau tropis untuk berkembang dengan baik. Berbagai negara seperti Ethiopia, Kenya, Kosta Rika, Kolombia, Brazil, dan banyak lagi, memproduksi kopi Arabika dengan karakteristik rasa yang unik tergantung pada wilayah tempat kopi tersebut ditanam. Kopi Arabika sering dianggap sebagai kopi kelas atas karena kualitasnya yang tinggi dan beragamnya varietas rasa yang ditawarkannya.",
            "Kopi Robusta adalah salah satu varietas kopi yang juga populer di seluruh dunia. Berbeda dengan kopi Arabika, kopi Robusta berasal dari spesies kopi Coffea canephora. Tanaman kopi Robusta tumbuh lebih baik di daerah dengan ketinggian rendah dan memiliki toleransi yang lebih baik terhadap penyakit dan kondisi lingkungan yang tidak ideal, seperti curah hujan tinggi dan suhu yang lebih panas. Kopi Robusta memiliki rasa yang lebih kuat, pahit, dan berkadar kafein lebih tinggi daripada kopi Arabika. Itulah sebabnya kopi Robusta sering digunakan dalam campuran kopi instan dan kopi espresso untuk memberikan tubuh yang lebih kuat dan crema yang lebih tebal. Beberapa negara penghasil kopi Robusta terbesar termasuk Vietnam, Brasil, Indonesia, dan beberapa negara di Afrika Barat seperti Pantai Gading dan Uganda. Meskipun kopi Robusta sering dianggap sebagai kopi dengan kualitas yang lebih rendah dibandingkan Arabika, namun dengan pemrosesan yang baik, kopi Robusta juga dapat menghasilkan secangkir kopi yang enak dan memuaskan."
        )
    }
}