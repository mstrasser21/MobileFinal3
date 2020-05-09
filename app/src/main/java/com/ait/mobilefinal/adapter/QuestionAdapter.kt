package com.ait.mobilefinal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ait.mobilefinal.PalinkaActivity
import com.ait.mobilefinal.R
import com.ait.mobilefinal.data.Question
import kotlinx.android.synthetic.main.question_row.view.*

class QuestionAdapter: RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    var allQuestions = mutableListOf<Question>()

    var context : Context

    constructor(context: Context, listItems: List<Question>) {
        this.context = context
        allQuestions.addAll(listItems)
    }

    override fun getItemCount(): Int {
        return allQuestions.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        var itemView = LayoutInflater.from(context).inflate(
            R.layout.question_row, parent, false
        )

        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentQ = allQuestions[position]


        holder.tvQuestion.text = currentQ.question
        holder.btnOpt1.text = currentQ.answer1
        holder.btnOpt2.text = currentQ.answer2
        holder.btnOpt3.text = currentQ.answer3
        holder.btnOpt4.text = currentQ.answer4


        holder.btnOpt1.setOnClickListener {
            (context as PalinkaActivity).score +=  currentQ.points1
        }

        holder.btnOpt2.setOnClickListener {
            (context as PalinkaActivity).score +=  currentQ.points2
        }
        holder.btnOpt3.setOnClickListener {
            (context as PalinkaActivity).score +=  currentQ.points3
        }
        holder.btnOpt4.setOnClickListener {
            (context as PalinkaActivity).score +=  currentQ.points4
        }



    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvQuestion = itemView.tvQuestion
        val btnOpt1 = itemView.btnOpt1
        val btnOpt2 = itemView.btnOpt2
        val btnOpt3 = itemView.btnOpt3
        val btnOpt4 = itemView.btnOpt4

    }

}
