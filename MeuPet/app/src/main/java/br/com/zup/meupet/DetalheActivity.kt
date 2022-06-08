package br.com.zup.meupet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.meupet.databinding.ActivityDetalheBinding
import br.com.zup.meupet.databinding.ActivityMainBinding

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)
        exibirMensagem()
    }

    private fun exibirMensagem() {
        val mensagemRecebida = intent.getStringExtra("MENSAGEM").toString()
        binding.tvDetalhe.text = mensagemRecebida.toString()
    }

}