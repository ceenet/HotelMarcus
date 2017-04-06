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
@Table(name = "T_DETAIL_FACTURE")
public class TDetailFacture implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TDFACT_ID")
    private long factId;
    
    @Column(name = "TDFACT_DATE_CREATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dFactDateCreate;
    
    @ManyToOne
   	@JoinColumn(name = "TDFACT_FACTURE", referencedColumnName = "TFACT_ID")
    private TFacture facture;
    
    @ManyToOne
   	@JoinColumn(name = "TDFACT_SCE_ID", referencedColumnName = "TSCE_ID")
    private TService service;
    
    @ManyToOne
   	@JoinColumn(name = "TFACT_USER_MODIF", referencedColumnName = "NOM_UTILISATEUR_PK")
    private User userModif;

    @Column(name = "TDFACT_PRIX")
    private double dFactPrix;
    
    @Column(name = "TDFACT_QTE")
    private long dFactQte;

}
