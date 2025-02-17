package co.edu.unisabana.parcial.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Generated
public class CheckpointDTO {

  public String facility;

  public String driver;
  @JsonProperty("day_of_month")
  public int dayOfMonth;
}
