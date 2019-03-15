package br.com.dev.application

import br.com.dev.resource.enumerator.Role
import br.com.dev.resource.model.Employee

class SalaryCalculator {

    fun calculate(employee: Employee): Double {
        if (employee.role == Role.DBA) {
            if (employee.salary > 2500.0) {
                return employee.salary * 0.75
            } else {
                return employee.salary * 0.85
            }
        } else if (employee.role == Role.DESENVOLVEDOR) {
            if (employee.salary > 3000.0) {
                return employee.salary * 0.8
            } else {
                return employee.salary * 0.9
            }
        }
        return 0.0
    }
}
