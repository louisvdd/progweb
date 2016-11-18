package com.spring.henallux.dataAccess.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="promotion")
public class PromotionEntity 
{
	@Id
	@Column(name="idpromotion")
	private int idPromotion;
	
	@Column(name="amountpourc")
	private double amountPourc;
	
	@Column(name="datebegin")
	private Date dateBegin;
	
	@Column(name="dateend")
	private Date dateEnd;

	public int getIdPromotion() 
	{
		return idPromotion;
	}

	public void setIdPromotion(int idPromotion) 
	{
		this.idPromotion = idPromotion;
	}

	public double getAmountPourc() 
	{
		return amountPourc;
	}

	public void setAmountPourc(double amountPourc) 
	{
		this.amountPourc = amountPourc;
	}

	public Date getDateBegin() 
	{
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) 
	{
		this.dateBegin = dateBegin;
	}

	public Date getDateEnd() 
	{
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) 
	{
		this.dateEnd = dateEnd;
	}	
}

