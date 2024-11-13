package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.request.tenant.SaveRequest;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.tenant.LoadAllResponse;
import de.joergdev.mosy.api.response.tenant.SaveResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Tenants", description = "API for managing tenants")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "/tenants")
public class Tenants
{

  @Operation(summary = "Loads all tenants", description = "Retrieves all tenants data")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Tenants data loaded successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping
  public ResponseEntity<LoadAllResponse> loadAll()
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Saves tenant data", description = "Saves tenant data provided in the request")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Tenant data saved successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@RequestHeader("Authorization") String token, @RequestBody SaveRequest request)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Deletes a tenant", description = "Deletes the tenant with the specified ID")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Tenant deleted successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@RequestHeader("Authorization") String token, @PathVariable Integer id)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  // Routing methods

  @Operation(summary = "Routes POST request", description = "Routes the POST request to the appropriate subsystem")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Request routed successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/{id}/{pth:.+}")
  public ResponseEntity<String> routePostRequest(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @PathVariable("id") Integer id,
                                                 @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Routes PUT request", description = "Routes the PUT request to the appropriate subsystem")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Request routed successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PutMapping("/{id}/{pth:.+}")
  public ResponseEntity<String> routePutRequest(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @PathVariable("id") Integer id,
                                                @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Routes DELETE request", description = "Routes the DELETE request to the appropriate subsystem")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Request routed successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @DeleteMapping("/{id}/{pth:.+}")
  public ResponseEntity<String> routeDeleteRequest(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @PathVariable("id") Integer id)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Routes GET request", description = "Routes the GET request to the appropriate subsystem")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Request routed successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping("/{id}/{pth:.+}")
  public ResponseEntity<String> routeGetRequest(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @PathVariable("id") Integer id,
                                                @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

}
