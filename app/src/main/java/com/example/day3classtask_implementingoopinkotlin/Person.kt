package com.example.day3classtask_implementingoopinkotlin

open class Person (){
    private var name: String = ""
    private var age: Int = 0
    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
    open fun displayInfo(){
        println("The name is: $name\nThe age is $age years old")
    }
}

open class Student: Person(){
    private var studentId: Int = -1
    public var grade: String = ""

    override fun displayInfo() {
        super.displayInfo()
        println("The ID is: $studentId\nThe grade is: $grade")
    }

    public fun getGrade(): String{
        return grade
    }

    abstract class ScholarshipEligible(): Student(){
        fun isEligible ():Boolean{
            return getGrade()=="A"||getGrade()=="B"
        }

    }

}