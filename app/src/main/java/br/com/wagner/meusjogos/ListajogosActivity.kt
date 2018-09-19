package br.com.wagner.meusjogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import br.com.wagner.meusjogos.adapter.JogosAdapter
import br.com.wagner.meusjogos.detalheJogo.DetalheActivity
import br.com.wagner.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_listajogos.*

class ListajogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listajogos)

        val meusJogos = getJogos()

        rvJogos.adapter = JogosAdapter(this, meusJogos, {jogo ->
            val detalheIntent = Intent(this, DetalheActivity::class.java)

            detalheIntent.putExtra("JOGO", jogo)
            startActivity(detalheIntent)
        })
        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.mega_man,
                        "Mega Man",
                        2018,
                        "Nao informado"),
                Jogo(R.drawable.sonic,
                        "Sonic",
                        2016,
                        "Tails"),
                Jogo(R.drawable.starwars,
                        "Star Wars",
                        2018,
                        "Lego"),
                Jogo(R.drawable.batman,
                        "Batman",
                        2015,
                        "Robim"),
                Jogo(R.drawable.mortal,
                        "Mortal Kombat",
                        2019,
                        "Sub Zero Wins"),
                Jogo(R.drawable.god,
                        "God Of War",
                        2017,
                        "Kratos")
        )


    }


}
