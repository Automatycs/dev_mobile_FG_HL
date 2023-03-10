package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    const val FLAG_QUESTION: String = "De quel pays est ce drapeau?"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        // 1
        val que1=Question(
            1, "Quel est le nom de cet acteur?",
            R.drawable.rdj,
            "Robert Downey Junior",
            "Chris Evans",
            "Matt Damon",
            "Robert Pattinson",
            1
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "Dans quelle ville se situe ce monument?",
            R.drawable.tokyotour,
            "Kyoto", "Pekin",
            "Tokyo", "Berlin", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Comment s'appelle ce plat?",
            R.drawable.ratatouille,
            "Piperade", "Pot-au-feu",
            "Couscous", "Ratatouille", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Comment s'appelle ce langage de programmation?",
            R.drawable.kotlin,
            "Java", "Kotlin",
            "Haskell", "Swift", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Que s'est exclamé ce savant?",
            R.drawable.archi,
            "Yoplaboum", "Yipee kai yay",
            "Eureka", "Bah dis donc alors", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Quel est son domaine de recherche?",
            R.drawable.curie,
            "Radioactivité", "Evolution",
            "Astronomie", "Electromagnétisme", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "De quel pays viens-t-il?",
            R.drawable.tesla,
            "Serbie", "Croatie",
            "Autriche", "Royaume-uni", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Quel idée était défendue par cet homme?",
            R.drawable.copernick,
            "L'homme descend du singe", "La terre a plus de 3 milliards d'années",
            "Les maladies sont causées par des êtres vivants", "La terre tourne autour du soleil", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Quelle équation physique a-t-il démontré",
            R.drawable.einstein,
            "P = mg", "E = mc²",
            "A² + B² = C²", "b² - 4ac", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Dans quelle ville se trouve ce monument",
            R.drawable.lincolnmemorial,
            "Washington DC", "New York",
            "Atlanta", "Jouy-en-Josas", 1
        )

        questionsList.add(que10)
        return questionsList

    }
}