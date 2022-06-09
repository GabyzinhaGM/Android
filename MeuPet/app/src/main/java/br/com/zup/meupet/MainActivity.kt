package br.com.zup.meupet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.meupet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState:   Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btMensagem.setOnClickListener {
            recuperarDadosUsuario()

        }
        binding.btDetalhe.setOnClickListener {

            recuperarDadosUsuario()

        }


    }

    private fun enviarMensagem(mensagem: String) {
        val intent = Intent(this, DetalheActivity::class.java).apply {
            putExtra("MENSAGEM", mensagem)

        }
        startActivity(intent)

    }

    private fun recuperarDadosUsuario() {
        var mensagem = binding.etNomePet.text.toString()
        if (mensagem.isNotEmpty()) {
            enviarMensagem(mensagem)
        }

    }
}


