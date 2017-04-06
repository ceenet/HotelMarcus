/**
 * 
 */
package com.hotel.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "T_FACTURE")
public class TFacture implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TFACT_ID")
    private long factId;
    
    @Column(name = "TFACT_DATE_CREATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date factDateCreate;
    
    @Column(name = "TFACT_DATE_MODIF")
	@Temporal(TemporalType.TIMESTAMP)
	private Date factDateModif;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "ETAT", length=10)
    private EtatFactureEnum statuId;
    
    @ManyToOne
   	@JoinColumn(name = "TFACT_CH_ID", referencedColumnName = "TCH_ID")
    private TChambre chambre;
    
    @ManyToOne
   	@JoinColumn(name = "TFACT_USER_CREATE", referencedColumnName = "NOM_UTILISATEUR_PK")
    private User userCreate;
    
    @ManyToOne
   	@JoinColumn(name = "TFACT_USER_MODIF", referencedColumnName = "NOM_UTILISATEUR_PK")
    private User userModif;

	

}
