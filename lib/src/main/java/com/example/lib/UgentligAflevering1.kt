package com.example.lib

import kotlin.String

fun main(){
    // Opgave 1.
    println("Please enter your age: ")
    val inputAge: Int = readLine()!!.toInt()

    println(exercise1(inputAge))


    // Opgave 2.
    val max : Int = getMax(1,18,8);
    val min : Int = getMin(1,18,-8);

    println(max)
    println(min)


    // Opgave 3.
    val numberList: List<Int> = listOf(4,7,8,3,1)
    println(calculateAverage(numberList))


    // Opgave 4.
    val inputCPR: String = "1210899232"
    println(validCPR(inputCPR))


    // Opgave 5.
    printNumbers()


    // Opgave 6.
    println(nameProgram("Johanne Schledermann Jeilsø"))


    // Opgave 7.
    println(calculateGrade(87))


    // Opgave 8.
    val wordsList = listOf("solskin", "efterårsstorm", "vind", "forårsblomstring", "vindstorm")
    val minimumLength = 7

    val result = filterWordsByLength(wordsList, minimumLength)
    println(result)

}


/* ------- 1 -------
A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
Let the user input their age.

Get inspiration in the terminal output below:
Please enter your age
6
You are not eligible to vote
 */

fun exercise1(age: Int): String{
    if(age >= 18){
        return "You are elligible to vote"
    } else {
        return "You are NOT elligible to vote"
    }
}

/* 2.
Define two functions to print the maximum and the minimum number respectively among three numbers

Copy
val max : Int = getMax(1,18,8);

val min : Int = getMin(1,18,-8);

println(max); //18
println(min); //-8

 */

fun getMin(a: Int, b: Int, c: Int ): Int{
    return minOf(a, b, c)
}

fun getMax(a: Int, b: Int, c: Int ): Int{
    return maxOf(a, b, c)
}


/* 3.
Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
 */
fun calculateAverage(list: List<Int>): Double{
   return list.average()
}

// OR

fun Average(numbers: List<Int>): Double {
    var sum: Double = 0.0
    for (num in numbers) {
        sum += num
    }
    val average: Double = sum / numbers.size
    return average
}


/*4.
Write a method that returns if a user has input a valid CPR number.

A valid CPR number has:
10 Digits.
The first 2 digits are not above 31.
The middle 2 digits are not above 12.
The method returns true if the CPR number is valid, false if it is not.
 */
fun validCPR(cpr: String): Boolean{
    val day = cpr.substring(0, 2).toInt()
    val month = cpr.substring(2, 4).toInt()
    val checkLength = cpr.length

    return when {
        checkLength != 10 -> false
        day >= 31 -> false
        month >= 12 -> false
        else -> true
    }
}

/* 5.
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */
fun printNumbers (){
    for(i in 1..100){
        if (i % 3 == 0){
            println("Fizz")
        } else if (i % 5 == 0){
            println("Buzz")
        } else if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else {
            println(i)
        }
    }
}

/*6.
Write a program that takes your full name as input and displays the abbreviations of the first and middle names,
except the last name which is displayed as it is.

For example, if your name is Robert Brett Roser, then the output should be R.B. Roser. Or Benjamin Dalsgaard Hughes will be B.D. Hughes
 */

fun nameProgram (name: String): String{
    val splitName: List<String> = name.split(" ")

    val firstName: String = splitName[0]
    val middleName: String = splitName[1]
    val lastName: String = splitName[2]

    val firstLetterOfFirstName: String = firstName.take(1)
    val firstLetterOfMiddelName: String = middleName.take(1)

    return "$firstLetterOfFirstName. $firstLetterOfMiddelName. $lastName"
}

/* 7.
Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american letter grade.

Implement a function calculateGrade that takes an integer parameter representing the grade,
and returns a string representing the letter grade according to the following scale:
    90-100: "A"
    80-89: "B"
    70-79: "C"
    60-69: "D"
    Below 60: "F"
 */

fun calculateGrade (procent: Int): String{
    when (procent) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        in 60..69 -> {
            return "D"
        }
        else -> {
            return "F"
        }
    }
}

/* 8.
Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
and returns a list containing only the words that have a length greater than or equal to the specified minimum length.

Use filter function and lambda expressions.
 */

fun filterWordsByLength(words: List<String>, minimumLength: Int): List<String> {
    return words.filter { it.length >= minimumLength }
}

















