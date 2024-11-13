package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.record.session.CreateResponse;
import de.joergdev.mosy.api.response.record.session.LoadSessionsResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(APIConstants.API_URL_BASE + "record-sessions")
@Tag(name = "Record Sessions", description = "API to manage record sessions")
public class RecordSessions
{

  @Operation(summary = "Load sessions", description = "Returns a list of record sessions. Normally returns HTTP 200, but may return HTTP 500.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Sessions loaded successfully", content = @Content(schema = @Schema(implementation = LoadSessionsResponse.class))),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping
  public ResponseEntity<LoadSessionsResponse> loadSessions(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Create session", description = "Creates a new record session. Normally returns HTTP 200, but may return HTTP 500.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Session created successfully", content = @Content(schema = @Schema(implementation = CreateResponse.class))),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/create")
  public ResponseEntity<CreateResponse> create(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Delete session", description = "Deletes a record session by ID. Normally returns HTTP 200, but may return HTTP 500.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Session deleted successfully", content = @Content(schema = @Schema(implementation = EmptyResponse.class))),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token") @RequestHeader("Authorization") String token,
                                              @Parameter(description = "Session ID to delete") @PathVariable("id") Integer id)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }
}
