package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.recordconfig.LoadResponse;
import de.joergdev.mosy.api.response.recordconfig.SaveResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "RecordConfig", description = "API for managing record configurations")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "record-config")
public class RecordConfig
{

  @Operation(summary = "Load Record Config", description = "Load a record configuration by its ID.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully loaded record configuration"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping("/{id}")
  public ResponseEntity<LoadResponse> load(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                           @Parameter(description = "ID of the record configuration") @PathVariable Integer id)
  {
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Save Record Config", description = "Save a new or existing record configuration.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully saved record configuration"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                           @Parameter(description = "Record configuration object") @RequestBody RecordConfig recordConfig)
  {
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Delete Record Config", description = "Delete a record configuration by its ID.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully deleted record configuration"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                              @Parameter(description = "ID of the record configuration") @PathVariable Integer id)
  {
    return ResponseEntity.ok().build();
  }
}
