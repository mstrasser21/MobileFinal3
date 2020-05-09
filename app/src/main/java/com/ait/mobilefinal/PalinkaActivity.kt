package com.ait.mobilefinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ait.mobilefinal.adapter.QuestionAdapter
import com.ait.mobilefinal.data.Question
import kotlinx.android.synthetic.main.activity_palinka.*

class PalinkaActivity : AppCompatActivity() {

    lateinit var questionAdapter : QuestionAdapter

    var score = 0

        var QUIZ_LIST = mutableListOf<Question>(
            Question("Question0", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question1", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question2", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question3", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question4", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question5", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4),
            Question("Question6", "Answer1", "Answer2", "Answer3", "Answer4", 1, 2, 3, 4)
            )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palinka)

        initRecyclerView()

        btnDone.setOnClickListener{
            if (score < 4){
                //go to some result screen
            }
            if (score >= 4 && score < 10){
                //something else
            }
            if (score > 10){
                //something else
            }
        }
    }

    private fun initRecyclerView(){

        questionAdapter = QuestionAdapter(this, QUIZ_LIST)
        recyclerItem.adapter = questionAdapter

    }

//    private fun caluculateScore(newscore : Int){
//        this.score += newscore
//
//    }
}
