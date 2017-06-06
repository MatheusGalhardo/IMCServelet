# IMCServelet
# Matheus M Galhardo

 CalculoIMCServlet

# Calculando o Índice de massa corporal (IMC) com servlet.

Para rodar o projeto

<h1> Para fazer clone </h1> 

git clone https://github.com/MatheusGalhardo/IMCServelet

<h1> Para rodar com o Tomcat. </h1>

mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090

ou ./mvnw tomcat7:run

 No Linux, use ./mvnw ao invés de apenas mvnw, como no Windows. Além disso, pelo menos uma vez, é preciso dar permissão de execução ao arquivo de script mvnw com o comando chmod +x mvnw.

# Para acessar a aplicação

http://localhost:9090/CalculoIMCServlet/mvc/calculo-imc em qualquer navegador.

# Para "empacotar" a aplicação.

mvnw package

# Para "preparar" o projeto

Para "embutir" o Maven no projeto.

Não precisa fazer isso! Já foi feito.

mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9
