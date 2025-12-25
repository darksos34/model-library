package dev.jda.model.library.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
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
@Schema(title = "profile", description = "Pojo  of a Profile")
public class ProfileDTO extends RepresentationModel<ProfileDTO> {

    @Null
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "URL reference to this object. This is the unique identification and location of this object.”")
    private String url;

    @Null
    @Schema(title = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Unique resource identification of a PROFILE (UUID4)", format = "uuid")
    private String uuid;

    @Size(max = 40)
    @Schema(title = "NAME", requiredMode = Schema.RequiredMode.REQUIRED, description = "A private string variable named name")
    private String name;

    @Size(max = 15)
    @Schema(title = "Code", requiredMode = Schema.RequiredMode.REQUIRED, description = "A string variable named CODE with the value \"ABC123\"")
    private String code;

    @Schema(title = "User", description = "A private string variable named user")
    private String user;

}
