<h1>Kotlin OOP Project</h1>

<h2>Description</h2>
This simple Kotlin project demonstrates Object-Oriented Programming (OOP) principles using classes, inheritance, data classes, abstract classes, and enums. The program includes the following components:<br>
- Person Class: A base class representing a person with name and age attributes.<br>
- Student Class: Inherits from Person and includes student-specific properties like ID and grade.<br>
- ScholarshipEligible Class: An abstract subclass of Student that determines if a student is eligible for a scholarship.<br>
- Course Class: A data class representing a university course with a name, code, and credit hours.<br>
- DepartmentType Enum: Defines different university departments with their respective credit limits.<br>
- Main Function: Initializes and demonstrates the use of the Course class.<br>

<h2>Project Structure</h2>
├── src/main/kotlin/com/example/day3classtask_implementingoopinkotlin<br>
│   ├── Main.kt (Entry point of the program)<br>
│   ├── Person.kt (Defines Person, Student, and ScholarshipEligible classes)<br>
│   ├── Course.kt (Defines the Course data class)<br>
│   ├── DepartmentType.kt (Defines DepartmentType Enum)<br>

<h2>How to Run the Project</h2>
<h3>Prerequisites:</h3>
- Android Studio (Latest version recommended)<br>
- Kotlin Plugin installed<br>
- JDK 17+ (Recommended for modern Kotlin development)<br>
- Gradle (Handled by Android Studio)<be>

<h3>Steps to Run:</h3>
1- Clone or Download the Repository<br>
    git clone <repository_url><br>
2- Open the Project in Android Studio<br>
    Go to File > Open and select the project folder.<br>
3- Sync Gradle<br>
    Click on "Sync Now" if prompted.<br>
4- Run the Program<br>
    Open Main.kt and click the Run button (▶) or use:
    ./gradlew run<br>

<h2>Notes</h2>
The copy() method in Course.kt is commented out due to an error (I'm working on it).

