package org.itstep.FirmJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Data
public class FirmJson {
    public String id;
    public String name;
    @JsonProperty("cyrilic-name")
    public String cyrilicName;
    public String country;
    public boolean popular;
    public ArrayList<Model> models;
}
