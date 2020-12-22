package com.ReviewClass12;

public abstract class Employee {
    double salary;
    double bonus;
    public void getPaid(){

    }
    class FullTimeEmployee extends Employee{
        double medicalAllowance;

        @Override
        public void getPaid() {
            super.getPaid();
        }
        class PartTimeEmployee extends Employee{

            @Override
            public void getPaid() {
                super.getPaid();
            }
        }
        class ContractualEmployee extends Employee{

            @Override
            public void getPaid() {
                super.getPaid();
            }
        }
    }
}
