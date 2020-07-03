# Passaggi per installare pit-hom in locale
1. clonare il progetto "pitest-pit-hom", aprirlo da linea di comando lanciare "mvn install"

2. scrivere nel pom del progetto in cui usare il plugin 

```
<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.5.1-HOM</version>
    <configuration>
        <targetClasses>
            <param>prova.pit.hom.*</param>
        </targetClasses>
        <targetTests>
            <param>prova.pit.hom.*</param>
        </targetTests>
        <hom>3</hom>
        <mutationProcessingMethod>
        </mutationProcessingMethod>
    </configuration>
</plugin>
```
