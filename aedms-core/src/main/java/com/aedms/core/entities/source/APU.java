package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.envers.Audited;

/**
 * The Entity to representing APP information.
 * The physical table is "APU"
 * 
 * @author jaly
 */
@Entity
@Table(name = "APU")
@Audited
public class APU  implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Column(name = "MODEL")
    private String model;
    
    @Column(name = "SN")
    private String SN;
    
    @Column(name = "MANUFACTURE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date manufactureDate;
    
    @Column(name = "RENT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rentDate;
    
    @Column(name = "LEASE_HOLD")
    private String leaseHold;
    
    @Column(name = "LEASE_HOLDER")
    private String leaseHolder;
    
    @Column(name = "OPR")
    private String opr;
    
    @OneToMany(targetEntity = Engine.class, mappedBy = "aircraft")
    @JoinColumn(name = "APU_ID")
    private Set<APUStatusRec> apuStatusRecs;
    
    @OneToMany(targetEntity = Engine.class, mappedBy = "aircraft")
    @JoinColumn(name = "APU_ID")
    private Set<APUOperationRec> apuOperationRecs;
    
    
    
    @Override
	public String toString() {
		return "APU [id=" + id + ", model=" + model + ", SN=" + SN + ", manufactureDate=" + manufactureDate
				+ ", rentDate=" + rentDate + ", leaseHold=" + leaseHold + ", leaseHolder=" + leaseHolder + ", opr="
				+ opr + "]";
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
     * @return the rentDate
     */
    public Date getRentDate() {
        return rentDate;
    }

    /**
     * @param rentDate the rentDate to set
     */
    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    /**
     * @return the leaseHold
     */
    public String getLeaseHold() {
        return leaseHold;
    }

    /**
     * @param leaseHold the leaseHold to set
     */
    public void setLeaseHold(String leaseHold) {
        this.leaseHold = leaseHold;
    }

    /**
     * @return the leaseHolder
     */
    public String getLeaseHolder() {
        return leaseHolder;
    }

    /**
     * @param leaseHolder the leaseHolder to set
     */
    public void setLeaseHolder(String leaseHolder) {
        this.leaseHolder = leaseHolder;
    }

    /**
     * @return the opr
     */
    public String getOpr() {
        return opr;
    }

    /**
     * @param opr the opr to set
     */
    public void setOpr(String opr) {
        this.opr = opr;
    }

    /**
     * @return the apuStatusRecs
     */
    public Set<APUStatusRec> getApuStatusRecs() {
        return apuStatusRecs;
    }

    /**
     * @param apuStatusRecs the apuStatusRecs to set
     */
    public void setApuStatusRecs(Set<APUStatusRec> apuStatusRecs) {
        this.apuStatusRecs = apuStatusRecs;
    }

    /**
     * @return the apuOperationRecs
     */
    public Set<APUOperationRec> getApuOperationRecs() {
        return apuOperationRecs;
    }

    /**
     * @param apuOperationRecs the apuOperationRecs to set
     */
    public void setApuOperationRecs(Set<APUOperationRec> apuOperationRecs) {
        this.apuOperationRecs = apuOperationRecs;
    }
}
