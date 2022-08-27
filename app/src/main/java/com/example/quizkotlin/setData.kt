package com.example.quizappkotlin

object setData {

    const val name: String = "name"
    const val score: String = "score"

    fun getQuestion(): ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Who invented the Telephone?",

            "Thomas",
            "Mars",
            "Alexander Fleming",
            "Alexander Graham Bell",
            4
        )
        var question2 = QuestionData(
            2,
            "Which planet in our solar system is known as the Blue Planet?",

            "Earth",
            "Mercury",
            "Sun",
            "Jupiter",
            1
        )
        var question3 = QuestionData(
            3,
            "What is the name of the largest moon of Saturn?",

            "Neptune",
            "Titan",
            "Neptune",
            "None of the above",
            2
        )
        var question4 = QuestionData(
            4,
            "Who was the first President of India ?",

            "Abdul Kalam",
            "Lal Bahadur Shastri",
            "Dr. Rajendra Prasad",
            "Zakir Hussain",
            3
        )

        var question5 = QuestionData(
            5,
            "How many hours are there in a day?",

            "25",
            "12",
            "36",
            "24",
            4
        )

        var question6 = QuestionData(
            5,
            "How many minutes are there in an hour?",

            "60",
            "12",
            "100",
            "50",
            1
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6
        )

        return que
    }
}