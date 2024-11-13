package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.model.Record;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.record.LoadAllResponse;
import de.joergdev.mosy.api.response.record.LoadResponse;
import de.joergdev.mosy.api.response.record.SaveResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Records", description = "API for managing records")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "records")
public class Records
{

  @Operation(summary = "Load all records", description = "Returns a list of all records. Normally returns HTTP 200, but may return HTTP 500 in case of errors.", responses = {@ApiResponse(responseCode = "200", description = "Records successfully loaded", content = @Content(schema = @Schema(implementation = LoadAllResponse.class))),
                                                                                                                                                                              @ApiResponse(responseCode = "500", description = "Internal Server Error")})
  @GetMapping
  public ResponseEntity<LoadAllResponse> loadAll(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                                 @Parameter(description = "Maximum number of records to load") @RequestParam(value = "load_count", required = false) Integer loadCount,
                                                 @Parameter(description = "ID of the last loaded record") @RequestParam(value = "last_loaded_id", required = false) Integer lastLoadedId,
                                                 @Parameter(description = "Session ID for the records") @RequestParam(value = "record_session_id", required = false) Integer recordSessionID)
  {

    // Dummy implementation
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Load a record by ID", description = "Returns a single record based on the provided ID. Normally returns HTTP 200, but may return HTTP 500 in case of errors.", responses = {@ApiResponse(responseCode = "200", description = "Record successfully loaded", content = @Content(schema = @Schema(implementation = LoadResponse.class))),
                                                                                                                                                                                                    @ApiResponse(responseCode = "500", description = "Internal Server Error")})
  @GetMapping("/{id}")
  public ResponseEntity<LoadResponse> load(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                           @Parameter(description = "ID of the record to load") @PathVariable("id") Integer id)
  {

    // Dummy implementation
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Save a record", description = "Saves a record. Normally returns HTTP 200, but may return HTTP 500 in case of errors.", responses = {@ApiResponse(responseCode = "200", description = "Record successfully saved", content = @Content(schema = @Schema(implementation = SaveResponse.class))),
                                                                                                                                                            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                           @Parameter(description = "Record object to save") @RequestBody Record record)
  {

    // Dummy implementation
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Delete a record by ID", description = "Deletes a record based on the provided ID. Normally returns HTTP 200, but may return HTTP 500 in case of errors.", responses = {@ApiResponse(responseCode = "200", description = "Record successfully deleted", content = @Content(schema = @Schema(implementation = EmptyResponse.class))),
                                                                                                                                                                                               @ApiResponse(responseCode = "500", description = "Internal Server Error")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                              @Parameter(description = "ID of the record to delete") @PathVariable("id") Integer id)
  {

    // Dummy implementation
    return ResponseEntity.ok().build();
  }

  @Operation(summary = "Delete all records", description = "Deletes all records. Normally returns HTTP 200, but may return HTTP 500 in case of errors.", responses = {@ApiResponse(responseCode = "200", description = "Records successfully deleted", content = @Content(schema = @Schema(implementation = EmptyResponse.class))),
                                                                                                                                                                      @ApiResponse(responseCode = "500", description = "Internal Server Error")})
  @DeleteMapping("/delete")
  public ResponseEntity<EmptyResponse> deleteAll(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token)
  {

    // Dummy implementation
    return ResponseEntity.ok().build();
  }
}
