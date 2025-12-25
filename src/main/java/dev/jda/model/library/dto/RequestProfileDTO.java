package dev.jda.model.library.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "profile", description = "Request Pojo of ProfileDTO")
public class RequestProfileDTO extends RepresentationModel<ProfileDTO> {

    @Size(max = 40)
    @Schema(title = "NAME", requiredMode = Schema.RequiredMode.REQUIRED, description = "A private string variable named name")
    private String name;

    @Size(max = 15)
    @Schema(title = "Code", requiredMode = Schema.RequiredMode.REQUIRED, description = "A string variable named CODE with the value \"ABC123\"")
    private String code;

}
