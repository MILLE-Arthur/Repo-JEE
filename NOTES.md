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

## -- 9 --

La ligne Maven dit : Compiling ... with javac [debug parameters release 25]
Donc l'option -parameters est bien active (le parent Spring Boot l'active).

Prediction : 

javap affiche MethodParameters avec notifier et clock pour le constructeur

javap -v -cp target/classes org.sebsy.bestioles.service.AdoptionService

Conclusion : non, ça n'explique pas mon erreur. Les noms des paramètres sont bien là.
L'erreur vient du fait qu'il y a 2 candidats (emailNotifier et smsNotifier) pour un seul Notifier.
Le "This may be due to missing parameter name information" c'est juste une piste générique.

## -- 10 --

AdoptionService (inchangé) → @Primary sur EmailNotifier : c'est le bean par défaut quand on précise rien

RappelService → @Qualifier("smsNotifier") sur le paramètre du constructeur : on choisit le bean par son nom

AlerteService → List<Notifier> dans le constructeur : on reçoit tous les beans Notifier

Aucun service ne dépend d'une classe concrète, ils reçoivent tous des Notifier.

## -- 11 --

Prediction : 

adoptionService → emailNotifier, clock
rappelService → smsNotifier
alerteService → emailNotifier, smsNotifier (l'ordre peut changer)

## -- 13 --

./mvnw verify

Prediction : Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 et BUILD SUCCESS

## -- 8 -- (approfondissement)

J'ai enlevé @Primary d'EmailNotifier pour remettre le conflit.

Prediction : 

Non, ./mvnw package ne crée pas de jar.
Ça compile, mais package passe par la phase test.
BestiolesApplicationTests.contextLoads démarre Spring et ça plante à cause des 2 Notifier.
Maven s'arrête en BUILD FAILURE avant de faire le jar.
AdoptionServiceTest passe quand même parce qu'il n'utilise pas Spring.

Ligne qui a échoué : (à coller)
Attendu : [ERROR] Failed to execute goal ...maven-surefire-plugin...:test (default-test) on project bestioles

Un projet qui compile n'est pas forcément un projet qui se package.
Les beans ne sont vérifiés qu'au démarrage du contexte, donc c'est le test de contexte qui l'attrape avant la livraison.
Solution : @Primary remis sur EmailNotifier.

## -- 12 -- (approfondissement)

Prediction : 

Avec @Qualifier("SmsNotifier") (majuscule) l'appli ne démarre pas ?
Le nom d'un bean c'est le nom de la classe avec la première lettre en minuscule (smsNotifier).
Et Spring fait la différence entre majuscule et minuscule.
Donc RappelService trouve aucun bean Notifier qui s'appelle SmsNotifier.

Attendu : APPLICATION FAILED TO START, Parameter 0 of constructor in ...RappelService required a bean of type 'org.sebsy.bestioles.notif.Notifier' that could not be found, avec @Qualifier("SmsNotifier") écrit dedans

Remis à smsNotifier.

## -- 14 -- (approfondissement)

Refuge reçoit Veterinaire et Veterinaire reçoit Refuge, les deux par le constructeur.

L'appli ne démarre pas ?
Spring doit créer refuge, qui a besoin de veterinaire, qui a besoin de refuge...
Aucun des deux peut être créé en premier.

Attendu : APPLICATION FAILED TO START, The dependencies of some of the beans in the application context form a cycle: avec refuge ↔ veterinaire, et Action: Relying upon circular references is discouraged and they are prohibited by default...

## -- 15 -- (approfondissement)

./mvnw spring-boot:run "-Dspring-boot.run.arguments=--spring.main.allow-circular-references=true"

Prediction : ça échoue quand même ?

Attendu : Despite circular references being allowed, the dependency cycle between beans could not be broken. Update your application to remove the dependency cycle between beans.

Explication :
Pour casser un cycle, Spring crée un bean à moitié (créé mais pas rempli) et donne une référence à l'autre bean.
Avec le constructeur, un bean peut pas être créé sans l'autre.
Refuge attend Veterinaire, qui attend Refuge, donc aucun des deux existe, même à moitié.
Ça marche seulement avec l'injection par setter ou par champ, pas par constructeur.

## -- 16 -- (approfondissement)

Ce que les 2 classes se partageaient c'est la liste des pensionnaires.
Je l'ai mise dans un 3e bean, Registre (même package org.sebsy.bestioles.cycle).
Ça donne refuge → veterinaire → registre et refuge → registre.
Plus de cycle, et sans @Lazy, sans setter, sans propriété.

Prediction : 

refuge → veterinaire, registre
veterinaire → registre
registre → liste vide

## -- 17 -- (approfondissement)

Le package cycle c'était juste un exercice, c'est pas du code de Bestioles.
Je l'ai retiré dans un commit à part (git rm -r).
git log --oneline montre le commit qui résout le cycle puis celui qui le retire.

# TP3

## -- 1 --

Dépendances ajoutées avec Initializr (Validation, puis Explore) : 2

spring-boot-starter-validation → pas de scope (compile)
spring-boot-starter-validation-test → scope test

## -- 4 --

Obtenu (avec ./mvnw spring-boot:run) : (à coller)

Attendu : >>> Refuge des Bestioles : 30 places

## -- 5 --

Prediction : 

capacite-max: 120 dépasse le @Max(50), donc l'appli ne démarre pas ?
APPLICATION FAILED TO START, Binding to target ... RefugeProperties failed

Le bloc dit Origin: class path resource [application.yaml] - 14:19
Donc ligne 14, colonne 19 de mon fichier : la ligne capacite-max: 120, au début de la valeur 120.
(à ce moment le fichier avait encore le bloc management en haut, c'est pour ça la ligne 14)

Note : la langue du Reason: dépend de la langue de la JVM (français : « doit être inférieur ou égal à 50 », anglais : « must be less than or equal to 50 »).

## -- 6 --

Prediction : 

Avec trente l'appli démarre pas non plus, mais l'erreur est pas la même.
Là c'est pas une contrainte pas respectée, c'est que trente peut pas être converti en int
(failed to convert java.lang.String to int, NumberFormatException: For input string: "trente").
La validation est même pas atteinte, ça plante avant au binding.
La ligne Property: montre la même clé, je compare ce que j'obtiens (nom de la propriété, Value:, Reason:).

capacite-max remis à 30.

## -- 7 --

application-dev.yaml : nom Refuge (dev), 5 places, org.sebsy en DEBUG, et le bloc management déplacé depuis application.yaml.

Pourquoi /actuator/beans n'est plus exposé hors de dev :
application.yaml est lu dans tous les profils, mais application-dev.yaml seulement quand le profil dev est actif.
Comme j'ai mis management dans le 2e fichier, beans est exposé seulement en dev.
Sans profil, Spring Boot expose que health par défaut.

## -- 12 --

Ordre de priorité des sources (doc Spring Boot, de la plus forte à la plus faible) :
argument de ligne de commande, variable d'environnement, application-{profil}.yaml, application.yaml.

Pour les variables d'environnement, BESTIOLES_REFUGE_CAPACITEMAX correspond à bestioles.refuge.capacite-max (les tirets sont ignorés).

Prediction / Obtenu :

1. java -jar target/bestioles-0.0.1-SNAPSHOT.jar
→ >>> Refuge des Bestioles : 30 places

2. pareil avec --spring.profiles.active=dev
→ >>> Refuge (dev) : 5 places

3. comme le 2, avec la variable BESTIOLES_REFUGE_CAPACITEMAX=3
→ >>> Refuge (dev) : 3 places (la variable passe avant le yaml du profil)

4. comme le 2, avec --bestioles.refuge.capacite-max=2 en plus
→ >>> Refuge (dev) : 2 places (l'argument passe avant le yaml)

5. comme le 2, variable à 3 et argument à 2
→ >>> Refuge (dev) : 2 places (l'argument passe avant la variable)

6. sans argument de profil, avec SPRING_PROFILES_ACTIVE=dev
→ >>> Refuge (dev) : 5 places (la variable active le profil, et j'ai retiré la variable de capacité)

Le script tp03-lancements.ps1 (à la racine) refait ces 6 lancements et affiche la ligne >>> de chacun.

## -- 13 --

De la plus forte à la plus faible :

1. argument de ligne de commande (--bestioles.refuge.capacite-max=2) : lignes 4 et 5
2. variable d'environnement (BESTIOLES_REFUGE_CAPACITEMAX=3) : ligne 3
3. fichier de profil (application-dev.yaml) : lignes 2 et 6 (le profil peut être activé par un argument ou par une variable)
4. application.yaml : ligne 1

## -- 14 --

./mvnw verify

Attendu : BUILD SUCCESS, 2 tests

git grep -n datasource → aucune ligne
Le projet a aucune config de base de données et aucune dépendance JDBC.

## -- 8 -- (approfondissement)

ConsoleNotifier (@Component + @Profile("dev")) écrit <destinataire> <- <message> dans la console.

Prediction (dependencies en dev, EmailNotifier est encore @Primary sans profil) :

adoptionService → emailNotifier, clock
rappelService → smsNotifier
alerteService → emailNotifier, smsNotifier, consoleNotifier (ordre libre)

Commande : ./mvnw spring-boot:run -Dspring-boot.run.profiles=dev "-Dspring-boot.run.arguments=--server.port=8080"

## -- 9 -- (approfondissement)

Règle : en dev aucun e-mail part, hors dev rien change par rapport au TP 02.
Sans toucher aux 3 services :

EmailNotifier → @Profile("!dev") (le bean existe plus en dev), et il reste @Primary hors dev
ConsoleNotifier → @Profile("dev") et @Primary

Les 2 @Primary sont jamais là en même temps parce que leurs profils s'excluent.
Sinon AdoptionService aurait 2 Notifier primaires et on aurait de nouveau un conflit.

Prediction (dependencies en dev) :

adoptionService → consoleNotifier, clock
rappelService → smsNotifier (le @Qualifier vise le SMS même en dev)
alerteService → smsNotifier, consoleNotifier (plus d'e-mail)

Profil par défaut (lancé avec --management.endpoints.web.exposure.include=beans) :
adoptionService → emailNotifier, clock
rappelService → smsNotifier
alerteService → emailNotifier, smsNotifier
C'est pareil que le TP 02.

## -- 10 -- (approfondissement)

EmailNotifier reçoit RefugeProperties et écrit [e-mail de <adresse de contact>] <destinataire> <- <message> dans les logs.

emailNotifier dépend maintenant du bean bestioles.refuge-org.sebsy.bestioles.config.RefugeProperties
(le nom d'un bean @ConfigurationProperties c'est : le préfixe, un tiret, puis le nom complet de la classe).

## -- 11 -- (approfondissement)

application-prod.yaml : bestioles.refuge.email-contact: ${BESTIOLES_CONTACT_EMAIL}
Le reste (nom, capacité) vient de application.yaml.

Prediction : 

Sans la variable, l'appli refuse de démarrer ?
Le Binder des @ConfigurationProperties dit pas d'erreur quand il trouve pas le ${...}, il laisse le texte comme ça.
Donc emailContact vaut vraiment ${BESTIOLES_CONTACT_EMAIL}, c'est pas une adresse valide et @Email refuse
(Reason: doit être une adresse électronique bien formée).
(Si Spring dit plutôt Could not resolve placeholder, c'est pareil : l'appli démarre pas.)

java -jar target/bestioles-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

Avec la variable (BESTIOLES_CONTACT_EMAIL=accueil@refuge-bestioles.fr)
Attendu : >>> Refuge des Bestioles : 30 places

/actuator/beans répond 404 en prod : le bloc management est seulement dans application-dev.yaml, donc seul health est exposé.
Vérification : curl.exe -i localhost:8080/actuator/beans