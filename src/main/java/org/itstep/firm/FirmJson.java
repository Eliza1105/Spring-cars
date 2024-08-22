package org.itstep.firm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.itstep.model.ModelJson;


import java.util.ArrayList;

@Data
public class FirmJson {
    public String id;
    public String name;
    @JsonProperty("cyrillic-name")
    public String cyrilicName;
    public String country;
    public boolean popular;
    public ArrayList<ModelJson> models;

}
