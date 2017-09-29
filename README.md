# Herzlich Willkommen bei SEW4!

## 0. Wichtige Links
* Sollten Fehler im bereitgestellten Material auftreten, bitte bei meinen ["GitHub Issues"](https://github.com/Javaw0cky/SEW4/issues) eintragen
* SEW-Repository: [4HIT Classroom](https://classroom.github.com/a/gMVFrfRl)
* Hilfe bekommst du hier:
	+ "Diskussionsforum zum Unterricht:" [![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/SEW4?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
	+ [Stack Overflow](http://stackoverflow.com)

## 1. Source Code Verwaltung mit git

Arbeite folgende Links durch, um mit git bzw. GitHub vertraut zu machen:
* [git - Der einfache Einstieg](https://rogerdudler.github.io/git-guide/index.de.html)
* [git Cheat Sheet](https://rogerdudler.github.io/git-guide/files/git_cheat_sheet.pdf)
* [git für Einsteiger](https://svij.org/blog/2014/10/25/git-fur-einsteiger-teil-1/)
* [GitHub Guide](https://guides.github.com/activities/hello-world/)
* [git Reference](https://git-scm.com/docs)

### 1.1 Git in SEW
Sämtliche Programmierarbeit ist auf GitHub "abzugeben". Sofern Programmieraufgabe gestellt werden, sind diese nach Beendigung der letzten SEW Stunde an diesem Tag in die Repository zu pushen. Selbiges gilt auch für Hausübungen und Projekte.

Dazu ist es notwendig EIN Verzeichnis zu erstellen, wo ALLE IntelliJ Projekte in Unterordner enthalten sind.

Bei korrekter Konfiguration erkennt auch IntelliJ in den Unterprojekten, dass es unter GIT Kontrolle steht. Die Einstellung findest du unter "Preferences - Version Control" - hier kann das VCS root-Verzeichnis angegeben werden, d.h. das ist euer "IntelliJ"-Ordner, in dem alle Projekte enthalten sind.

### 1.2 Erstelle deine Repository
Deine persönliche Repositories für dieses Schuljahr findest du hier: 
* [4HIT Classroom SEW](https://classroom.github.com/assignment-invitations/55e06d52b7a3116abbb6366af0116ddd)
* [4HIT Classroom Tetris](https://classroom.github.com/assignment-invitations/769e319810e14d9ee9fd7f8734256508)

### 1.3 ".gitignore"
git kann mittels der Datei ".gitignore" mitgeteilt werden, welche Dateien bzw. Ordner NICHT unter git-Kontrolle stehen. Das ist natürlich sinnvoll, denn Beispielsweise .class Dateien oder IntelliJ Projekteinstellungen sollten nicht hochgeladen werden.

Daher erstelle eine Datei ".gitignore" im deinem Hauptordner (dort findest du auch einen Ornder ".git") mit folgendem Inhalt:
```
## Java

*.class
*.war
*.ear
hs_err_pid*

## Robovm
robovm-build/

## GWT
war/
html/war/gwt_bree/
html/gwt-unitCache/
.apt_generated/
html/war/WEB-INF/deploy/
html/war/WEB-INF/classes/
.gwt/
gwt-unitCache/
www-test/
.gwt-tmp/

## Android Studio and Intellij and Android in general
android/libs/armeabi/
android/libs/armeabi-v7a/
android/libs/arm64-v8a/
android/libs/x86/
android/libs/x86_64/
android/gen/
.idea/
*.ipr
*.iws
*.iml
out/
com_crashlytics_export_strings.xml

## Eclipse
.classpath
.project
.metadata
**/bin/
tmp/
*.tmp
*.bak
*.swp
*~.nib
local.properties
.settings/
.loadpath
.externalToolBuilders/
*.launch

## NetBeans
**/nbproject/private/
build/
nbbuild/
dist/
nbdist/
nbactions.xml
nb-configuration.xml

## Gradle

.gradle
gradle-app.setting
build/

## OS Specific
.DS_Store
Thumbs.db
```

### 1.4 README.md
Erstelle eine Datei <b>README.md</b> mit folgendem Inhalt bzw. ändere eine Datei, sofern sie schon erstellt wurde:
```
# SEW 4 - SJ 2xxx/xx
----
Name: Vorname Nachname
...
```

Damit ist es mir schneller möglich dich mit deinem richtigen Namen zu identifizieren - die Repos kommen beim clonen immer mit deinem GitHub-Usernamen an. Daraus läßt sich unter Umständen nicht schließen, von wem die Arbeit kommt.
