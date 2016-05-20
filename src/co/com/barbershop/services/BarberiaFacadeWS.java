package co.com.barbershop.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.barbershop.common.model.EmpleadoDTO;
import co.com.barbershop.common.model.LugarDTO;
import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;
import co.com.barbershop.common.model.ServiciosDTO;

@Path("/json/firstpage")
public class BarberiaFacadeWS {
	
	 @GET
	 @Path("/lugares1")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<LugarDTO> getFirstPageDTO() {
	   BarberiaFacade barberiaFacade = BarberiaFacade.getInstane();
	   return barberiaFacade.getLugarPageDTO();
	 }
	 
	 @GET
	 @Path("/servicios1")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<ServiciosDTO> getServiciosPageDTO() {
	   BarberiaFacade barberiaFacade = BarberiaFacade.getInstane();
	   return barberiaFacade.getServiciosPageDTO();
	 }
	 
	 @GET
	 @Path("/empleados1")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<EmpleadoDTO> getEmpleadoPageDTO() {
	   BarberiaFacade barberiaFacade = BarberiaFacade.getInstane();
	   return barberiaFacade.getEmpleadosPageDTO();
	 }
	 
	 @GET
	 @Path("/reservas1")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<ReservasDTO> getReservasPageDTO() {
	   BarberiaFacade barberiaFacade = BarberiaFacade.getInstane();
	   return barberiaFacade.getReservasPageDTO();
	 }
	 
	 @GET
	 @Path("/reservas2")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Reservas2DTO> getReservasPageDTO2() {
	   BarberiaFacade barberiaFacade = BarberiaFacade.getInstane();
	   return barberiaFacade.getReservasPageDTO2();
	 }

}
