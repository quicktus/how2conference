# how2conference #

[Projekt](#Projekt) |
[Checklisten](#Checklisten)


## Projekt ##

Ich habe im Sommersemester 2021 begleitend zum Modul Machine Learining for Business (ML4B) die _Machine Learning for Business Conference 2021_ und die vorgelagerten Peer Reviews organisiert. Das Projekt wurde im Format des Forschenden Lernens durchgeführt. Dieses Reposistory dient der Dokumentation meiner Arbeit und kann als Vorlage für zukünftige ML4B Konferenzen verwendet werden.
Die ML4B Conference 2021 war eine interne Konferenz auf der Studierende, die das Modul ML4B belegt haben, die Ergebnisse ihrer Forschungsprojekte vorgestellt haben. Dazu haben sie ein Forschungsprojekt im Bereich des Machine Learning durchgeführt, über die Ergebnisse ein Paper im wissenschaftlichen Stil verfasst und eingereicht, Papers anderer Studierenden Peer-Reviewt und nach einer Überarbeitung schließlich ihr Paper in Form einer Präsentation auf der Konferenz vorgestellt.

Hinweis: Die Vergabe der Themen bzw. Forschungsaufgaben an die Studierenden war bereits vor dem Start vergeben.

Das Projekt begann zum Anfang des Sommersemesters 2021, wurde in einem Teams-Meeting am 18. Mai 2021 per Projektplan konkretisiert und endete mit dem zweiten Konferenztag am 25. Juni 2021.

Als erstes wurde die Rahmenanforderungen mit den Dozenten besprochen und eine Woche später bereits ein Zeitplan veröffentlicht. Nur die Konferenztermine fehlten im Zeitplan, da diese in einem Abstimmungsverfahren nach Präferenzen der Teilnehmer festgelegt werden sollten. Diese Terminabstimmung organisierte ich über das Tool [Terminklick](https://terminklick.stuve.fau.de/) der Studierendenvertretung der FAU.

Als nächstes wurden Conference Guidelines für die Reviewer erstellt. Hierzu orientierte ich mich an typischen Vorgaben echter wissenschaftlicher Konferenzen (insbesondere Machine Learning Konferenzen) und versuchte, die Forderungen etwas zu reduzieren, damit es machbar blieb. 

Anschließend habe ich mit [Google Forms](https://www.google.de/intl/de/forms/about/), das sich wegen der Integration mit Google Sheets für die Konferenzzwecke gut eignet, ein Survey erstellt für die Reviews, das verschiedene Vorgaben der Reviewers‘ Guidelines wie die Kriterienkataloge, die Textbeschreibungen, die Notenskalen vorgegeben.

Wichtig: es musste frühzeitig eine Seite im Gitbook erstellt werden, auf der alle Information zu finden waren, die für die Konferenz relevant waren. Jede wichtige Information wurde über Teams mitgeteilt. Friendly Reminder im Konferenzkanal auf MS-Teams sorgten immer wieder dafür, dass Deadlines nicht allzu leicht oder versehentlich missachtet wurden. Es ist hier sehr nützlich heimliche grace periods einzuplanen, weil die Teilnehmer/-innen immer wieder die Deadlines platzen lassen. Welcome Message: Eine Einleitung für die Conference mit Bildern der Chairs musste frühzeitig erstellt werden.

Damit die Reviewers Reviews erstellen können, ohne dass die Autoren ihre Version weiterentwickelt haben (manche Autoren schaffen es nicht, bis zur eigentlich bekannten Deadline ihr Paper fertig zu stellen und dürfen ja auch bis zur Konferenz ständig weiterentwickeln), habe ich in Gitbook in einem eigenen Ordner Reviewers‘ copies erstellt, die den Stand zum Abgabetermin „einfroren“ und nicht verändert werden durften. Trotzdem kommen dann menschliche Fehler wie z.B., dass Studierende aus Versehen die Anpassungen als Antwort auf ihre Reviews nicht in der Live Version einbauen, sondern in den Reviewers‘ copies (ich habe dann z.B. an den Anfang der Reviewers‘ copies eine Infobox gestellt mit dem Hinweis „This is the Reviewers' Copy. Do not edit this page.“). 

Mit Java habe ich ein Skript (assignment.java) erstellt, das zufallsgesteuert unter Berücksichtigung einiger Regeln die Papers jeweils vier Reviewer pro Paper zuteil, im Ergebnis eine csv-Datei (better_assignemnt.csv) erstellt, die anschließend Direktnachrichten für alle Teilnehmer generierte. Die zur vollen Excel-Datei konvertierte Fassung (better_assignment.xlsx) enthält als Checkliste zusätzlich zur erfolgten Zuteilung Reviewers zu den Reviewees eine Spalte für die Überwachung des Direktnachrichten-Versands, eine invertierte Tabelle mit den Reviewees, um per Checkliste zu überwachen, wer Reviewer A, B, C oder D ist und wer die zugeordneten Chair Reviewer sind, was aus der ersten Tabelle nicht ersichtlich ist und wichtig ist, um die Reviews anonym im Formular (s. weiter unten) einzutragen. Wichtig an dieser Stelle ist auch, dass das Chair Review für die Conference Chairs nicht von diesen, sondern von einem anderen Studierenden geschrieben werden (sonst würden sich die Chairs ihr Chair Review selbst schreiben). Mein Script vermeidet dies.

Danach habe ich allen Direktnachrichten geschrieben, mit dem Inhalt, welche zwei Papers pro Studierenden zu erstellen sind und mit einem Link zur Reviewer’s copy und zum Survey. 

Ein Problem war, dass eine Studierende wegen des Arbeitsvolumens aufgehört hat und deshalb ihre Reviews auch nicht mehr schrieb – ihr Partner machte jedoch weiter. Dadurch fehlten zwei Reviews, die auch leider von niemandem aus der Studentenschaft übernommen wurden. Ein weiteres Problem war, dass zwei Reviews so mangelhaft formuliert waren, dass sie von mir als Chair nach Rücksprache mit den Dozenten herausgenommen wurden, um einen niedrigen Standard nicht offensichtlich zu machen. Ich hatte noch versucht, über ein gefordertes Mindestmaß an Zeichen einen substanziellen Responsetext einzufordern, aber Mehrfachkopien von „I have nothing to complain about“ sind einfach zu dünn. Ein Hinweis der Dozenten, dass die Reviews Pflicht sind und in die Benotung einfließen, schaffte keine Abhilfe, so dass insgesamt vier Reviews fehlten.

Die Reviews habe ich dann als Subseiten in die Reviewers‘ copies eingebaut, indem ich sie in ein Markdown Template eingesetzt habe, damit die Anonymität gewahrt bleibt. An jedes Review wurde auch ein Hinweis auf die nächste Deadline gehängt.

Danach habe ich angefangen, die Chair Reviews zu schreiben und ebenfalls als Unterseite in Gitbook angehängt. Zu Transparenzzwecken habe ich auf mein eigenes Chair Review die Info gehängt: „To avoid a conflict of interest, this review was not written by Kilian or XXX who are both the authors of this paper and the conference chairs.“

Nun kamen Direktnachrichten an alle, damit es sicher jeder sieht (auch jeder aus einem Zweier-Team), dass die Reviews und Chair Reviews fertig sind. Ich konnte die Nachricht immer copy&pasten, weil ich diesmal die Anrede weggelassen habe.

Nachdem diese Deadline vorbei war und von drei Studierenden ignoriert wurden, schaffte eine Teams-Gruppen-DM mit den Dozierenden und den Studierenden zur Motivation hier Abhilfe. Nun waren alle Responses gemacht und in die Excel-Tabelle wurde eingetragen, wer an wen Direkt Responses geben musste, denn durch die Anonymität durften die Autoren ja nicht wissen, welche Studierenden das Review formuliert hatten. Mit Copy & paste wurde jedem per DM ein entsprechender Text geschickt (nicht in Gitbook).

Das Formular „Reviewers‘ final Recommendation“ diente dazu, dass die Reviewer ihre Gesamtnoten für das Paper ändern konnten, nachdem sie die Antworten und Änderungen oder Weiterentwicklungen gelesen hatten.

Nun musste die Agenda der Konferenz erstellt werden. 

Im Nachgang:  Ich habe in Summe drei Surveys erstellt. Als erstes das Review Survey (mit dem die Reviewers ihr Review geschrieben haben), dann das Response to Reviewers Survey (mit dem die Autoren an die anonymen Reviewers A, B, C und D jeweils direkt aber gleichzeitig anonym geantwortet haben) und schließlich das Final Recommendation Survey (mit dem die Reviewer ihre Overall Evaluation ändern konnten oder gleich lassen konnten). 

Nach der Deadline für die Final Recommendation habe ich verkündet, dass alle Papers angenommen wurden (wäre ein Paper nicht empfohlen worden, hätte es trotzdem in der Konferenz vorgestellt werden müssen). Die freundlichen Bewertungen durch die Mitstudierenden, die inhaltlich hilfreich aber in der Skalierung sehr positiv waren, bewirkten dies (STATISTIK EINBAUEN).

Ein paar Studierende fragten per DM aktiv nach, ob ihre Bewertung nach den Anpassungen verändert wurden (die finalen Bewertungen sind für die Conference Chairs gedacht, nicht für die Autoren, weil sie den Chairs die Entscheidung erleichtern sollen). Ich habe dies gerne ehrlich beantwortet.

Wer präsentiert an welchem Konferenztag. Theoretisch wäre es über die Präferenz in Terminklick gegangen, aber wir wollten angelehnt an echte Konferenzen über die thematischen Tracks als roten Faden aufteilen und haben statt zwei Tracks zwei Tage gemacht, den Image Day und den Text Day. Den beliebtesten Tag haben wir als den gewählt, an dem die meisten Präsentationen sein sollten. Die Agenda im Gitbook wurde entsprechend sortiert und eingefügt. 

Ich habe in Teams einen Ordner angelegt, in dem alle ihre ppt-Dateien für die Präsentation hochladen konnten, damit sie am Konferenztag zur Verfügung standen (und auch den Dozenten hinterher für die Bewertung zur Verfügung standen).

Als Chair hatte ich vier Kanäle zur Verfügung, um Informationen zur Konferenz zu teilen:  
1. die eigene Gitbook-Page mit allen Informationen zur Konferenz auf einer Seite (Vergangenes und auch weit in die Zukunft),  
2. der eigene Teams-Kanal (für Friendly Reminders oder aktuelle Sachen wie ab heute dürfen die Reviews geschrieben werden, ihr solltet alle eine DM bekommen haben, falls nicht bitte gebt mir Bescheid)  
3. das Vorlesungsmeeting in Form der Videokonferenz (rund fünf Minuten am Anfang und am Ende konnte ich für Updates nutzen, mit Infos die den Teams-Infos teilweise voraus waren)  
4. Direktnachrichten per Teams z.B. für Links zu den zu reviewenden Papers oder den Formularen. 

Branding: Von den Dozenten erhielt ich ein Logo, aus dem ich ein Banner entwickelte. Letzteres habe ich in alle wichtigen Posts und in Gitbook an den Anfang gestellt, um ein professionelleres Bild zu erzeugen. Der wurde an den Konferenztagen von fast allen Teilnehmern als Teams-Background-Filter genutzt, was ein schönes Bild beim Finale ergab, etwas genormter und authentischer wirkte und zeigte, wie gut das Branding durch die permanente Wiederholung funktioniert hat – es sah gewissermaßen so aus, als ob es eine echte Konferenz gewesen und die Teilnehmer sprächen vor einer Fotoleinwand.

Für die Zukunft: Die Konferenz kann per [Gathertown](https://gather.town/) abgehalten werden, falls dies kostenlos möglich wird oder die FAU die Mittel hierfür bereitstellen kann (dann könnte das Ganze mit mehr Echtheitsflair und etwas interaktiver gestaltet werden, z.B. mit Proximity Chat, Poster aufstellen, man trifft sich zufällig im virtuellen Gang miteinander etc.). Damit wurden schon echte ML-Konferenzen gehalten.


## Checklisten ##

### 1. Zeitplan ###
- [ ] An uncompleted task 

### 2. Abgabe der Papers ###
- [ ] An uncompleted task 

### 3. Abgabe der Reviews ###
- [ ] An uncompleted task 

### 4. Paper Anpassungen ###
- [ ] An uncompleted task 

### 5. Finale Empfehlungen ###
- [ ] An uncompleted task 

### 6. Konferenz ###
- [ ] An uncompleted task 