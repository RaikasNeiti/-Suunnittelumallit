package Teht15;

import java.time.LocalDate;

public class Date extends LegacyDate implements InterfaceDate {
    @Override
    public LocalDate getDate() {
        LegacyDate pvm  = new LegacyDate();
        return LocalDate.of(pvm.getYear(), pvm.getMonth(), pvm.getDay());
    }
}
