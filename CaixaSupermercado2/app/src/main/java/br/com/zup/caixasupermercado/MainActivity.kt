package br.com.zup.caixasupermercado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcularValor.setOnClickListener {
            pegarDados()

        }
    }

    private fun enviarDados(nome: String, quantidade: String, valor: String) {
        val intent = Intent(this, Detalhe::class.java).apply {
            putExtra("NOME", nome)
            putExtra("QUANTIDADE", quantidade)
            putExtra("VALOR", valor)

        }
        startActivity(intent)
    }

    private fun pegarDados() {
        var nome = binding.etNomeProduto.text.toString()
        var quantidade = binding.etQuantidadeProduto.text.toString()
        var valor = binding.etValorProduto.text.toString()
        enviarDados(nome, quantidade, valor)
    }


}




