package org.winprovit.presentation;

import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.winprovit.main.SequenceService;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigInteger;

@Path("/")
@RequestScoped
public class SequenceResource  {

    @Inject
    @RestClient
    SequenceService sequenceService;

    @GET
    @Path("v1/alticci/{n}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Operation(summary = "Get sequence alticci by n", description = "Get sequence alticci by n")
    @APIResponses({
            @APIResponse(responseCode = "200", description = "Sequence Alticci"),
            @APIResponse(responseCode = "404", description = "Resource not found",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)) }),
            @APIResponse(responseCode = "400", description = "Bad request",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)) }),
            @APIResponse(responseCode = "500", description = "Internal error",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)) })
    })
    public Response getSequenceAlticci(@PathParam("n") @NotNull BigInteger n) {
        return Response.status(Response.Status.OK).entity(sequenceService.getSequenceAlticci(n)).build();
    }
}