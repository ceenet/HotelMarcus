/**
 * 
 */
package com.hotel.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author montan
 *
 */
@Entity
@Table(name = "T_CH_RESERVATION")
public class TChambreReservation implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TCH_ID")
    private long chId;
    
    @ManyToOne
   	@JoinColumn(name = "TCH_RES_CHAMBRE", referencedColumnName = "TCH_ID")
    private TChambre chambre;
    
    @ManyToOne
   	@JoinColumn(name = "TCH_RES_RESERVATION", referencedColumnName = "TRES_ID")
    private TReservation reservation;
    
    @Column(name = "TCH_RES_DATE_CREATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;

	public TChambre getChambre() {
		return chambre;
	}

	public void setChambre(TChambre chambre) {
		this.chambre = chambre;
	}

	public TReservation getReservation() {
		return reservation;
	}

	public void setReservation(TReservation reservation) {
		this.reservation = reservation;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public String toString() {
		return "TChambreReservation [chambre=" + chambre + ", reservation=" + reservation + ", dateCreate=" + dateCreate
				+ "]";
	}

    
}
