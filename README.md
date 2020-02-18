# ServletProjectV2

Telecharger apache-tomcat-7.0.91

Telecharger jdk1.8.0_144

Récuperer le WAR du projet en exécutant la commande suivante dans un invité de commande :

mkdir C:\ServletHtmlProject cd C:\ServletHtmlProject

mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/maxime20091996/ServletProjectV2

Aller dans target\checkout\ServletHtmlProject

mvn install

Deposer le fichier ServletHtmlProject.war dans le dossier webapps du serveur Tomcat

Dans le dossier bin du serveur Tomcat lancer le startup.bat

Dans un navigateur web saisir l'adresse suivante : http://localhost:8080/ServletHtmlProject/Accueil

Liste des méthodes HTTPRequest :

ContextPath

PathInfo

LocalAddr

Method

ServerName

RemoteHost

RemoteUser

LocalName

Protocol

CharacterEncoding

QueryString

Les réponses aux méthodes sont affchées sur le lien cité ci-dessus

