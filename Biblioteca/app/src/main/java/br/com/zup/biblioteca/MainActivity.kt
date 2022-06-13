package br.com.zup.biblioteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.biblioteca.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btDisponivel.setOnClickListener {
            pegarDados("disponível")
        }

        binding.btRetirado.setOnClickListener {
            pegarDados("retirado")
        }

    }

    private fun pegarDados(statusCadastro: String) {
        val nomeAutor = binding.etNomeDoAutor.text.toString()
        val titulo = binding.etTituloDoLivro.text.toString()
        val numeroDePaginas = binding.etNumeroDePaginas.text.toString()
        enviarDados(nomeAutor, titulo, numeroDePaginas, statusCadastro)
    }

    private fun enviarDados(
        nomeAutor: String,
        titulo: String,
        numeroDePaginas: String,
        status: String
    ) {
        val intent = Intent(this, CadastroActivity::class.java).apply {
            putExtra("NOMEAUTOR", nomeAutor)
            putExtra("TITULO", titulo)
            putExtra("NUMERODEPAGINAS", numeroDePaginas)
            putExtra("STATUSCADASTRO", status)
        }
        startActivity(intent)
    }
}

