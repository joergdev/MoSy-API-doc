package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.HttpHeaders;
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
import de.joergdev.mosy.api.response.mockdata.LoadResponse;
import de.joergdev.mosy.api.response.mockdata.SaveResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "MockData", description = "API for handling mock data operations")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "mockdata")
public class MockData
{

  @Operation(summary = "Load mock data by ID", description = "Fetch mock data using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded mock data."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{id}")
  public ResponseEntity<LoadResponse> load(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "ID of the mock data to load", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadResponse response = new LoadResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Save mock data", description = "Save provided mock data.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully saved mock data."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "Mock data object to be saved", required = true) @RequestBody de.joergdev.mosy.api.model.MockData mockdata)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    SaveResponse response = new SaveResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Delete mock data by ID", description = "Delete mock data using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully deleted mock data."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                              @Parameter(description = "ID of the mock data to delete", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    EmptyResponse response = new EmptyResponse();
    return ResponseEntity.ok(response);
  }
}
