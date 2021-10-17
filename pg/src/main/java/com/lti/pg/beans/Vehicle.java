package com.lti.pg.beans;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VEHICLE_ID", length=30)
	private String vehicleId;

	@Column(name="EX_SHOWROOM_PRICE", length=20)
	private float exShowroomPrice;

	@Column(name="ON_ROAD_PRICE", length=20)
	private float onRoadPrice;

	@Column(name="VEHICLE_COLOUR", length=20)
	private String vehicleColour;

	@Column(name="VEHICLE_NAME", length=30)
	private String vehicleName;
	
	@Column(name="VEHICLE_MODEL", length=20)
	private String vehicleModel;

	@Column(name="VEHICLE_TYPE", length=20)
	private String vehicleType;

	@Column(name="VEHICLE_YEAR", length=5)
	private long vehicleYear;

	@OneToOne(mappedBy = "vehicle")
    private Loan loan;

	public Vehicle() {
	}
	
	public String getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}


	public float getExShowroomPrice() {
		return exShowroomPrice;
	}


	public void setExShowroomPrice(float exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}


	public float getOnRoadPrice() {
		return onRoadPrice;
	}


	public void setOnRoadPrice(float onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}


	public String getVehicleColour() {
		return vehicleColour;
	}


	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}


	public String getVehicleName() {
		return vehicleName;
	}


	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	public String getVehicleModel() {
		return vehicleModel;
	}


	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public long getVehicleYear() {
		return vehicleYear;
	}


	public void setVehicleYear(long vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", exShowroomPrice=" + exShowroomPrice + ", onRoadPrice="
				+ onRoadPrice + ", vehicleColour=" + vehicleColour + ", vehicleName=" + vehicleName + ", vehicleModel="
				+ vehicleModel + ", vehicleType=" + vehicleType + ", vehicleYear=" + vehicleYear + ", loan=" + loan
				+ "]";
	}
}
