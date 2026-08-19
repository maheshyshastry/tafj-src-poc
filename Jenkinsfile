#!/usr/bin/env groovy

pipeline {
    agent any

    tools { 
        maven 'Maven 3.3.9' 
        jdk 'JDK 1.8' 
        git 'GIT'
    }
    
    environment { 
        T24_LIB = 'C:/UTP/UXP-PRI-2017.08.23-02-119/jboss/modules/com/temenos/t24/main/t24lib'
        MAVEN_LOCAL_REPO = 'C:/UTP/UXP-PRI-2017.08.23-02-119/DesignStudioT24-201709.0.0/t24-binaries'
        T24_HOME_PACKAGE = 'C:/UTP/UXP-PRI-2017.08.23-02-119/t24home/default/package'
        T24_HOME = 'C:/UTP/UXP-PRI-2017.08.23-02-119/t24home/default'
        TAFJ_HOME = 'C:/UTP/UXP-PRI-2017.08.23-02-119/TAFJ'
        JAVA_HOME = 'C:/UTP/UXP-PRI-2017.08.23-02-119/java/jdk8'
    }

    stages {
        stage('Build') {
            steps {
               echo 'Building..'
               echo 'PATH = $PATH'
               
               bat 'mvn -B -o -f BRP-T24-packager/module/pom.xml -Dlib.dir=%T24_LIB% -Dmaven.repo.local=%MAVEN_LOCAL_REPO% -Dds.ignoreValidationErrors=true clean install'
               
               step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'    

                echo 'Copy package to %T24_HOME_PACKAGE%'

                bat 'copy .\\BRP-T24-packager\\target\\R17**.jar \"%T24_HOME_PACKAGE%\" /Y'

                echo 'Installation - phase 1 - T24PackageInstaller'
            
                bat '''
                   call "C:\\UTP\\UXP-PRI-2017.08.23-02-119\\DesignStudioT24-201709.0.0\\workspace\\setenv.cmd"
                   tRun.bat -cf tafj T24PackageInstaller
                '''
                
                echo 'Installation - phase 2 - packageDataInstaller'
                bat returnStatus: true, script: '''
                    call "C:\\UTP\\UXP-PRI-2017.08.23-02-119\\DesignStudioT24-201709.0.0\\workspace\\setenv.cmd"
                    tRun.bat -cf tafj packageDataInstaller
                '''
            }
        }
    }
}