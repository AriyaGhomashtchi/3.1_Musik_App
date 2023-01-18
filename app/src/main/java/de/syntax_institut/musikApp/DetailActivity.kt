package de.syntax_institut.musikApp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import de.syntax_institut.musikApp.databinding.DetailActivityBinding

/**
 * Dies ist die Klasse für das zugehörige Layout detail_activity
 */
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: DetailActivityBinding

    /**
     * Die lifecycle methode onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.detail_activity)

        // Die Informationen werden aus dem intent Objekt geholt
        val image = intent.extras?.getInt("SongCoverid")
        val stringResource = intent.extras?.getInt("Songtitleid")
        val songlenght = intent.extras?.getString("songlenght")

        // Die Informationen werden aus dem intent Objekt geholt
        if (image !=null) {
            binding.ivCoverDetail.setImageResource(image)
        }
        if (stringResource !=null){
            binding.tvTitleDetail.text = getString(stringResource)
        }
        if (songlenght !=null){
            binding.songLenght.text = songlenght
        }

        // Die Informationen werden zugewiesen (nach Test auf null)
        // TODO Schreibe hier deinen Code
    }
}