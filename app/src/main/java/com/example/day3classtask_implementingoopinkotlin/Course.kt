package com.example.day3classtask_implementingoopinkotlin

data class Course(var courseName: String, var courseCode: String, var credits: Int){

//    override fun copy(){ // facing some error!!
//    }

    override fun toString(): String {
        print("Overrode func")
        return super.toString()
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

}
