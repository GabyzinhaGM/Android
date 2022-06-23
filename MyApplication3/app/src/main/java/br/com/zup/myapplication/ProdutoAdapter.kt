package br.com.zup.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdutoAdapter(val produtos: List<Produto>) :
    RecyclerView.Adapter<ProdutoAdapter.ProdutoHolder>() {

    class ProdutoHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvNome: TextView = itemView.findViewById(R.id.tvNomeProduto)

        private val tvPreco: TextView = itemView.findViewById(R.id.tvValorProduto)
        fun setProduto(produto: Produto) {
            tvNome.text = produto.nome
            tvPreco.text = produto.preco.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_compras, parent, false)
        val viewHolder = ProdutoHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ProdutoHolder, position: Int) {
        val produto = produtos[position]
        holder.setProduto(produto)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }
}
