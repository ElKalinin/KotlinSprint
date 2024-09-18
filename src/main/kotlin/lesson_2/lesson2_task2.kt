package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val numberOfInterns = 30
    val employeeSalary = 30000
    val internSalary = 20000

    val employeePaymentsPerMonth = numberOfEmployees * employeeSalary
    val internPaymentsPerMonth = numberOfInterns * internSalary
    val fullPaymentsPerMonth = employeePaymentsPerMonth + internPaymentsPerMonth
    val averageSalary = fullPaymentsPerMonth / (numberOfEmployees + numberOfInterns)

    println(employeePaymentsPerMonth)
    println(fullPaymentsPerMonth)
    println(averageSalary)

}