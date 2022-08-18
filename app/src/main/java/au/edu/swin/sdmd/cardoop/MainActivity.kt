package au.edu.swin.sdmd.cardoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = Card()

        val rankSuit = findViewById<TextView>(R.id.rank_suit)
        rankSuit.text = c.getDetails()

        val flip = findViewById<Button>(R.id.flip)
        flip.setOnClickListener {
            c.flip()
            rankSuit.text = c.getDetails()
        }

        val newCard = findViewById<Button>(R.id.newCard)
        newCard.setOnClickListener {
            c = Card()
            rankSuit.text = c.getDetails()
        }


    }
}