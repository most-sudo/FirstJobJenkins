pipeline {
    agent any
    stages {
        stage('Compile & Run Main') {
            steps {
                bat 'javac src\\Main.java'
                bat 'java -cp src Main'
            }
        }

        stage('Compile Merci (MathTools)') {
            steps {
                bat 'javac src\\ma\\SupMTI\\TP1\\dev\\MathTools.java'
            }
        }

        stage('Compile DeRien (Calculatrice)') {
            steps {
                bat 'javac src\\ma\\SupMTI\\TP1\\dev\\Calculatrice.java'
            }
        }
    }
}