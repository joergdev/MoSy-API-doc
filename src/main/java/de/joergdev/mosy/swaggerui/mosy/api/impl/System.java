package de.joergdev.mosy.swaggerui.mosy.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.response.EmptyResponse;
import de.joergdev.mosy.api.response.system.LoadBaseDataResponse;
import de.joergdev.mosy.api.response.system.LoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "System", description = "Operations for managing system functionalities")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "/system")
public class System
{

  @Operation(summary = "Logs in the user", description = "Performs user login operation")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Login successful"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/login")
  public ResponseEntity<LoginResponse> login(@RequestBody de.joergdev.mosy.api.request.system.LoginRequest loginRequest)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Logs out the user", description = "Performs user logout operation")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Logout successful"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/logout")
  public ResponseEntity<EmptyResponse> logout(@RequestHeader("Authorization") String token)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Loads base data", description = "Loads base system data")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Base data loaded successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping("/load-basedata")
  public ResponseEntity<LoadBaseDataResponse> loadBaseData(@RequestHeader("Authorization") String token)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Boots the system", description = "Performs system boot")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "System booted successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @PostMapping("/boot")
  public ResponseEntity<EmptyResponse> boot(@RequestHeader("Authorization") String token)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Gets the system state", description = "Retrieves the current state of the system")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "System state retrieved successfully"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping("/state")
  public ResponseEntity<Void> getState()
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Gets the state of a subsystem", description = "Retrieves the state of a specified subsystem")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Subsystem state retrieved successfully"),
                         @ApiResponse(responseCode = "400", description = "Invalid subsystem specified"),
                         @ApiResponse(responseCode = "500", description = "Internal server error")})
  @GetMapping("/state-subsystem/{subsystem}")
  public ResponseEntity<String> getStateSubsystem(@PathVariable String subsystem)
  {
    if (APIConstants.SUBSYSTEM_PERSISTENCE.equals(subsystem))
    {
      return ResponseEntity.ok().build(); // Dummy implementation
    }
    return ResponseEntity.badRequest().body("No subsystem " + subsystem);
  }
}
