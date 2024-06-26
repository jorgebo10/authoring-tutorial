/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-application-conventions")
    id("org.example.license")  // Apply the license plugin
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}

println("BUILD SCRIPT: This is executed during the configuration phase")

tasks.register("task1"){
    println("REGISTER TASK1: This is executed during the configuration phase")
}

tasks.register("task2"){
    println("REGISTER TASK2: This is executed during the configuration phase")
}

tasks.named("task1"){
    println("NAMED TASK1: This is executed during the configuration phase")
    doFirst {
        println("NAMED TASK1 - doFirst: This is executed during the execution phase")
    }
    doLast {
        println("NAMED TASK1 - doLast: This is executed during the execution phase")
    }
}

tasks.named("task2"){
    println("NAMED TASK2: This is executed during the configuration phase")
    doFirst {
        println("NAMED TASK2 - doFirst: This is executed during the execution phase")
    }
    doLast {
        println("NAMED TASK2 - doLast: This is executed during the execution phase")
    }
}