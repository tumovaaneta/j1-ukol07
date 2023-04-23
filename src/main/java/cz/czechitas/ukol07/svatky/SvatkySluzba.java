package cz.czechitas.ukol07.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Path;
import java.time.MonthDay;
import java.util.List;

public class SvatkySluzba {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();
    private final Path cestaKDatum = Path.of("svatky.json");
    private final SeznamSvatku seznamSvatku;

    public SvatkySluzba() throws IOException {
        seznamSvatku = objectMapper.readValue(cestaKDatum.toFile(), SeznamSvatku.class);
    }

    public List<String> vyhledatSvatkyDnes() {
        return vyhledatSvatkyKeDni(MonthDay.now());
    }

    public List<String> vyhledatSvatkyKeDni(MonthDay day) {
//        seznamSvatku.getSvatky();
//        seznamSvatku.getSvatky().stream();
//        seznamSvatku.getSvatky().stream().filter(svatek -> svatek.getDen().equals(day));
//        seznamSvatku.getSvatky().stream().filter(svatek -> svatek.getDen().equals(day)).map(svatek -> svatek.getJmeno());
//        seznamSvatku.getSvatky().stream().filter(svatek -> svatek.getDen().equals(day)).map(svatek -> svatek.getJmeno()).toList();
        return seznamSvatku.getSvatky().stream().filter(svatek -> svatek.getDen().equals(day)).map(svatek -> svatek.getJmeno()).toList();
    }
}
