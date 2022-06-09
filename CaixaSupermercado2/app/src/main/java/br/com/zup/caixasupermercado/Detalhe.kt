package br.com.zup.caixasupermercado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.caixasupermercado.databinding.ActivityDetalheBinding
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding

class Detalhe : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirDados()
    }

    private fun calcularValorTotal(quantidade: Int, valor: Int): Int {
        return (valor * quantidade)
    }

    private fun exibirDados() {
        var nome = intent.getStringExtra("NOME").toString()
        var valor = intent.getStringExtra("VALOR").toString().toInt()
        var quantidade = intent.getStringExtra("QUANTIDADE").toString().toInt()
        binding.tvDetalhe.text =
            "Produto: ${nome} quantidade: ${quantidade}, o valor total é " + calcularValorTotal(
                quantidade,
                valor
            ).toString()
    }


}

