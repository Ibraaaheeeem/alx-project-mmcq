package com.haneef.medquiz

class MockSubject(val name: String, var num_questions: Int, var level:Int, var score: Int){
    fun setQuestionCount(count: Int) {
        num_questions = count
    }
}