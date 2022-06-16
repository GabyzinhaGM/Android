package br.com.zup.biblioteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.biblioteca.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recuperarDados()
    }

    private fun recuperarDados() {
        val nomeAutor = intent.getStringExtra("NOMEAUTOR").toString()
        val titulo = intent.getStringExtra("TITULO").toString()
        val numeroPaginas = intent.getStringExtra("NUMERODEPAGINAS").toString().toInt()
        val statusCadastro = intent.getStringExtra("STATUSCADASTRO").toString()
        exibirDados(nomeAutor, titulo, numeroPaginas, statusCadastro)
    }

    private fun exibirDados(autor: String, titulo: String, paginas: Int, statusCadastro: String) {
        val mensagem = "Autor: ${autor}, titulo: ${titulo}, paginas: ${paginas}"
        binding.tvCadastro.text = statusCadastro
        binding.tvDados.text = mensagem
    }


}



