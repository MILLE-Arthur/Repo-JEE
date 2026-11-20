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

Dans ma compilation, la ligne Maven est `Compiling ... with javac [debug parameters release 25]` :
l'option `-parameters` est donc bien active (le parent Spring Boot l'active).

Prédiction : `javap` affiche une section `MethodParameters` avec `notifier` et `clock` pour le constructeur.

```
javap -v -cp target/classes org.sebsy.bestioles.service.AdoptionService
```

Obtenu (section MethodParameters) : _à coller après exécution_

Conclusion : non, cette piste n'explique pas mon erreur. Les noms de paramètres sont présents ;
l'erreur vient du fait qu'il y a deux candidats (`emailNotifier` et `smsNotifier`) pour un seul `Notifier`.
Le « This may be due to missing parameter name information » n'est qu'une piste générique du message.

## -- 10 --

| Service | Mécanisme | Où |
|---|---|---|
| `AdoptionService` (inchangé) | `@Primary` : le bean par défaut quand on ne précise rien | sur `EmailNotifier` |
| `RappelService` | `@Qualifier("smsNotifier")` : on désigne le bean par son nom | sur le paramètre du constructeur |
| `AlerteService` | injection d'une `List<Notifier>` : on reçoit tous les beans du type | paramètre du constructeur |

Aucun service ne dépend d'une classe concrète : tous reçoivent des `Notifier`.

## -- 11 --

Prédiction (`dependencies` sur `/actuator/beans`) :

- `adoptionService` : `emailNotifier`, `clock`
- `rappelService` : `smsNotifier`
- `alerteService` : `emailNotifier`, `smsNotifier` (l'ordre peut varier)

Obtenu : _à coller après exécution_

## -- 13 --

`./mvnw verify` : prédiction `Tests run: 2, Failures: 0, Errors: 0, Skipped: 0` et `BUILD SUCCESS`.

Obtenu : _à coller après exécution_

## -- 8 -- (approfondissement)

Conflit rétabli en retirant provisoirement `@Primary` d'`EmailNotifier`.

Prédiction : non, `./mvnw package` ne produit pas de jar. Le projet compile, mais `package` passe par la phase `test` :
`BestiolesApplicationTests.contextLoads` démarre le contexte Spring, qui échoue à cause des deux `Notifier`.
Maven s'arrête avec `BUILD FAILURE` avant d'atteindre le plugin qui construit le jar.
`AdoptionServiceTest` passe, lui, car il n'utilise pas Spring.

Ligne qui a échoué : _à coller après exécution_ (attendu : `[ERROR] Failed to execute goal ...maven-surefire-plugin...:test (default-test) on project bestioles`)

Un projet qui compile n'est pas forcément un projet qui se package : le câblage des beans n'est vérifié qu'au démarrage du contexte,
donc le test de contexte est le seul filet qui l'attrape avant la livraison.
Solution remise : `@Primary` sur `EmailNotifier`.

## -- 12 -- (approfondissement)

Prédiction : avec `@Qualifier("SmsNotifier")` (majuscule), l'appli ne démarre pas. Le nom par défaut d'un bean est le nom de la classe
avec la première lettre en minuscule (`smsNotifier`), et la comparaison est sensible à la casse. `RappelService` ne trouve aucun
bean `Notifier` qualifié `SmsNotifier`.

Obtenu : _à coller après exécution_ (attendu : `APPLICATION FAILED TO START`, `Parameter 0 of constructor in ...RappelService required a bean of type 'org.sebsy.bestioles.notif.Notifier' that could not be found`, avec `@org.springframework.beans.factory.annotation.Qualifier("SmsNotifier")` cité).

Remis à `smsNotifier`.

## -- 14 -- (approfondissement)

`Refuge` reçoit `Veterinaire` et `Veterinaire` reçoit `Refuge`, tous deux par leur constructeur.

Prédiction : l'application ne démarre pas. Spring doit créer `refuge`, qui a besoin de `veterinaire`, qui a besoin de `refuge`... :
aucun des deux ne peut être instancié le premier.

Obtenu : _à coller après exécution_ (attendu : `APPLICATION FAILED TO START`, `The dependencies of some of the beans in the application context form a cycle:` avec le schéma `refuge` ↔ `veterinaire`, et `Action: Relying upon circular references is discouraged and they are prohibited by default...`)

## -- 15 -- (approfondissement)

```
./mvnw spring-boot:run "-Dspring-boot.run.arguments=--spring.main.allow-circular-references=true"
```

Prédiction : ça échoue quand même.

Obtenu (section `Action`) : _à coller après exécution_ (attendu : `Despite circular references being allowed, the dependency cycle between beans could not be broken. Update your application to remove the dependency cycle between beans.`)

Explication : pour casser un cycle, Spring crée un bean à moitié (instancié, pas encore peuplé) et expose une référence anticipée
à l'autre bean. Avec l'injection par constructeur, un bean ne peut pas être instancié sans son collaborateur : `Refuge` attend
`Veterinaire`, qui attend `Refuge`, donc aucun des deux n'existe jamais, même partiellement. Cette astuce ne marche qu'avec
l'injection par setter ou par champ, pas par constructeur.

## -- 16 -- (approfondissement)

Ce que les deux classes se partageaient, c'est la liste des pensionnaires. Elle est sortie dans un troisième bean, `Registre`
(même package `org.sebsy.bestioles.cycle`). Le graphe devient `refuge → veterinaire → registre` et `refuge → registre` : sans cycle,
sans `@Lazy`, sans setter, sans propriété.

Prédiction (`dependencies` sur `/actuator/beans`) :

- `refuge` : `veterinaire`, `registre`
- `veterinaire` : `registre`
- `registre` : liste vide

Obtenu : _à coller après exécution_

## -- 17 -- (approfondissement)

Le package `cycle` est un exercice, pas du code de Bestioles : retiré dans un commit à part (`git rm -r`).
`git log --oneline` montre le commit de résolution du cycle puis celui du retrait.

# TP3

## -- 1 --

Dépendances ajoutées via Initializr (Validation, puis Explore) : **2**

- `spring-boot-starter-validation` : pas de `scope` (compile)
- `spring-boot-starter-validation-test` : `scope` test

## -- 4 --

Obtenu (démarrage avec `./mvnw spring-boot:run`) : _à coller après exécution_

Attendu : `>>> Refuge des Bestioles : 30 places`

## -- 5 --

Prédiction : `capacite-max: 120` dépasse le `@Max(50)`. L'application ne démarre pas (`APPLICATION FAILED TO START`,
`Binding to target ... RefugeProperties failed`). Le bloc donne `Origin: class path resource [application.yaml] - 14:19` :
ligne 14, colonne 19 de mon fichier, c'est-à-dire la ligne `    capacite-max: 120` et précisément le début de la valeur `120`
(le fichier avait alors encore le bloc `management` en haut, d'où la ligne 14).

Obtenu : _à coller après exécution_

Note : la langue du `Reason:` dépend de la locale de la JVM (français : « doit être inférieur ou égal à 50 », anglais : « must be less than or equal to 50 »).

## -- 6 --

Prédiction : avec `trente`, l'application ne démarre pas non plus, mais l'erreur est d'une autre nature : ce n'est plus une contrainte
de validation violée, c'est une valeur qui ne se **convertit** pas en `int` (`failed to convert java.lang.String to int`,
cause `NumberFormatException: For input string: "trente"`). La validation n'est même pas atteinte : le binding échoue avant.
La ligne `Property:` désigne la même clé ; je compare ce que j'obtiens (forme du nom de la propriété, `Value:`, `Reason:`).

