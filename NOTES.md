# TP1

## -- 2 --

<dependencies>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webmvc</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webmvc-test</artifactId>
			<scope>test</scope>
		</dependency>

</dependencies>

Aucune n'a de balises version

## -- 4 --

BestiolesApplicationTests contient contextLoads(),
un test vide qui vérifie que le contexte Spring démarre sans erreur

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

## -- 5 --

Started BestiolesApplication in 1.761 seconds (process running)

## -- 6 --

{"groups":["liveness","readiness"],"status":"UP"}

## -- 8 --

?name=Lea → Bonjour, Lea !
sans paramètre → Bonjour, monde !
?name= (valeur vide) → Bonjour, monde !

## -- 9 --

Started BestiolesApplication in 0.283 seconds (process running)

Les durées diffèrent autant parce que DevTools ne redémarre pas la JVM.
Au premier lancement, il faut démarrer la JVM, charger toutes les librairies Spring et initialiser le contexte.
Au redémarrage de DevTools, seules les classes de l'application sont rechargées.
Les librairies restent en mémoire.

## -- 10 --

HTTP/1.1 404
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 17 Nov 2026 09:32:16 GMT

## -- 11 --

### 1

DispatcherServletAutoConfiguration matched:
- @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
- found 'session' scope (OnWebApplicationCondition)

### 2

JacksonAutoConfiguration matched:
- @ConditionalOnClass found required class 'tools.jackson.databind.json.JsonMapper' (OnClassCondition)

### 3

Prediction : 

Dans les negatives matches ?

Pas present car dans le module spring-boot-jdbc qu'on n'a pas importé

## -- 12 --

spring-boot-devtools n'est pas present

BOOT-INF/lib/HdrHistogram-2.2.2.jar
BOOT-INF/lib/commons-logging-1.3.6.jar
BOOT-INF/lib/jackson-annotations-2.21.jar
BOOT-INF/lib/jackson-core-3.1.7.jar
BOOT-INF/lib/jackson-databind-3.1.7.jar
BOOT-INF/lib/jakarta.annotation-api-3.0.0.jar
BOOT-INF/lib/jspecify-1.0.1.jar
BOOT-INF/lib/jul-to-slf4j-2.0.20.jar
BOOT-INF/lib/log4j-api-2.25.5.jar
BOOT-INF/lib/log4j-to-slf4j-2.25.5.jar
BOOT-INF/lib/logback-classic-1.5.38.jar
BOOT-INF/lib/logback-core-1.5.38.jar
BOOT-INF/lib/micrometer-commons-1.17.2.jar
BOOT-INF/lib/micrometer-core-1.17.2.jar
BOOT-INF/lib/micrometer-jakarta9-1.17.2.jar
BOOT-INF/lib/micrometer-observation-1.17.2.jar
BOOT-INF/lib/slf4j-api-2.0.20.jar
BOOT-INF/lib/snakeyaml-2.6.jar
BOOT-INF/lib/spring-aop-7.0.10.jar
BOOT-INF/lib/spring-beans-7.0.10.jar
BOOT-INF/lib/spring-boot-4.1.2.jar
BOOT-INF/lib/spring-boot-actuator-4.1.2.jar
BOOT-INF/lib/spring-boot-actuator-autoconfigure-4.1.2.jar
BOOT-INF/lib/spring-boot-autoconfigure-4.1.2.jar
BOOT-INF/lib/spring-boot-health-4.1.2.jar
BOOT-INF/lib/spring-boot-http-converter-4.1.2.jar
BOOT-INF/lib/spring-boot-jackson-4.1.2.jar
BOOT-INF/lib/spring-boot-jarmode-tools-4.1.2.jar
BOOT-INF/lib/spring-boot-micrometer-metrics-4.1.2.jar
BOOT-INF/lib/spring-boot-micrometer-observation-4.1.2.jar
BOOT-INF/lib/spring-boot-servlet-4.1.2.jar
BOOT-INF/lib/spring-boot-tomcat-4.1.2.jar
BOOT-INF/lib/spring-boot-web-server-4.1.2.jar
BOOT-INF/lib/spring-boot-webmvc-4.1.2.jar
BOOT-INF/lib/spring-context-7.0.10.jar
BOOT-INF/lib/spring-core-7.0.10.jar
BOOT-INF/lib/spring-expression-7.0.10.jar
BOOT-INF/lib/spring-web-7.0.10.jar
BOOT-INF/lib/spring-webmvc-7.0.10.jar
BOOT-INF/lib/tomcat-embed-core-11.0.27.jar
BOOT-INF/lib/tomcat-embed-el-11.0.27.jar
BOOT-INF/lib/tomcat-embed-websocket-11.0.27.jar

Nombre : 42

Taille : 21,0216951370239 Mo

## -- 13 --

Main-Class: org.springframework.boot.loader.launch.JarLauncher

Start-Class: org.sebsy.bestioles.BestiolesApplication

## -- 14 --

Started BestiolesApplication in 2.163 seconds (process running)

Reponse : Bonjour, Arthur !

Le nom du thread a l’étape 5 c’était restartedMain. Avec le jar, c’est main.

Ça révèle que DevTools lance l’application dans un thread dédié avec son propre classloader de redémarrage,
et qu’il est inactif dans le jar

# TP2

## -- 3 --

Prediction : 

L’appli ne démarre pas ?

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 1 of constructor in org.sebsy.bestioles.service.AdoptionService required a bean of type 'java.time.Clock' that could not be found.


Action:

Consider defining a bean of type 'java.time.Clock' in your configuration.

## -- 5 --

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

## -- 6 --

adoptionService : 

"dependencies":["emailNotifier","clock"]
"type":"org.sebsy.bestioles.service.AdoptionService"

clock : 

"dependencies":["horlogeConfig"]
"type":"java.time.Clock$SystemClock"

## -- 7 --

Prediction : 

Echec au démarrage ?

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in org.sebsy.bestioles.service.AdoptionService required a single bean, but 2 were found:
- emailNotifier: defined in file [C:\Users\monPC\Documents\B3\JEE\bestioles\target\classes\org\sebsy\bestioles\notif\EmailNotifier.class]
- smsNotifier: defined in file [C:\Users\monPC\Documents\B3\JEE\bestioles\target\classes\org\sebsy\bestioles\notif\SmsNotifier.class]

This may be due to missing parameter name information

Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed

Ensure that your compiler is configured to use the '-parameters' flag.
You may need to update both your build tool settings as well as your IDE.
(See https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-6.1-Release-Notes#parameter-name-retention)

