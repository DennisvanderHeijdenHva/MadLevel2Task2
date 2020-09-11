package com.example.madlevel2task2

data class Question (
    var name: String,
    var answer: Boolean
) {
    companion object {
        val QUESTION_NAMES = arrayOf(
            "A 'val' and 'var' are the same?",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin corresponds to a void in Java.",
            "In Kotlin 'when' replaces the 'switch' operators in Java."
        )

        val ANSWERS = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}