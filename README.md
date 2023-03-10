
# Jasypt Spring Boot Demo

Repository with examples of how to configure Jasypt library with Spring Boot

## Branches

* **master**: empty spring boot project
* **jasypt_auto_configuration**: version with default Jasypt configuration
* **jasypt_custom_configuration**: version with custom Jasypt configuration

## Pre-Requisites

To run this project, you will need to have installed:

`JAVA 17`

`MAVEN`

## Run Locally

Clone the project

```bash
  git clone https://github.com/WRup/jasypt-spring-boot.git
```

Go to the project directory

```bash
  cd jasypt-spring-boot
```

Checkout to one of existing branches

```bash
  git checkout jasypt_auto_configuration
```

> or

```bash
  git checkout jasypt_custom_configuration
```

Install

```bash
  mvn clean install
```

Go to the project directory

```bash
  cd target
```

Run the application

* for **jasypt_auto_configuration** branch

```bash
  java -jar -Djasypt.encryptor.password='Pa55word!Us3D_F0r#Alg0RiTHm' jasypt-demo-0.0.1-SNAPSHOT.jar
```

* for **jasypt_custom_configuration** branch

```bash
  java -jar -Dencryption.password='Pa55word!Us3D_F0r#Alg0RiTHm' jasypt-demo-0.0.1-SNAPSHOT.jar
```

## Authors

* [@WRup](https://www.github.com/WRup)
