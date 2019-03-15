package br.com.dev.application

import br.com.dev.resource.enumerator.Role
import br.com.dev.resource.model.Employee
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SalaryCalculatorTest {

    @Test
    fun `Must calculate Developer salary when salary is below the limit`() {
        val salary = SalaryCalculator().calculate(Employee("John", 1000.0, Role.DESENVOLVEDOR))
        assertEquals(0.9 * 1000.0, salary, 0.0000001)
    }

    @Test
    fun `Must calculate Developer salary when salary is over the limit`() {
        val salary = SalaryCalculator().calculate(Employee("John", 4000.0, Role.DESENVOLVEDOR))
        assertEquals(0.8 * 4000.0, salary, 0.0000001)
    }

    @Test
    fun `Must calculate DBA salary when salary is below the limit`() {
        val salary = SalaryCalculator().calculate(Employee("John", 1000.0, Role.DBA))
        assertEquals(0.85 * 1000.0, salary, 0.0000001)
    }

    @Test
    fun `Must calculate DBA salary when salary is over the limit`() {
        val salary = SalaryCalculator().calculate(Employee("John", 3000.0, Role.DBA))
        assertEquals(0.75 * 3000.0, salary, 0.0000001)
    }
}