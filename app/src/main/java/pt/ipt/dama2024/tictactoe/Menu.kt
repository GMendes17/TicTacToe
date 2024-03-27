package pt.ipt.dama2024.tictactoe
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        var btn1 = findViewById<Button>(R.id.Btn1)
        btn1.setOnClickListener {
            Jogar()
        }

    }
    private fun Jogar(){
        val jogo = Intent(this,Jogo::class.java)
        startActivity(jogo)
    }

}