Obtenu : _à coller après exécution_

`capacite-max` remis à `30`.

## -- 7 --

`application-dev.yaml` : nom `Refuge (dev)`, 5 places, `org.sebsy` en `DEBUG`, et le bloc `management` déplacé depuis `application.yaml`.

Pourquoi `/actuator/beans` n'est plus exposé hors de `dev` : `application.yaml` est lu dans tous les profils, alors que
`application-dev.yaml` n'est lu que quand le profil `dev` est actif ; en déplaçant le bloc `management` dans ce second fichier,
l'exposition de `beans` n'existe plus que dans `dev`, et sans profil Spring Boot n'expose que `health` par défaut.

## -- 12 --

Ordre de priorité des sources (documentation Spring Boot, de la plus forte à la plus faible) : argument de ligne de commande,
variable d'environnement, `application-{profil}.yaml`, `application.yaml`.
Pour les variables d'environnement, `BESTIOLES_REFUGE_CAPACITEMAX` correspond à `bestioles.refuge.capacite-max` (liaison relâchée, les tirets sont ignorés).

| # | Lancement | Prédiction | Obtenu |
|---|---|---|---|
| 1 | `java -jar target/bestioles-0.0.1-SNAPSHOT.jar` | `>>> Refuge des Bestioles : 30 places` | _à coller_ |
| 2 | idem, `--spring.profiles.active=dev` | `>>> Refuge (dev) : 5 places` | _à coller_ |
| 3 | idem 2, avec la variable `BESTIOLES_REFUGE_CAPACITEMAX=3` | `>>> Refuge (dev) : 3 places` (la variable bat le yaml de profil) | _à coller_ |
| 4 | idem 2, `--bestioles.refuge.capacite-max=2` en plus | `>>> Refuge (dev) : 2 places` (l'argument bat le yaml) | _à coller_ |
| 5 | idem 2, variable à 3 **et** argument à 2 | `>>> Refuge (dev) : 2 places` (l'argument bat la variable) | _à coller_ |
| 6 | sans argument de profil, avec `SPRING_PROFILES_ACTIVE=dev` | `>>> Refuge (dev) : 5 places` (la variable active le profil ; la variable de capacité a été retirée) | _à coller_ |

Le script `tp03-lancements.ps1` (à la racine) rejoue ces six lignes et affiche la ligne `>>>` de chacune.

## -- 13 --

De la source la plus forte à la plus faible :

1. argument de ligne de commande (`--bestioles.refuge.capacite-max=2`) : lignes 4 et 5
2. variable d'environnement (`BESTIOLES_REFUGE_CAPACITEMAX=3`) : ligne 3
3. fichier de profil (`application-dev.yaml`) : lignes 2 et 6 (le profil peut lui-même être activé par argument ou par variable)
4. `application.yaml` : ligne 1

## -- 14 --

`./mvnw verify` : _à coller après exécution_ (attendu : `BUILD SUCCESS`, 2 tests).

`git grep -n datasource` : aucune ligne (le projet ne contient aucune configuration de base de données ; aucune dépendance JDBC).

## -- 8 -- (approfondissement)

`ConsoleNotifier` (`@Component` + `@Profile("dev")`) écrit `<destinataire> <- <message>` sur la console.

Prédiction (`dependencies` en `dev`, à ce stade `EmailNotifier` est encore `@Primary` sans profil) :

- `adoptionService` : `emailNotifier`, `clock`
- `rappelService` : `smsNotifier`
- `alerteService` : `emailNotifier`, `smsNotifier`, `consoleNotifier` (ordre libre)

Commande : `./mvnw spring-boot:run -Dspring-boot.run.profiles=dev "-Dspring-boot.run.arguments=--server.port=8080"`

Obtenu : _à coller après exécution_

## -- 9 -- (approfondissement)

Règle : en `dev`, aucun e-mail ne part ; hors `dev`, rien ne change par rapport au TP 02. Sans toucher aux trois services :

- `EmailNotifier` : `@Profile("!dev")` (le bean n'existe plus en `dev`) ; il reste `@Primary` hors `dev`
- `ConsoleNotifier` : `@Profile("dev")` et `@Primary`. Les deux `@Primary` ne coexistent jamais, car leurs profils sont exclusifs ;
  sans cela `AdoptionService` aurait deux `Notifier` primaires ou un conflit à nouveau.

`dependencies` en `dev` (prédiction) :

- `adoptionService` : `consoleNotifier`, `clock`
- `rappelService` : `smsNotifier` (le `@Qualifier` désigne le SMS même en `dev`)
- `alerteService` : `smsNotifier`, `consoleNotifier` (plus d'e-mail)

Profil par défaut (lancé avec `--management.endpoints.web.exposure.include=beans`) : `adoptionService` : `emailNotifier`, `clock` ;
`rappelService` : `smsNotifier` ; `alerteService` : `emailNotifier`, `smsNotifier` (identique au TP 02).

Obtenu : _à coller après exécution_

## -- 10 -- (approfondissement)

`EmailNotifier` reçoit `RefugeProperties` et journalise `[e-mail de <adresse de contact>] <destinataire> <- <message>`.

`emailNotifier` dépend maintenant du bean `bestioles.refuge-org.sebsy.bestioles.config.RefugeProperties`
(nom d'un bean `@ConfigurationProperties` : préfixe, un tiret, nom complet de la classe).

Obtenu : _à coller après exécution_

## -- 11 -- (approfondissement)

`application-prod.yaml` : `bestioles.refuge.email-contact: ${BESTIOLES_CONTACT_EMAIL}`. Le reste (nom, capacité) vient de `application.yaml`.

Prédiction : sans la variable, l'application refuse de démarrer. Le `Binder` des `@ConfigurationProperties` ne lève pas d'erreur sur
un `${...}` introuvable : il laisse le texte tel quel. `emailContact` vaut donc littéralement `${BESTIOLES_CONTACT_EMAIL}`,
ce qui n'est pas une adresse bien formée et est rejeté par `@Email` (`Reason: doit être une adresse électronique bien formée`).
(Si Spring signalait à la place `Could not resolve placeholder`, la conclusion serait la même : refus de démarrer.)

```
java -jar target/bestioles-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```

Obtenu sans la variable : _à coller après exécution_

Avec la variable (`BESTIOLES_CONTACT_EMAIL=accueil@refuge-bestioles.fr`), attendu : `>>> Refuge des Bestioles : 30 places`.

Obtenu avec la variable : _à coller après exécution_

`/actuator/beans` répond 404 en `prod` : le bloc `management` n'est que dans `application-dev.yaml`, donc seul `health` est exposé.
Vérification : `curl.exe -i localhost:8080/actuator/beans`.
