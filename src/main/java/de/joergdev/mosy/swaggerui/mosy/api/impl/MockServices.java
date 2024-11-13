package de.joergdev.mosy.swaggerui.mosy.api.impl;

import java.util.Map;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import de.joergdev.mosy.api.APIConstants;
import de.joergdev.mosy.api.request.mockservices.CustomRequestRequest;
import de.joergdev.mosy.api.response.mockservices.CustomRequestResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Mock Services", description = "APIs for capturing and processing SOAP, REST and custom requests.")
@RestController
@RequestMapping(APIConstants.API_URL_BASE + "mock-services")
public class MockServices
{

  @Operation(summary = "Capture SOAP request", description = "Captures a SOAP request and returns the response.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @PostMapping(value = "soap/{pth:.+}", produces = "application/xml")
  public ResponseEntity<Void> captureSoap(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Capture SOAP WSDL request", description = "Captures a SOAP WSDL request and returns the response.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "text/html")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true))),
                         @ApiResponse(responseCode = "404", description = "WSDL not found", content = @Content(schema = @Schema(hidden = true)))})
  @GetMapping(value = "soap/{pth:.+}", produces = "text/html")
  public ResponseEntity<Void> captureSoapWsdlRequest(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Capture REST POST request", description = "Captures a REST POST request.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @PostMapping(value = "rest/{pth:.+}")
  public ResponseEntity<Void> captureRestPost(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Capture REST PUT request", description = "Captures a REST PUT request.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @PutMapping(value = "rest/{pth:.+}")
  public ResponseEntity<Void> captureRestPut(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @RequestBody String content)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Capture REST DELETE request", description = "Captures a REST DELETE request.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @DeleteMapping(value = "rest/{pth:.+}")
  public ResponseEntity<Void> captureRestDelete(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Capture REST GET request", description = "Captures a REST GET request.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @GetMapping(value = "rest/{pth:.+}")
  public ResponseEntity<Void> captureRestGet(@PathVariable("pth") String path, @RequestHeader HttpHeaders headers, @RequestParam Map<String, String> params)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }

  @Operation(summary = "Handle custom request", description = "Processes a custom request and returns the response.")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                         @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(hidden = true)))})
  @PostMapping("custom-request")
  public ResponseEntity<CustomRequestResponse> customRequest(@RequestHeader HttpHeaders headers, @RequestBody CustomRequestRequest request)
  {
    return ResponseEntity.ok().build(); // Dummy implementation
  }
}
