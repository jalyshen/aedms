package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * The Entity to representing AirCraft. The physical table is "AIRCRAFT_INFO"
 *
 * @author mwang
 * @since 0.1
 *
 */
@Entity
@Table(name = "AIRCRAFT_INFO")
public class AirCraft implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FLEET", length = 20, nullable = true)
    private String fleet;

    @Column(name = "SUB_FLEET", length = 20, nullable = true)
    private String subFleet;

    @Column(name = "SERIAL_NO", length = 20, nullable = true)
    private String serialNo;

    @Column(name = "REGISTER_NO", length = 6, nullable = true)
    private String registerNo;

    @Column(name = "MODEL", length = 6)
    private String model;

    @Column(name = "SN", length = 20)
    private String SN;

    @Column(name = "LN", length = 20)
    private String LN;

    @Column(name = "VARIABLE_NO", length = 5)
    private String variableNo;

    @Column(name = "VIRFRAME_NO", length = 5)
    private String virframeNo;

    @Column(name = "IPC_REF_NO", length = 5)
    private String ipcRefNo;

    @Column(name = "MANUFACTURE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date manufactureDate;

    @Column(name = "LEASING_DELIVERY_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date leasingDeliveryDate;

    @Column(name = "SEL_CAL", length = 5)
    private String selCal;

    @Column(name = "TENANCY_TERM")
    private int tenancyTerm;

    @Column(name = "TYPE_CERTIFICATE", length = 5)
    private String typeCertificate;

    @Column(name = "AFM_CERTIFICATE", length = 5)
    private String afmCertificate;

    @Column(name = "OPERATOR_BASE", length = 20)
    private String operatorBase;

    @Column(name = "OWNER", length = 20)
    private String owner;

    @Column(name = "ENGINE_TYPE", length = 20)
    private String engineType;

    @OneToOne
    @JoinColumn(name = "ENGINE_ONE_ID")
    private Engine engineOneId;

    @OneToOne
    @JoinColumn(name = "ENGINE_TWO_ID")
    private Engine engineTwoId;

    @OneToOne
    @JoinColumn(name = "ENGINE_THREE_ID")
    private Engine engineThreeId;

    @OneToOne
    @JoinColumn(name = "ENGINE_FOUR_ID")
    private Engine engineFourId;

    @Column(name = "SEAT_COUNT")
    private int seatCount;

    @Column(name = "FIRST_SEAT_COUNT")
    private int firstSeatCount;

    @Column(name = "BUS_SEAT_COUNT")
    private int busSeatCount;

    @Column(name = "ECONOMY_SEAT_COUNT")
    private int economySeatCount;

    @Column(name = "MANUFACTURER", length = 30)
    private String manufacturer;

    @Column(name = "ENGINE_MAX_THRUST")
    private int engineMaxThrust;

    @Column(name = "FUEL_CAPACITY")
    private int fuelCapacity;

    @Column(name = "WEIGHT_MAX_TAKEOFF")
    private int weigthMaxTakeOff;

    @Column(name = "WEIGHT_MAX_LANDING")
    private int weightMaxLanding;

    @Column(name = "WEIGHT_MAX_TAXI")
    private int weightMaxTaxi;

    @Column(name = "WEIGHT_EMPTY")
    private int weightEmpty;

    @Column(name = "WEIGHT_ZERO_FUEL")
    private int weightZeroFuel;

    @OneToOne
    @JoinColumn(name = "APU_ID")
    private APU apu;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the fleet
     */
    public String getFleet() {
        return fleet;
    }

    /**
     * @param fleet the fleet to set
     */
    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * @return the subFleet
     */
    public String getSubFleet() {
        return subFleet;
    }

    /**
     * @param subFleet the subFleet to set
     */
    public void setSubFleet(String subFleet) {
        this.subFleet = subFleet;
    }

    /**
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the registerNo
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * @param registerNo the registerNo to set
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the SN
     */
    public String getSN() {
        return SN;
    }

    /**
     * @param SN the SN to set
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * @return the LN
     */
    public String getLN() {
        return LN;
    }

    /**
     * @param LN the LN to set
     */
    public void setLN(String LN) {
        this.LN = LN;
    }

    /**
     * @return the variableNo
     */
    public String getVariableNo() {
        return variableNo;
    }

    /**
     * @param variableNo the variableNo to set
     */
    public void setVariableNo(String variableNo) {
        this.variableNo = variableNo;
    }

    /**
     * @return the virframeNo
     */
    public String getVirframeNo() {
        return virframeNo;
    }

    /**
     * @param virframeNo the virframeNo to set
     */
    public void setVirframeNo(String virframeNo) {
        this.virframeNo = virframeNo;
    }

    /**
     * @return the ipcRefNo
     */
    public String getIpcRefNo() {
        return ipcRefNo;
    }

    /**
     * @param ipcRefNo the ipcRefNo to set
     */
    public void setIpcRefNo(String ipcRefNo) {
        this.ipcRefNo = ipcRefNo;
    }

    /**
     * @return the manufactureDate
     */
    public Date getManufactureDate() {
        return manufactureDate;
    }

    /**
     * @param manufactureDate the manufactureDate to set
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * @return the leasingDeliveryDate
     */
    public Date getLeasingDeliveryDate() {
        return leasingDeliveryDate;
    }

    /**
     * @param leasingDeliveryDate the leasingDeliveryDate to set
     */
    public void setLeasingDeliveryDate(Date leasingDeliveryDate) {
        this.leasingDeliveryDate = leasingDeliveryDate;
    }

    /**
     * @return the selCal
     */
    public String getSelCal() {
        return selCal;
    }

    /**
     * @param selCal the selCal to set
     */
    public void setSelCal(String selCal) {
        this.selCal = selCal;
    }

    /**
     * @return the typeCertificate
     */
    public String getTypeCertificate() {
        return typeCertificate;
    }

    /**
     * @param typeCertificate the typeCertificate to set
     */
    public void setTypeCertificate(String typeCertificate) {
        this.typeCertificate = typeCertificate;
    }

    /**
     * @return the afmCertificate
     */
    public String getAfmCertificate() {
        return afmCertificate;
    }

    /**
     * @param afmCertificate the afmCertificate to set
     */
    public void setAfmCertificate(String afmCertificate) {
        this.afmCertificate = afmCertificate;
    }

    /**
     * @return the operatorBase
     */
    public String getOperatorBase() {
        return operatorBase;
    }

    /**
     * @param operatorBase the operatorBase to set
     */
    public void setOperatorBase(String operatorBase) {
        this.operatorBase = operatorBase;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param engineType the engineType to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /*

    /**
     * @return the seatCount
     */
    public int getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount the seatCount to set
     */
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * @return the firstSeatCount
     */
    public int getFirstSeatCount() {
        return firstSeatCount;
    }

    /**
     * @param firstSeatCount the firstSeatCount to set
     */
    public void setFirstSeatCount(int firstSeatCount) {
        this.firstSeatCount = firstSeatCount;
    }

    /**
     * @return the busSeatCount
     */
    public int getBusSeatCount() {
        return busSeatCount;
    }

    /**
     * @param busSeatCount the busSeatCount to set
     */
    public void setBusSeatCount(int busSeatCount) {
        this.busSeatCount = busSeatCount;
    }

    /**
     * @return the economySeatCount
     */
    public int getEconomySeatCount() {
        return economySeatCount;
    }

    /**
     * @param economySeatCount the economySeatCount to set
     */
    public void setEconomySeatCount(int economySeatCount) {
        this.economySeatCount = economySeatCount;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the engineMaxThrust
     */
    public int getEngineMaxThrust() {
        return engineMaxThrust;
    }

    /**
     * @param engineMaxThrust the engineMaxThrust to set
     */
    public void setEngineMaxThrust(int engineMaxThrust) {
        this.engineMaxThrust = engineMaxThrust;
    }

    /**
     * @return the fuelCapacity
     */
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the weigthMaxTakeOff
     */
    public int getWeigthMaxTakeOff() {
        return weigthMaxTakeOff;
    }

    /**
     * @param weigthMaxTakeOff the weigthMaxTakeOff to set
     */
    public void setWeigthMaxTakeOff(int weigthMaxTakeOff) {
        this.weigthMaxTakeOff = weigthMaxTakeOff;
    }

    /**
     * @return the weightMaxLanding
     */
    public int getWeightMaxLanding() {
        return weightMaxLanding;
    }

    /**
     * @param weightMaxLanding the weightMaxLanding to set
     */
    public void setWeightMaxLanding(int weightMaxLanding) {
        this.weightMaxLanding = weightMaxLanding;
    }

    /**
     * @return the weightMaxTaxi
     */
    public int getWeightMaxTaxi() {
        return weightMaxTaxi;
    }

    /**
     * @param weightMaxTaxi the weightMaxTaxi to set
     */
    public void setWeightMaxTaxi(int weightMaxTaxi) {
        this.weightMaxTaxi = weightMaxTaxi;
    }

    /**
     * @return the weightEmpty
     */
    public int getWeightEmpty() {
        return weightEmpty;
    }

    /**
     * @param weightEmpty the weightEmpty to set
     */
    public void setWeightEmpty(int weightEmpty) {
        this.weightEmpty = weightEmpty;
    }

    /**
     * @return the weightZeroFuel
     */
    public int getWeightZeroFuel() {
        return weightZeroFuel;
    }

    /**
     * @param weightZeroFuel the weightZeroFuel to set
     */
    public void setWeightZeroFuel(int weightZeroFuel) {
        this.weightZeroFuel = weightZeroFuel;
    }

    /**
     * @return the engineOneId
     */
    public Engine getEngineOneId() {
        return engineOneId;
    }

    /**
     * @param engineOneId the engineOneId to set
     */
    public void setEngineOneId(Engine engineOneId) {
        this.engineOneId = engineOneId;
    }

    /**
     * @return the engineTwoId
     */
    public Engine getEngineTwoId() {
        return engineTwoId;
    }

    /**
     * @param engineTwoId the engineTwoId to set
     */
    public void setEngineTwoId(Engine engineTwoId) {
        this.engineTwoId = engineTwoId;
    }

    /**
     * @return the engineThreeId
     */
    public Engine getEngineThreeId() {
        return engineThreeId;
    }

    /**
     * @param engineThreeId the engineThreeId to set
     */
    public void setEngineThreeId(Engine engineThreeId) {
        this.engineThreeId = engineThreeId;
    }

    /**
     * @return the engineFourId
     */
    public Engine getEngineFourId() {
        return engineFourId;
    }

    /**
     * @param engineFourId the engineFourId to set
     */
    public void setEngineFourId(Engine engineFourId) {
        this.engineFourId = engineFourId;
    }

    /**
     * @return the apu
     */
    public APU getApu() {
        return apu;
    }

    /**
     * @param apu the apu to set
     */
    public void setApu(APU apu) {
        this.apu = apu;
    }

    /**
     * @return the tenancyTerm
     */
    public int getTenancyTerm() {
        return tenancyTerm;
    }

    /**
     * @param tenancyTerm the tenancyTerm to set
     */
    public void setTenancyTerm(int tenancyTerm) {
        this.tenancyTerm = tenancyTerm;
    }
}