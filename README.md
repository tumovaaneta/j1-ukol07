# Svátky

Implementujte kód, který načte seznam svátků z JSON souboru a následně vyhledá seznam svátků pro daný den.

1. Třída `HlavniProgram` už je implementovaná. Po správné implementaci ostatních tříd program po spuštění vypíše, kdo má dnes svátek.
2. V souboru `svatky.json` už jsou připravená data ve vhodném formátu.
3. Upravovat budete třídy `SvatkySluzba` a `Svatek`. Třída `SeznamSvatku` už je implementovaná.
4. Ve třídě `Svatek` implementujte properties `den` a `jmeno`.
   * `den` bude typu `java.time.MonthDay`
   * `jmeno` bude typu `java.lang.String`
5. Ve třídě `SvatkySluzba` (`SeznamSvatku`) už je připravený `ObjectMapper` a cesta k JSON souboru s daty ve fieldu `cestaKDatum`.
6. V konstruktoru `SvatkySluzba` (`SeznamSvatku`) implementujte načtení pomocí `objectMapper`u do fieldu `seznamSvatku`.
7. V metodě `vyhledatSvatkyKeDni()` implementujte vyhledání svátků k zadanému dni a vrácení seznamu jmen.