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
import de.joergdev.mosy.api.model.Interface;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response._interface.LoadResponse;
import de.joergdev.mosy.api.response._interface.SaveResponse;
import de.joergdev.mosy.api.response._interface.method.LoadMockDataResponse;
import de.joergdev.mosy.api.response._interface.method.LoadRecordConfigsResponse;
import de.joergdev.mosy.api.response.record.LoadAllResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Interfaces", description = "API for managing interfaces and their methods")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "interfaces")
public class Interfaces
{

  @Operation(summary = "Load interface by ID", description = "Fetch interface using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded interface."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{id}")
  public ResponseEntity<LoadResponse> load(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "ID of the interface to load", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadResponse response = new LoadResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Save interface", description = "Save provided interface data.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully saved interface."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "Interface object to be saved", required = true) @RequestBody Interface apiInterface)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    SaveResponse response = new SaveResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Delete interface by ID", description = "Delete interface using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully deleted interface."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                              @Parameter(description = "ID of the interface to delete", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    EmptyResponse response = new EmptyResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Load mock data for a method", description = "Fetch mock data for the specified method.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded method mock data."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{i_id}/methods/{m_id}/mockdata")
  public ResponseEntity<LoadMockDataResponse> loadMethodMockData(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                                 @Parameter(description = "ID of the interface", required = true) @PathVariable("i_id") Integer interfaceId,
                                                                 @Parameter(description = "ID of the method", required = true) @PathVariable("m_id") Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadMockDataResponse response = new LoadMockDataResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Load record configs for a method", description = "Fetch record configurations for the specified method.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded record configs."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{i_id}/methods/{m_id}/recordconfigs")
  public ResponseEntity<LoadRecordConfigsResponse> loadMethodRecordConfigs(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                                           @Parameter(description = "ID of the interface", required = true) @PathVariable("i_id") Integer interfaceId,
                                                                           @Parameter(description = "ID of the method", required = true) @PathVariable("m_id") Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadRecordConfigsResponse response = new LoadRecordConfigsResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Load records for a method", description = "Fetch records for the specified method of an interface.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded records."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{i_id}/methods/{m_id}/records")
  public ResponseEntity<LoadAllResponse> loadRecordsForInterfaceMethod(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                                       @Parameter(description = "ID of the interface", required = true) @PathVariable("i_id") Integer interfaceId,
                                                                       @Parameter(description = "ID of the method", required = true) @PathVariable("m_id") Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadAllResponse response = new LoadAllResponse();
    return ResponseEntity.ok(response);
  }

}
