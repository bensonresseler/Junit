package org.betavzw.junit;

import java.time.LocalDate;
import java.time.Period;

public class Persoon {private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;

    public Persoon(String voornaam, String achternaam, LocalDate geboortedatum) {
        LocalDate vandaag = LocalDate.now();
        Period periode = Period.between(geboortedatum,vandaag);
        if (voornaam == null || voornaam.equals("")){
            throw new IllegalArgumentException("Voornaam mag niet leeg zijn");
        }
        if (geboortedatum.isAfter(vandaag)){
            throw new IllegalArgumentException("Geboortedatum kan niet in de toekomst liggen.");
        }
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }
}