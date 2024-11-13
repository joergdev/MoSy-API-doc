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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.model.MockProfile;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.mockprofile.LoadAllResponse;
import de.joergdev.mosy.api.response.mockprofile.LoadMockDataResponse;
import de.joergdev.mosy.api.response.mockprofile.LoadResponse;
import de.joergdev.mosy.api.response.mockprofile.SaveResponse;
import de.joergdev.mosy.shared.Utils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Mock Profiles", description = "API for managing mock profiles")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "mock-profiles")
public class MockProfiles
{

  @Operation(summary = "Load mock profile by ID", description = "Fetch mock profile using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded mock profile."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{id}")
  public ResponseEntity<LoadResponse> load(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "ID of the mock profile to load", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadResponse response = new LoadResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Load all mock profiles", description = "Fetch all mock profiles with pagination.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded all mock profiles."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping
  public ResponseEntity<LoadAllResponse> loadAll(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                 @Parameter(description = "Number of profiles to load", required = false) @RequestParam(value = "load_count", required = false) Integer loadCount,
                                                 @Parameter(description = "Last loaded profile ID for pagination", required = false) @RequestParam(value = "last_loaded_id", required = false) Integer lastLoadedId)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    LoadAllResponse response = new LoadAllResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Save mock profile", description = "Save provided mock profile data.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully saved mock profile."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @PostMapping("/save")
  public ResponseEntity<SaveResponse> save(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                           @Parameter(description = "Mock profile object to be saved", required = true) @RequestBody MockProfile mockProfile)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    SaveResponse response = new SaveResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Delete mock profile by ID", description = "Delete mock profile using the provided ID.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully deleted mock profile."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @DeleteMapping("/{id}/delete")
  public ResponseEntity<EmptyResponse> delete(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                              @Parameter(description = "ID of the mock profile to delete", required = true) @PathVariable Integer id)
  {
    // Dummy implementation, returning a 200 OK response with an empty body
    EmptyResponse response = new EmptyResponse();
    return ResponseEntity.ok(response);
  }

  @Operation(summary = "Load mock data for mock profile by name or ID", description = "Fetch mock data using mock profile ID or name.")
  @ApiResponses({@ApiResponse(responseCode = "200", description = "Successfully loaded mock data."),
                 @ApiResponse(responseCode = "500", description = "Internal server error.")})
  @GetMapping("/{name}/mockdata")
  public ResponseEntity<LoadMockDataResponse> loadMockData(@Parameter(description = "Authorization token for validation", required = true) @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                           @Parameter(description = "ID or name of the mock profile", required = true) @PathVariable("name") String idOrName)
  {
    MockProfile apiMockProfile = new MockProfile();

    if (Utils.isNumeric(idOrName))
    {
      apiMockProfile.setMockProfileID(Integer.valueOf(idOrName));
    }
    else
    {
      apiMockProfile.setName(idOrName);
    }

    // Dummy implementation, returning a 200 OK response with an empty body
    LoadMockDataResponse response = new LoadMockDataResponse();
    return ResponseEntity.ok(response);
  }
}
