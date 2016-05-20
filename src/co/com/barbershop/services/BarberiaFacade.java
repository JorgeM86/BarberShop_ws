package co.com.barbershop.services;
import java.util.List;

import co.com.barbershop.common.model.*;
import co.com.barbershop.common.services.PageLugar;
import co.com.barbershop.common.services.PageReservas;
import co.com.barbershop.common.services.PageServicios;
import co.com.barbershop.common.services.PageEmpleados;
import co.com.barbershop.services.PageReservasImple;
import co.com.barbershop.services.PageLugarImple;
import co.com.barbershop.services.PageServiciosImple;

public class BarberiaFacade {
	
	private BarberiaFacade(){
		super();
	}

	private static BarberiaFacade barberiaFacade;

	public static BarberiaFacade getInstane(){
	if(barberiaFacade == null){
		barberiaFacade = new BarberiaFacade();
	}	
		return barberiaFacade;
	}
	
	public List<LugarDTO> getLugarPageDTO(){
		PageLugar lugarPageDTO = new PageLugarImple();
		lugarPageDTO.getLugarPageDTO();
		return lugarPageDTO.listLugar();
	}
	
	public List<ServiciosDTO> getServiciosPageDTO(){
		PageServicios empleadosPageDTO = new PageServiciosImple();
		empleadosPageDTO.getServiciosPageDTO();
		return empleadosPageDTO.listServicios();
	}
	
	public List<EmpleadoDTO> getEmpleadosPageDTO(){
		PageEmpleados empleadosPageDTO = new PageEmpleadosImple();
		empleadosPageDTO.getEmpleadosPageDTO();
		return empleadosPageDTO.listEmpleados();
	}
	
	public List<ReservasDTO> getReservasPageDTO(){
		PageReservas reservasPageDTO = new PageReservasImple();
		reservasPageDTO.getReservasPageDTO();
		return reservasPageDTO.listReservas();
	}
	
	public List<Reservas2DTO> getReservasPageDTO2(){
		PageReservas reservasPageDTO = new PageReservasImple();
		reservasPageDTO.getReservasPageDTO();
		return reservasPageDTO.listReservas2();
	}

}
