package br.com.zup.minhaidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhaidade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btValida.setOnClickListener {
            recuperarDadosUsuario()
        }

    }

    private fun recuperarDadosUsuario() {
        var nome = binding.etNome.text.toString()
        var idade = binding.etIdade.text.toString().toInt()

        if (idade >= 18) {
            binding.tvMensagem.text = "${nome} é maior de idade, tem ${idade} anos"
        } else {
            binding.tvMensagem.text = "${nome} é menor de idade, tem ${idade} anos"
        }

    }


}

