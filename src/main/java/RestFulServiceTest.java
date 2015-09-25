import org.jboss.ejb3.annotation.SecurityDomain;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author mhajas
 */
@Stateless
@SecurityDomain("keycloak")
@DeclareRoles("keycloak_admin")
@Path("/")
public class RestFulServiceTest {

    @GET
    @Path("sayHello")
    @RolesAllowed("keycloak_admin")
    //@PermitAll
    public String hello() {
        return "Hello World";
    }
}
