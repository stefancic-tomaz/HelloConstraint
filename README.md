# HelloConstraint

Preprosta interaktivna Android aplikacija za prikaz in upravljanje števca, izdelana v programskem jeziku **Java** z uporabo **XML** in postavitve **ConstraintLayout**.

Projekt je bil razvit v okolju Android Studio kot del šolske naloge pri predmetu Razvoj mobilnih aplikacij.

## Funkcionalnosti

- Prikaz trenutne vrednosti števca.
- Povečevanje vrednosti števca z gumbom **Count**.
- Ponastavitev števca na nič z gumbom **Zero**.
- Prikaz kratkega obvestila z uporabo **Toast**.
- Spreminjanje barve gumba Count glede na sodo ali liho vrednost števca.
- Spreminjanje barve gumba Zero glede na stanje števca.
- Prilagoditev uporabniškega vmesnika za pokončno in ležečo orientacijo ter večje zaslone.

## Uporabljene tehnologije

| Tehnologija | Namen |
|---|---|
| Java | Programska logika in obdelava klikov |
| XML | Oblikovanje uporabniškega vmesnika |
| ConstraintLayout | Razporejanje in poravnava elementov |
| Android Studio | Razvojno okolje |
| Gradle | Gradnja in upravljanje projekta |

## Delovanje aplikacije

Aplikacija vsebuje tri gumbe: **Toast**, **Zero** in **Count**.

Gumb Count povečuje vrednost števca in spreminja svojo barvo glede na sodo ali liho vrednost. Ob povečanju števca se spremeni tudi barva gumba Zero.

Gumb Zero ponastavi števec na vrednost 0 in svojo barvo vrne na sivo. Gumb Toast omogoča prikaz kratkega obvestila na zaslonu.

Uporabniški vmesnik uporablja omejitve ConstraintLayout za pravilno razporeditev elementov na različnih velikostih zaslona.

## Zagon projekta

1. Prenesite ali klonirajte repozitorij.
2. Odprite projekt v Android Studiu.
3. Počakajte, da se zaključi sinhronizacija Gradle.
4. Izberite Android emulator ali fizično napravo.
5. Zaženite aplikacijo z gumbom **Run**.

## Namen projekta

Cilj projekta je spoznati uporabo postavitve ConstraintLayout, obdelavo uporabniških dogodkov, spreminjanje lastnosti gradnikov med izvajanjem ter prilagajanje uporabniškega vmesnika različnim orientacijam in velikostim zaslona.

Projekt je namenjen izključno izobraževalnim namenom.
