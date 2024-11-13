package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.model.BaseData;
import de.joergdev.mosy.api.response.EmptyResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Globalconfig", description = "API for managing global configurations")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "globalconfig")
public class Globalconfig
{

  @Operation(summary = "Save global configuration", description = "Save the provided global configuration data.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Global configuration saved successfully."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @PostMapping("/save")
  public ResponseEntity<EmptyResponse> save(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                            @Parameter(description = "Global configuration data to be saved", required = true) @RequestBody BaseData basedata)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    EmptyResponse response = new EmptyResponse();
    return ResponseEntity.ok(response);
  }
}
