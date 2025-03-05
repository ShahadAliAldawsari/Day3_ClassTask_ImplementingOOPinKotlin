package com.example.day3classtask_implementingoopinkotlin

enum class DepartmentType(var maxCredits: Int) {
    COMPUTER_SCIENCE (maxCredits=90),
    MATHEMATICS (maxCredits=83),
    PHYSICS (maxCredits=70),
    ENGINEERING (maxCredits=95),;

    fun allowedToRegister(studentCredit: Int):Boolean{
        return studentCredit>=maxCredits
    }
}